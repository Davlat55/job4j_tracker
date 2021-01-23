package ru.job4j.oop;

public class Goose extends DomesticAnimal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Га-га");
    }
}
