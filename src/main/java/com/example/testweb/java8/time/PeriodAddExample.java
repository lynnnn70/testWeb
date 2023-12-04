package com.example.testweb.java8.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodAddExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);
        Period period = Period.ofMonths(6); // 6個月的Period

        LocalDate laterDate = date.plus(period);
        System.out.println("Six months later: " + laterDate);
    }
}
