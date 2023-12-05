package com.example.testweb.java8.optional;

import java.util.Optional;

public class OptionalOrElseExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);

        // 如果Optional為空，則提供一個預設值
        String value = opt.orElse("Default Value");
        System.out.println(value);

        // 使用Supplier介面為空值提供動態值
        String anotherValue = opt.orElseGet(() -> "Computed Value");
        System.out.println(anotherValue);
    }
}
