package com.example.testweb.java8.lambda;

import java.util.Arrays;

public class LambdaComparatorExample {
    public static void main(String[] args) {
        String[] words = {"Zebra", "Elephant", "Monkey", "Lion"};

        Arrays.sort(words, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(words));
    }
}
