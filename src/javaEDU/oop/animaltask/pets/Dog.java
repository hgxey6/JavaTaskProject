package javaEDU.oop.animaltask.pets;

import javaEDU.oop.animaltask.interf.Huntable;

public class Dog extends Pet implements Huntable {

    public Dog(String food, String location, String name) {
        super(food, location, name);
    }

    public void swim() {
        System.out.println("Собака плывет по речке");
    }

    public void protect() {
        System.out.println("Собака защищает дом");
    }

    @Override
    public void hunt() {
        System.out.println("Собака охотиться");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
    }


}
