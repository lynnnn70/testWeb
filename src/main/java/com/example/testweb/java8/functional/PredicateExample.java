package com.example.testweb.java8.functional;

import java.util.function.Predicate;

public class PredicateExample {
    //Predicate<T> 介面表示一個參數的布爾值函數。
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (Integer i) -> i > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));
    }
}
