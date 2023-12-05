package com.example.testweb.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filtered = strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(filtered); // [apple]
    }
}
