package headfirst.strategypattern.duck.interfaces;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak"); // Резиновые утки пищат
    }
}
