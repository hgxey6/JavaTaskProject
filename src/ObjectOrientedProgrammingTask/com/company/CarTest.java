package ObjectOrientedProgrammingTask.com.company;

import ObjectOrientedProgrammingTask.com.company.vehicles.*;
import ObjectOrientedProgrammingTask.com.company.professions.Driver;
import ObjectOrientedProgrammingTask.com.company.details.Engine;

public class CarTest {
    public static void main(String[] args) {
        Driver driver = new Driver("Chris Brown", 40, 5);
        Engine engine = new Engine(500, "USA");

        Car car = new Car("Audi", "minivan", 5.25, driver ,engine);
        car.printInfo();

        Lorry lorry = new Lorry("Nissan", "lorry", 11.33, driver,
                engine, 5000);
        lorry.printInfo();

        SportCar sportCar = new SportCar("Bugatti", "sport", 2, driver,
                engine, 300);
        sportCar.printInfo();
    }
}
