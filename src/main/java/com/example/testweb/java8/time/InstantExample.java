package com.example.testweb.java8.time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {
        // 當前時刻
        Instant now = Instant.now();
        System.out.println("Current Timestamp: " + now);

        // 某時刻後的一段時間
        Instant later = now.plus(1, ChronoUnit.DAYS);
        System.out.println("One day later: " + later);
    }
}
