package com.example.testweb.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
//    public static void main(String[] args) {
//        List<String> items = Arrays.asList("蘋果", "香蕉", "櫻桃", "日期");
//        items.forEach(item -> System.out.println(item));
//    }

    public static void main(String [] args){
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        List<String> result = items.stream()
                .filter(i -> !"Date".equals(i))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
