package com.example.testweb.java8.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // 獲取當前日期和時間與時區
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current Date and Time with Timezone: " + now);

        // 指定時區
        ZonedDateTime dateInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current Date and Time in Tokyo: " + dateInTokyo);

    }
}
