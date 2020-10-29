package headfirst.strategypattern.weapons.interfaces;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Удар мечом");
    }
}
