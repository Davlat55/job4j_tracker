package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        animal cow = new Cow();
        animal goose = new Goose();
        animal dog2 = new Dog2();
        animal guineaPig = new GuineaPig();

        animal[] animals = new animal[]{cow, goose, dog2, guineaPig};
        for (animal a : animals) {
            a.sound();
            a.polza();
        }


    }
}
