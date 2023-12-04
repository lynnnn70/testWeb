package com.example.testweb.java8.functional;

import java.util.function.Function;

public class FunctionExample {
    //Function<T, R> 介面接受一個輸入參數T，並返回一個結果R。
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = (String s) -> s.length();
        int length = lengthFunction.apply("Hello, Function!");
        System.out.println("String length: " + length);
    }
}
