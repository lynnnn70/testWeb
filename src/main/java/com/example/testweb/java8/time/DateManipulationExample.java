package com.example.testweb.java8.time;

import java.time.LocalDate;

public class DateManipulationExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Next Month: " + nextMonth);
        System.out.println("Last Year: " + lastYear);
    }
}
