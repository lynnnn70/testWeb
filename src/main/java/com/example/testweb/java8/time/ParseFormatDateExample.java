package com.example.testweb.java8.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseFormatDateExample {
    public static void main(String[] args) {
        // 解析日期
        LocalDate date = LocalDate.parse("2023-12-03", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);

        // 格式化日期
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formatted Date: " + formattedDate);

        String formatDate = date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(formatDate);
    }

}
