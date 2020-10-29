package headfirst.strategypattern.weapons.interfaces;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Удар ножом");
    }
}
