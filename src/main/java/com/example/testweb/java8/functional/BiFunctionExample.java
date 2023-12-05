package com.example.testweb.java8.functional;

import java.util.function.BiFunction;

public class BiFunctionExample {
    //BiFunction<T, U, R> 介面表示接受兩個輸入參數並返回一個結果的函數。
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumFunction = (Integer a, Integer b) -> a + b;
        int result = sumFunction.apply(10, 20);
        System.out.println("Sum: " + result);
    }
}
