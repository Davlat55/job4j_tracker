package ru.job4j.oop;

public class Usage {
    public static void main(String[] args) {
        Vehicle Plane = new Plane();
        Vehicle Train = new Train();
        Vehicle Bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{Plane, Train, Bus};
        for (Vehicle a : vehicles) {
            a.move();
            //a.polza();
        }


    }
}
