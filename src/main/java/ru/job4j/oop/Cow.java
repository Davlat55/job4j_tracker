package ru.job4j.oop;

public class Cow extends DomesticAnimal {
    public void giveMilk() {
        System.out.println(nameClass + " дает человеку молоко.");
    }
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
