package com.example.testweb.generic;

import java.util.HashSet;

public class EqualTest {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setT("123");

        Box<String> box2 = new Box<>();
        box2.setT("123");

        HashSet<Box<String>> set = new HashSet<>();
        set.add(box1);
        set.add(box2);
        System.out.println(set);

//        HashSet<String> set = new HashSet<>();
//        set.add("123");
//        set.add("456");
//        set.add("123");
//        System.out.println(set);
    }
}
