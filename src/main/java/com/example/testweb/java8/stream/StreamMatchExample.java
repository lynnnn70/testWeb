package com.example.testweb.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        boolean anyMatch = strings.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("Any match 'a': " + anyMatch); // true

        boolean allMatch = strings.stream().allMatch(s -> s.length() > 3);
        System.out.println("All have length > 3: " + allMatch); // true

        boolean noneMatch = strings.stream().noneMatch(s -> s.startsWith("z"));
        System.out.println("None match 'z': " + noneMatch); // true
    }

}
