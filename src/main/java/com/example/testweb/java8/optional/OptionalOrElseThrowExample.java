package com.example.testweb.java8.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();

        // 如果Optional為空，拋出異常
        String value = opt.orElseThrow(() -> new IllegalStateException("值不能為空"));
        System.out.println(value);
    }
}
