package javaEDU.oop.animaltask.pets;

public class Horse extends Pet {

    public Horse() {
    }

    public Horse(String food, String location, String name) {
        super(food, location, name);
    }

    public void jump() {
        System.out.println("Лошадь прыгает");
    }

    public void ride() {
        System.out.println("Лошадь скачет");
    }

    @Override
    public void makeNoise() {
        System.out.println("Иха");
    }
}
