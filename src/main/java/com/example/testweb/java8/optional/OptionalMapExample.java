package com.example.testweb.java8.optional;

import java.util.Optional;

public class OptionalMapExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("java");

        // 使用map轉換Optional
        Optional<String> upperOpt = opt.map(String::toUpperCase);
        upperOpt.ifPresent(System.out::println); // JAVA

        // 使用flatMap連接Optional函數
        Optional<Optional<String>> wrapped = Optional.of(opt);
        Optional<String> flatMapped = wrapped.flatMap(o -> o);
        flatMapped.ifPresent(System.out::println); // java


    }
}
