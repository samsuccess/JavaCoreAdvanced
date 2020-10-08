package homework5;

public class ReWriter {

    public void reWrite(float arr[], int h) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) *
                    Math.cos(0.4f + (i + h) / 2));
        }
    }
}
