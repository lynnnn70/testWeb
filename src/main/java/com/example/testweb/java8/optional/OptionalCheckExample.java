package com.example.testweb.java8.optional;

import java.util.Optional;

public class OptionalCheckExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("Java");

        // 如果值存在，則打印它
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

        // 或者更簡潔的方式
        opt.ifPresent(System.out::println);
    }
}
