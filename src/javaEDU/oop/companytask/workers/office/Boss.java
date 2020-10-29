package javaEDU.oop.companytask.workers.office;

import javaEDU.oop.companytask.interfaces.Leadable;

import java.time.LocalDate;

public class Boss extends Manager implements Leadable {
    public Boss(String name, LocalDate dateOfBirth, double salary) {
        super(name, dateOfBirth, salary);
    }

    @Override
    public void lead() {
        System.out.println("Руководит отделом");
    }

    @Override
    public void control() {
        super.control();
    }


}
