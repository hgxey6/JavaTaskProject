package headfirst.strategypattern.weapons.persons;

import headfirst.strategypattern.weapons.interfaces.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {
    }

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void display() {
        System.out.println("Я воин");
    }
}
