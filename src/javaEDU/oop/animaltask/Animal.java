package javaEDU.oop.animaltask;

import javaEDU.oop.animaltask.interf.MakeNoise;

public abstract class Animal implements MakeNoise {

    private String food;
    private String location;

    public Animal() {
    }

    //Конструктор
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    //Общие методы для всех наследников (методы Суперкласса)
    public void sleep() {
        System.out.println("Животное спит");
    }

    public void eat() {
        System.out.println("Животное ест " + food);
    }

    // Геттеры и сеттеры
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
