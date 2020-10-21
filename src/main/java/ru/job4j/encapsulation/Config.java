package ru.job4j.encapsulation;

public class Config {
    private String name;                        // 1
    private int position;                       // 2
    private String[] properties;                // 3

    public Config(String name) {
        this.name = name;
    }
    public void print() {                        // 3
        System.out.println(position);
    }

    public String getProperty(String key) {       // 4
        return search(key);
    }   // 4

    private String search(String key) {            //5
        return key;
    }
}
