package com.example.testweb.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceExample {
//靜態方法引用
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry");
        words.forEach(StaticMethodReferenceExample::printWord);
        System.out.println("=====上面使用靜態方法引用========");
        words.forEach(word -> StaticMethodReferenceExample.printWord(word));
        System.out.println("=====上面使用lambda========");
        for(String word : words){
            printWord(word);
        }
        System.out.println("=====傳統for each======");
    }
    //如果是靜態static的方法,依照java的設計,可直接使用類別呼叫
    public static void printWord(String word) {
        System.out.println(word);
    }

}
