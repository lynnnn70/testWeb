package com.example.testweb.methodreference;

import java.util.function.Consumer;
//實例方法引用（特定對象）
public class InstanceMethodReferenceExample {
    public static void main(String[] args) {
        InstanceMethodReferenceExample example = new InstanceMethodReferenceExample();
        Consumer<String> consumer = example::printUpperCase;
        consumer.accept("hello");
        System.out.println("=======上面是使用方法引用====");
        Consumer<String> consumer1 = (String s) -> example.printUpperCase(s);
        consumer1.accept("hello");
        System.out.println("=======上面是使用Lambda=====");
        example.printUpperCase("hello");
    }

    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}
