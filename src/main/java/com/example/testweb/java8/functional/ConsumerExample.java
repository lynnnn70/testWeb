package com.example.testweb.java8.functional;

import java.util.function.Consumer;

public class ConsumerExample {
    //Consumer<T> 介面表示接受單個輸入參數且不返回結果的操作。
    // 有輸入參數 沒有輸出參數
    public static void main(String[] args) {
        Consumer<String> printConsumer = (String s) -> System.out.println(s);
        printConsumer.accept("Hello, Consumer!");
    }
}
