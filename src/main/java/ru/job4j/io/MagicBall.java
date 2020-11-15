package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.println( question );
        String tekst = " ";
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 1:
                tekst = "Да";
                break;
            case 2:
                tekst = "Нет";
                break;
            case 3:
                tekst = "Может быть";
                break;
        }
        System.out.println(tekst);
    }
}
