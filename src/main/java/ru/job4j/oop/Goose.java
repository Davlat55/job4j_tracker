package ru.job4j.oop;

public class Goose implements animal {
        @Override
        public void sound() {
            System.out.println(getClass().getSimpleName() + " произносит звук: Га-га");
        }

    public void polza() {
        System.out.println(" приносит перо для подушек.");
    }
}
