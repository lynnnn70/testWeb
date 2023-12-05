package com.example.testweb.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class ThisInstanceMethodReference {
//特定類的實例方法引用（使用 this）
    public static void main(String[] args) {
        ThisInstanceMethodReference example = new ThisInstanceMethodReference();
        example.runExamplesByInstanceMethodReference();
        System.out.println("=====上面使用限定實例this=====");
        example.runExamplesByLambda();
        System.out.println("=====上面使用lambda==========");
    }

    public void runExamplesByInstanceMethodReference() {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        list.forEach(this::printLanguages);
    }

    public void runExamplesByLambda(){
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        list.forEach(s -> printLanguages(s));
    }

    private void printLanguages(String lang) {
        System.out.println(lang);
    }
}
