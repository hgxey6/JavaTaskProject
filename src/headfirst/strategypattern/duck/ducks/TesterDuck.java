package headfirst.strategypattern.duck.ducks;

import headfirst.strategypattern.duck.interfaces.FlyNoWay;
import headfirst.strategypattern.duck.interfaces.MuteQuack;

public class TesterDuck extends Duck {
    public TesterDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("Test");
    }
}
