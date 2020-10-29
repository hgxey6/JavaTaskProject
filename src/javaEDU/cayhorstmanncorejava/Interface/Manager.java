package javaEDU.cayhorstmanncorejava.Interface;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
}
