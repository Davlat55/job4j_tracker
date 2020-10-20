package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private int gruppa;
    private Date startEducation;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGruppa() {
        return gruppa;
    }

    public void setGruppa(int gruppa) {
        this.gruppa = gruppa;
    }

    public Date getStartEducation() {
        return startEducation;
    }

    public void setStartEducation(Date startEducation) {
        this.startEducation = startEducation;
    }

}
