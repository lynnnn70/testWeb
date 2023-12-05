package com.example.testweb.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("蘋果", "香蕉", "櫻桃", "日期");
        items.forEach(item -> System.out.println(item));
    }
}
