package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        animal animal = new animal();
        animal domesticAnimal = new DomesticAnimal();
        animal cow = new Cow();
        animal goose = new Goose();
        animal pet = new Pet();
        animal dog2 = new Dog2();
        animal guineaPig = new GuineaPig();

        animal[] animals = new animal[]{animal, cow, goose, pet, dog2, guineaPig};
        for (animal a : animals) {
            a.sound();
        }
    }
}
