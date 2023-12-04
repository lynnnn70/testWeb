package com.example.testweb.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedLists = Arrays.asList(
                Arrays.asList("Apple", "Banana", "Cherry"),
                Arrays.asList("Date", "Fig", "Grape"),
                Arrays.asList("Melon", "Nectarine", "Orange")
        );

        // 使用flatMap將嵌套列表扁平化為單個流
        List<String> flatList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
