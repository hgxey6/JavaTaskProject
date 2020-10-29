package headfirst.strategypattern.weapons.interfaces;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Стрельба из лука");
    }
}
