package com.example.testweb.java8.functional;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    //BiConsumer<T, U> 介面表示接受兩個輸入參數且不返回結果的操作。
    public static void main(String[] args) {
        BiConsumer<String, Integer> printFormat = (String s, Integer i) -> System.out.println(s + " " + i);
        printFormat.accept("Age:", 30);
    }
}
