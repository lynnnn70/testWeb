package com.example.testweb.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> sorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted); // [apple, banana, cherry, date]
    }
}
