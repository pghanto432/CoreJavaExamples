package com.demo;

import java.util.*;

class SortByLength implements Comparator<String> {
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
}

public class StringExamples {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        System.out.println("Unsorted:");
        for (String word : words) {
            System.out.println(word);
        }

        Collections.sort(words, new SortByLength());

        System.out.println("\nSorted by Length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
