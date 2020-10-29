package javaEDU.oop.com.company.vehicles;

import javaEDU.oop.com.company.details.Engine;
import javaEDU.oop.com.company.professions.Driver;

public class SportCar extends Car{
    private final int speed;

    public SportCar(String brand, String carClass, double weight, Driver driver,
                    Engine engine, int speed) {
        super(brand, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
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
        System.out.println("Max speed: " + speed + " km/h");
        System.out.println();
    }
}
