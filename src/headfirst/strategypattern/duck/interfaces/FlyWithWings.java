package headfirst.strategypattern.duck.interfaces;

public class FlyWithWings implements FlyBehavior { // Те, которые летают крыльями
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
