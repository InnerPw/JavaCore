package ru.geekbrains.core.lesson4.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        HashMap<String, Integer> uniqueWords = new HashMap<>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("two");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("nine");
        words.add("ten");
        words.add("six");

        //Collections.sort(words);
        System.out.println(words);

        for (String word : words) {
            if (!uniqueWords.containsKey(word)) {
                uniqueWords.put(word, 1);
            } else {
                int value = uniqueWords.get(word);
                uniqueWords.replace(word, ++value);
            }
        }

        System.out.println(uniqueWords);
    }
}
