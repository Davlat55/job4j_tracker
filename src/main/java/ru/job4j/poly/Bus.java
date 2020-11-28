package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void drive() {
        System.out.println("We're going!");
    }

    @Override
    public void passengers(int passenger) {
        passenger  =  Integer.valueOf(scanner.nextLine());
        System.out.println("We have " + passenger + " passengers");
    }

    @Override
    public float fill(int gas) {
      gas = Integer.valueOf(scanner.nextLine());

        float cost = gas * 45;

        System.out.println("We filled up " + gas + "liters for " + cost + " rubles");
        return 0;
    }
}
