package javaEDU.oop.companytask.workers;

import javaEDU.oop.companytask.Person;
import javaEDU.oop.companytask.interfaces.Workable;

import java.time.LocalDate;

public abstract class Worker extends Person implements Workable {
    private double salary;
    private int experience; // стаж

    public Worker() {
    }

    @Override
    public void toWork() {
        System.out.println("Работает");
    }

    public Worker(String name, LocalDate dateOfBirth, double salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
