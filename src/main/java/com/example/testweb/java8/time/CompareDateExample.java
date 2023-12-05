package com.example.testweb.java8.time;

import java.time.LocalDate;

public class CompareDateExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 12, 3);
        LocalDate date2 = LocalDate.of(2024, 1, 1);

        boolean isBefore = date1.isBefore(date2);
        boolean isAfter = date1.isAfter(date2);

        System.out.println("Is date1 before date2? " + isBefore);
        System.out.println("Is date1 after date2? " + isAfter);
    }
}
