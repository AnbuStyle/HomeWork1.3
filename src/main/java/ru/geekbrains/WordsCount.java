package ru.geekbrains;

import java.util.*;

public class WordsCount {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        arr.add("Agile");
        arr.add("Java");
        arr.add("Moscow");
        arr.add("Meta");
        arr.add("Tech");
        arr.add("Error");
        arr.add("Moscow");
        arr.add("Agile");
        arr.add("Tech");
        arr.add("Meta");
        arr.add("Meta");
        arr.add("Meta");


        Map<String, Integer>  curr = new HashMap<>();
        for (String word : arr) {
            Integer count = curr.get(word);
            if (count == null) {
                count = 0;
            }
            curr.put(word, count + 1);
        }

        System.out.println(curr);

    }
}
