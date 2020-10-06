package homework5;

import java.util.Arrays;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;
    static ReWriter reWriter = new ReWriter();
    static float[] arr = new float[size];

    public static void main(String[] args) {

        reWrite1(arr);
        reWrite2(arr);

    }

    public static void reWrite1(float[] array) {

        Arrays.fill(array, 1);

        long start = System.currentTimeMillis();

        reWriter.reWrite(array);

        long stop = System.currentTimeMillis();
        System.out.println(arr[8999999]);
        System.out.println("Время выполнения в один поток " + (stop - start) + " миллисекунд");
    }

    public static void reWrite2(float[] array) {

        Arrays.fill(array, 1);

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        long start = System.currentTimeMillis();

        System.arraycopy(array, 0, arr1, 0, h);
        System.arraycopy(array, h, arr2, 0, h);

        Thread t1 = new Thread(() -> {
            reWriter.reWrite(arr1);
        });
        Thread t2 = new Thread(() -> {
            reWriter.reWrite(arr2);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, array, 0, h);
        System.arraycopy(arr2, 0, array, h, h);

        long stop = System.currentTimeMillis();

        System.out.println(arr[8999999]);
        System.out.println("Время выполнения в два потока " + (stop - start) + " миллисекунд");
    }
}



