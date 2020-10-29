package javaEDU.oop.car;

public abstract class Transport {

    private int wheelNumbers;
    private boolean hasEngine;

    public Transport() {
    }

    public Transport(int wheelNumbers, boolean hasEngine) {
        this.wheelNumbers = wheelNumbers;
        this.hasEngine = hasEngine;
    }

    public void drive() {
        System.out.println("Транспорт едет");
    }

    public void turn() {
        System.out.println("Вкючение...");
    }

    public int getWheelNumbers() {
        return wheelNumbers;
    }

    public void setWheelNumbers(int wheelNumbers) {
        this.wheelNumbers = wheelNumbers;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }
}
