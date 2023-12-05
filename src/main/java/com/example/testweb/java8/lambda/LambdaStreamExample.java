package com.example.testweb.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("春天", "夏天", "秋天", "冬天");
        List<String> result = lines.stream()
                .filter(line -> !"夏天".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
