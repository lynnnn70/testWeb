package com.example.testweb.java8.time;

import java.time.Period;

public class PeriodParseExample {
    public static void main(String[] args) {
        Period period = Period.parse("P2Y3M10D"); // P2Y3M10D表示2年3個月10天

        System.out.println("Parsed Period: " + period);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
