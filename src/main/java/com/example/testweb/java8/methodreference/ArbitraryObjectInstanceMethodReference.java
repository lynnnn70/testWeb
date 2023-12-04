package com.example.testweb.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectInstanceMethodReference {
    //實例方法引用（任意對象的特定類型）
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");
        strings.forEach(String::toUpperCase);
        System.out.println("======上面使用實例方法引用=========");
        strings.forEach(str -> str.toUpperCase());
        System.out.println("======上面使用Lambda=========");
        for(String str : strings){
            str.toUpperCase();
        }
    }
}
