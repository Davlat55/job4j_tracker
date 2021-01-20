package ru.job4j.oop;

public class Cow implements animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
