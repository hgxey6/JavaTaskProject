package javaEDU.oop.companytask;

import java.time.LocalDate;

public abstract class Person {

    private String name;
    private LocalDate dateOfBirth;  // Дата рож.
    private String SEX; // Пол

    public Person() {
    }

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void move() {
        System.out.println("Ходит");
    }

    public void sleep() {
        System.out.println("Спит");
    }

    public void eat() {
        System.out.println("Кушает");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }
}
