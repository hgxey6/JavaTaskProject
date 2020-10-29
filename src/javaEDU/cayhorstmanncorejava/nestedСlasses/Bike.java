package javaEDU.cayhorstmanncorejava.nestedСlasses;

public class Bike {
    private String name;
    private int weight;

    private int seatPostDiameter;

    /**
     * Конструктор велосипеда.
     *
     * @param name             название модели.
     * @param weight           вес модели.
     * @param seatPostDiameter диаметр сиденья.
     */
    public Bike(String name, int weight, int seatPostDiameter) {
        this.name = name;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class Seat {

        public void up() {
            System.out.println("Сиденье поднято выше!");
        }

        public void down() {
            System.out.println("Сиденье опущено ниже!");
        }

        public void getSeatParam() {
            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bike.this.seatPostDiameter);
        }

        public int getSeatPostDiameter() {
            return Bike.this.seatPostDiameter;
        }
    }
}
