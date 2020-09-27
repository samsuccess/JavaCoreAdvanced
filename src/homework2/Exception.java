package homework2;

public class Exception {

    static int SIZE = 4;

    public static void main(String[] args) {



        String[][] array = {
                {"5", "54", "45", "3"},
                {"21", "6", "45", "0"},
                {"5", "8", "45", "15"},
                {"5", "54", "t561", "0"},
        };

        System.out.println(sumConvert(array));

    }

    static int sumConvert(String[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr.length != SIZE) || (arr[i].length != SIZE)) {
                    throw new MyArraySizeException("Неверный размер массива");
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректное содержимое ячейки массива " + arr[i][j]);
                }
            }
        }
        return sum;
    }
}



