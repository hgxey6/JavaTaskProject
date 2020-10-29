package javaEDU.oop.companytask.workers.office;

import javaEDU.oop.companytask.interfaces.Controllable;
import javaEDU.oop.companytask.workers.Worker;

import java.time.LocalDate;

public class Manager extends Worker implements Controllable {
    private double salaryBonus = 0;

    @Override
    public void control() {
        System.out.println("Контролирует");
    }

    public Manager(String name, LocalDate dateOfBirth, double salary) {
        super(name, dateOfBirth, salary);
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

}
