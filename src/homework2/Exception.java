package homework2;

public class Exception {

    public static void main(String[] args) {
        String[][] array = {
                {"5", "54", "45", "3"},
                {"21", "6", "45", "0"},
                {"5", "8", "45", "15"},
                {"5", "54", "t561", "0"},
        };

        System.out.println(convertation(array));

    }

    static int convertation(String[][] arr) {

        int convert = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr.length != 4) || (arr[i].length != 4)) {
                    throw new MyArraySizeException("Неверный размер массива");
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    convert = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректное содержимое ячейки массива " + arr[i][j]);
                }
                sum += convert;
            }
        }
        return sum;

    }

//    static boolean status(String arr) {
//        try {
//            Integer.parseInt(arr);
//            throw new MyArrayDataException();
//        } catch (MyArrayDataException e){
//            System.out.println(" Элемент массива вызывает ошибку");
//        }


//        return true;
}



