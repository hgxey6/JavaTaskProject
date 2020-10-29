package headfirst.strategypattern.weapons.interfaces;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Удар топором");
    }
}
