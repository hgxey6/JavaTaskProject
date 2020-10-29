package javaEDU.oop.car;

public class Bike extends Transport implements Driveable{
    private int numberOfSpeed;

    public Bike() {
    }

    public Bike(int wheelNumbers, boolean hasEngine, int numberOfSpeed) {
        super(wheelNumbers, hasEngine);
        this.numberOfSpeed = numberOfSpeed;
    }

    public void stop(){
        System.out.println("Стоп");
    }

    public int getNumberOfSpeed() {
        return numberOfSpeed;
    }

    public void setNumberOfSpeed(int numberOfSpeed) {
        this.numberOfSpeed = numberOfSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Байк едет");
    }
}
