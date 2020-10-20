package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        Student.setFio("Petr Arsenev");

        System.out.println(Student.getFio());
    }
}
