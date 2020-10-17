package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    LocalDateTime currentDateTime = LocalDateTime.now();

    public class SetUI {
        public static String createdFormat;
        public static String currentDateTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdFormat = currentDateTime.format(formatter);
    }

    public static void main(String[] args) {
        System.out.println("Текущие дата и время после форматирования: " + SetUI.createdFormat);
    }
}