package com.example.testweb.java8.time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2).plusMinutes(30);

        Duration duration = Duration.between(start, end);
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());
    }
}
