package ru.job4j.oop;

public class Cow extends DomesticAnimal {
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
