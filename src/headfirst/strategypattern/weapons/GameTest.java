package headfirst.strategypattern.weapons;

import headfirst.strategypattern.weapons.interfaces.AxeBehavior;
import headfirst.strategypattern.weapons.persons.Character;
import headfirst.strategypattern.weapons.persons.Knight;

public class GameTest {
    public static void main(String[] args) {
        Character person = new Knight();
        person.display();
        person.fight();
        person.setWeapon(new AxeBehavior());
        person.fight();
    }
}
