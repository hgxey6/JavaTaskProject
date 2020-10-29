package headfirst.strategypattern.duck.ducks;

import headfirst.strategypattern.duck.interfaces.FlyNoWay;
import headfirst.strategypattern.duck.interfaces.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
