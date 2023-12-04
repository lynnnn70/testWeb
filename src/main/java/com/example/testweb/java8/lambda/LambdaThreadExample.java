package com.example.testweb.java8.lambda;

public class LambdaThreadExample {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("在新線程中運行")).start();
    }
}
