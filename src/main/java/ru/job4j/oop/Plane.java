package ru.job4j.oop;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летает по воздуху.");
    }

    public void avail() {
        System.out.println("Может быстро доставит пассажиров в далекие города.");
    }

}
