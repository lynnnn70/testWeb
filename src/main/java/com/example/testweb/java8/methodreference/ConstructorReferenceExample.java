package com.example.testweb.java8.methodreference;

import java.util.function.Supplier;

public class ConstructorReferenceExample {
    //建構子引用
    public static void main(String[] args) {
        constructorReference();
        System.out.println("========上面使用建構子引用===========");
        lambda();
        System.out.println("========上面使用lambda==============");
        normal();


    }

    public static void constructorReference(){
        Supplier<StringBuilder> supplier = StringBuilder::new;
        StringBuilder stringBuilder = supplier.get();
        stringBuilder.append("Hello, Constructor Reference!");
        System.out.println(stringBuilder);
    }
    public static void lambda(){
        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        StringBuilder stringBuilder = supplier.get();
        stringBuilder.append("Hello, Constructor Lambda!");
        System.out.println(stringBuilder.toString());
    }

    public static void normal(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, It is normal!");
        System.out.println(stringBuilder.toString());
    }

}
