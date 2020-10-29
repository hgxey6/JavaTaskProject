package headfirst.strategypattern.duck;

import headfirst.strategypattern.duck.ducks.Duck;
import headfirst.strategypattern.duck.ducks.ModelDuck;
import headfirst.strategypattern.duck.interfaces.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
