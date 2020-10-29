package javaEDU.oop.com.company.vehicles;

import javaEDU.oop.com.company.professions.Driver;
import javaEDU.oop.com.company.details.Engine;

public class Car {
    // марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine
    private final String brand;
    private final String carClass;
    private final double weight;
    private Driver driver; //Водителя можно сменить
    private final Engine engine;

    //Конструктор
    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Classification: " + carClass);
        System.out.println("Weight: " + weight + " t");
        System.out.println("Driver: " + driver.getFullName() +
                ", experience: " + driver.getExperience() + " year, age: " + driver.getAge());
        System.out.println("Engine power: " + engine.getPower() + " kwt" +
                ", made in " + engine.getCompany());
        System.out.println();
    }

    public String getBrand() {
        return brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
