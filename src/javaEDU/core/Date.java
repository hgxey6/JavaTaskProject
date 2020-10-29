package javaEDU.core;

import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println(timeNow);
        timeNow = timeNow.withYear(1666);
        System.out.println("\nТеперь текущее время " + timeNow);
    }
}
