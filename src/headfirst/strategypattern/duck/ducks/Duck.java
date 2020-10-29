package headfirst.strategypattern.duck.ducks;

import headfirst.strategypattern.duck.interfaces.FlyBehavior;
import headfirst.strategypattern.duck.interfaces.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performQuack() { // Делегирование операции классом поведения
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void display() {
        System.out.println("I'm a duck");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
