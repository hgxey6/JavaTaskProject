package javaEDU.oop.car;

public class Car extends Transport implements Driveable{
    private boolean sportCar;

    public Car() {

    }

    public Car(int wheelNumbers, boolean hasEngine, boolean sportCar) {
        super(wheelNumbers, hasEngine);
        this.sportCar = sportCar;
    }

    public void Stop() {
        System.out.println("Стоп");
    }

    public void driveBack() {
        System.out.println("Машина едет назад");
    }

    public boolean isSportCar() {
        return sportCar;
    }

    public void setSportCar(boolean sportCar) {
        this.sportCar = sportCar;
    }

    @Override
    public void drive() {
        System.out.println("Машина едет");
    }
}
