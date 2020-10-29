package javaEDU.oop.animaltask.wild;

import javaEDU.oop.animaltask.Animal;
import javaEDU.oop.animaltask.interf.Huntable;
import javaEDU.oop.animaltask.pets.Pet;

public class Wolf extends Animal implements Huntable {
    public Wolf() {

    }
    public Wolf(String food, String location) {
        super(food, location);
    }

    //Полиморфизм
    public void fight(Pet pet) {
        System.out.println("Волк дерется с " + pet.getName());
    }

    @Override
    public void hunt() {
        System.out.println("Волк охотится");
    }

    @Override
    public void makeNoise() {
        System.out.println("РРРРРРР");
    }
}
