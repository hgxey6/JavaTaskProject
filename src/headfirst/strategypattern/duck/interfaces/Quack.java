package headfirst.strategypattern.duck.interfaces;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack"); //Живые утки
    }
}
