package javaEDU.oop.animaltask.pets;

import javaEDU.oop.animaltask.Animal;

public abstract class Pet extends Animal {
    private String name; // Домашнее животное имеет свое имя

    public Pet() {

    }

    public Pet(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " спит");
    }

    public void eat() {
        System.out.println(name + " ест");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
