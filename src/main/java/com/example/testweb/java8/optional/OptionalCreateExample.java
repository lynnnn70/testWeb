package com.example.testweb.java8.optional;

import java.util.Optional;

public class OptionalCreateExample {
    public static void main(String[] args) {
        // 空的Optional對象
        Optional<String> emptyOpt = Optional.empty();

        // 包含值的Optional對象
        Optional<String> opt = Optional.of("Hello");

        // 可能為null的Optional對象
        String maybeNull = null;
        Optional<String> nullableOpt = Optional.ofNullable(maybeNull);
    }
}
