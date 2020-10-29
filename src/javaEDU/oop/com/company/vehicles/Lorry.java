package javaEDU.oop.com.company.vehicles;

import javaEDU.oop.com.company.details.Engine;
import javaEDU.oop.com.company.professions.Driver;

public class Lorry extends Car {
    private final double carrying;

    public Lorry(String brand, String carClass, double weight, Driver driver,
                 Engine engine, double carrying) {
        super(brand, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    public void printInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Classification: " + getCarClass());
        System.out.println("Weight: " + getWeight()+ " t");
        System.out.println("Driver: " + getDriver().getFullName() +
                ", experience: " + getDriver().getExperience() + " year, age: " +
                getDriver().getAge());
        System.out.println("Engine power: " + getEngine().getPower() + " kwt" +
                ", made in " + getEngine().getCompany());
        System.out.println("Lifting capacity: " + carrying + " kg");
        System.out.println();
    }
}
