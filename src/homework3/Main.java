package homework3;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = {
                "мама", "папа", "бабушка", "дедушка",
                "брат", "сестра", "мама", "папа",
                "брат", "племянник", "дядя", "тётя"
        };

        System.out.println(Arrays.toString(arr));

        Map<String, Integer> list = new HashMap<>();
        for (String x: arr) {
            list.put(x, list.getOrDefault(x, 0) + 1);
        }
        
//        for (int i = 0; i < arr.length; i++) {
//            String val = arr[i];
//            Integer count = list.getOrDefault(val, 0);
//            list.put(val, count + 1);
//        }
        System.out.println(list);

//        ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
//
//        PhoneBook sub1 = new Sub("Иванов","458923");
//        phoneBooks.add(sub1);
//
//        System.out.println();




        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "784556");
        phoneBook.add("Петров", "712564");
        phoneBook.add("Сидоров", "821546");
        phoneBook.add("Иванов", "4579812");
        System.out.println(phoneBook.get("Иванов"));
    }
}




