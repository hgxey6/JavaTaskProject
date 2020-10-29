package headfirst.strategypattern.duck.ducks;

import headfirst.strategypattern.duck.interfaces.FlyWithWings;
import headfirst.strategypattern.duck.interfaces.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
