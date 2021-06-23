package ru.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {

        Phonebook book = new Phonebook();

        book.add("Пушкин", "+7 (999) 000 00 01");
        book.add("Иванов", "+7 (999) 000 00 02");
        book.add("Петров", "+7 (999) 000 00 03");
        book.add("Сидоров", "+7 (999) 000 00 04");
        book.add("Иванов", "+7 (999) 000 00 05");
        book.add("Васильев", "+7 (999) 000 00 06");

        System.out.println(book.get("Иванов"));
        System.out.println(book.get("Петров"));
        System.out.println(book.get("Пушкин"));
        System.out.println(book.get("Васильев"));

    }

    private final Map<String, List<String>> book = new HashMap<>();
                                            //было тут
    public void add(String surname, String phone_number) {
        List<String> phone_number_list; // идея предложила перенести конструкцию в данное поле
        if (book.containsKey(surname)) {  // не совсем понятно зачем, было изначально выше ^
            phone_number_list = book.get(surname);
        } else {
            phone_number_list = new ArrayList<>();
        }
        phone_number_list.add(phone_number);
        book.put(surname, phone_number_list);

    }

    public List<String> get(String surname) {
        return book.get(surname);
    }
}
