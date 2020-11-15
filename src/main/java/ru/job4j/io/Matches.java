package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        System.out.println("На столе 11 спичек, каждый игрок берет от 1 до 3 спичек");
        System.out.println("Кто заберет последные спички, тот победитель");
        while (run) {
            for (int i = 1; i < 4; i++) {
                System.out.println("Сейчас на столе " + matches + " спичек");
                System.out.println("Cпички берет игрок " + i);
                int select = Integer.valueOf(input.nextLine());
                if (select <= 3) {
                    matches = matches - select;
                    if (matches <= 0) {
                        System.out.println("Победил игрок № " + i);
                        run = false;
                        break;
                    }
                } else
                    System.out.println("Надо брать до 3 спичек. Ход переходит следующему игроку!");
            }
        }
    }
}
