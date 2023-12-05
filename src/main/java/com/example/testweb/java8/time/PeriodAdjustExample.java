package com.example.testweb.java8.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodAdjustExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);
        Period tenDays = Period.ofDays(10);

        LocalDate tenDaysLater = date.plus(tenDays);
        System.out.println("Ten days later: " + tenDaysLater);
    }
}
