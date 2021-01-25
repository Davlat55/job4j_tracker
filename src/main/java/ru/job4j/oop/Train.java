package ru.job4j.oop;

public class Train implements Vehicle{
    public void move() {
        System.out.println(getClass().getSimpleName() + " Едет по рельсам.");
    }
    public void avail() {
        System.out.println("Может перевезти большие объемы грузов.");
    }
}
