package geekbrains.home3.online;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "a", "b", "d", "e", "j", "qq", "qs",
                "a", "b", "c", "t", "j", "qw", "qt");

        Set<String> unique = new HashSet<String>(list);

        System.out.println("Слова");
        System.out.println(list.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(list, key));
        }


        System.out.println("Книга");
        Phonebook phonebook = new Phonebook();
        System.out.println("Создаем базу");
        phonebook.add("Игнат", "223344");
        phonebook.add("Олег", "22334411");
        phonebook.add("Игорь", "22334499");
        phonebook.add("Игорь", "22334488");
        phonebook.add("Вася", "22334422");
        System.out.println("Получаем номера");
        System.out.println("Игнат");
        System.out.println(phonebook.get("Игнат"));
        System.out.println("Олег");
        System.out.println(phonebook.get("Олег"));
        System.out.println("Игорь");
        System.out.println(phonebook.get("Игорь"));
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        phonebook.add("Игнат", "223344");
        System.out.println("Игнат");
        System.out.println(phonebook.get("Игнат"));
    }
}

