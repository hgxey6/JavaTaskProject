package javaEDU.oop.animaltask;

import javaEDU.oop.animaltask.pets.Cat;
import javaEDU.oop.animaltask.pets.Dog;
import javaEDU.oop.animaltask.pets.Horse;
import javaEDU.oop.animaltask.pets.Pet;
import javaEDU.oop.animaltask.wild.Wolf;

public class Main {

    public static void main(String[] args) {
        Pet[] pets = new Pet[3]; // 3 Домашних животных
        pets[0] = new Cat("Мышь", "Дом", "Мурка");
        pets[1] = new Dog("Кость", "Сарай", "Мухтар");
        pets[2] = new Horse("Сноп сена", "Конюшня", "Тулпар");

        //Проверка животных
        Veterinarian v = new Veterinarian();
        for (Pet p: pets)
            v.treatAnimal(p);

        System.out.println();
        Wolf wolf = new Wolf();
        Dog dog = (Dog) pets[1];
        wolf.fight(dog);
    }
}
