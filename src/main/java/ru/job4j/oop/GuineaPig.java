package ru.job4j.oop;

public class GuineaPig implements animal {
        @Override
        public void sound() {
            System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");
        }

    public void runInWheel() {
        System.out.println(" любит побегать в колесе.");
    }
}
