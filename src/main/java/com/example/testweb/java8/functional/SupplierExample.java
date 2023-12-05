package com.example.testweb.java8.functional;

import java.util.function.Supplier;

public class SupplierExample {
    //Supplier<T> 介面代表一個結果供應商，沒有輸入參數。
    // 沒有輸入參數 有輸出參數
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
    }
}
