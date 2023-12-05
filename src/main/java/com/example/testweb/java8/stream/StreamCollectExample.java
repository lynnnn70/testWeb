package com.example.testweb.java8.stream;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<String> collected = Stream.of("apple", "banana", "cherry", "date")
                .collect(Collectors.toList());

        System.out.println(collected); // [apple, banana, cherry, date]
    }

}
