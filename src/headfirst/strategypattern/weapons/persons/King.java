package headfirst.strategypattern.weapons.persons;

import headfirst.strategypattern.weapons.interfaces.AxeBehavior;

public class King extends Character {
    public King() {
        weapon = new AxeBehavior(); // У короля золотой топор!
    }

    public void display() {
        System.out.println("Я король");
    }
}
