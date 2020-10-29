package headfirst.strategypattern.weapons.persons;

import headfirst.strategypattern.weapons.interfaces.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior(); // У благородного рыцаря есть меч
    }

    public void display() {
        System.out.println("Я рыцарь!");
    }
}
