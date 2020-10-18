package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    LocalDateTime created = LocalDateTime.now();

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE--yyyy HH:mm:ss");
    private String createdformat = created.format(formatter);

    public String getformatter() {
        return createdformat;
    }

    public void setFormatter(String createdformat) {
        this.createdformat = created.format(formatter);
    }

    public class StartUI {
        String createdFormat = DateTimeFormatter.format(String.valueOf(formatter));
    }



    public static void main(String[] args) {

        String vremya = getformatter();
        System.out.println("Текущие дата и время после форматирования: " + vremya);
    }
}