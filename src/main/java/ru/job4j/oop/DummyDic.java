package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng){
        String vords = "Неизвестное слово " + eng;
       return vords;
    }

    public static void main(String[] args) {
        DummyDic string = new DummyDic();
        System.out.println(string.engToRus("Bitch"));
    }

}
