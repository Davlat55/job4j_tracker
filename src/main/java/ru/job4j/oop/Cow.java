package ru.job4j.oop;

//public class Cow extends DomesticAnimal {
    public class Cow implements animal {
    public void giveMilk() {
        System.out.println(" дает человеку молоко.");
    }
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }

}
