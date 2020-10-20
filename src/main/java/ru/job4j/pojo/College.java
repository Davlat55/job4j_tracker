package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Petr Arsenev");
        student.setGruppa(2);
        student.setStartEducation("01-09-2020");

        System.out.printf("%s %d %s %n", student.getFio(), student.getGruppa(), student.getStartEducation());
    }
}
