package javaEDU.oop.animaltask.pets;

import javaEDU.oop.animaltask.interf.Huntable;

public class Cat extends Pet implements Huntable {

    public Cat() {
    }

    public Cat(String food, String location, String name) {
        super(food, location, name);
    }

    public void  play() {
        System.out.println("Кошка играет с мышкой");
    }

    @Override
    public void hunt() {
        System.out.println("Кошка охотится на мышь");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мррррр");
    }
}


