package com.example.testweb.java8.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeUnitsExample {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plusHours(5).plusMinutes(30);

        long hoursBetween = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        long minutesBetween = ChronoUnit.MINUTES.between(dateTime1, dateTime2);

        System.out.println("Hours between: " + hoursBetween);
        System.out.println("Minutes between: " + minutesBetween);
    }
}
