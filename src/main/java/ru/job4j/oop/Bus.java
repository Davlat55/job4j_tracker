package ru.job4j.oop;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Может ехать по дорогам.");
    }

    public void avail() {
        System.out.println("Очень удобен для туризма.");
    }
}
