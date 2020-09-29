package homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = {
                "мама", "папа", "бабушка", "дедушка",
                "брат", "сестра", "мама", "папа",
                "брат", "племянник", "дядя", "тётя"
        };

        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String val = arr[i];
            Integer count = list.getOrDefault(val, 0);
            list.put(val, count + 1);
        }
        System.out.println(list);

//        ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
//
//        PhoneBook sub1 = new Sub("Иванов","458923");
//        phoneBooks.add(sub1);
//
//        System.out.println();




        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", "784556");
        phoneBook.put("Петров", "712564");
        phoneBook.put("Сидоров", "821546");
        System.out.println(phoneBook.get("Иванов"));
    }
}




