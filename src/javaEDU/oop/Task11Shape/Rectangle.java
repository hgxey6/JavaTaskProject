package javaEDU.oop.Task11Shape;

class Rectangle extends Shape {

    public void draw() {
        for (int i = 2; i < 6; i++) {
            for (int j = -5; j < 6; j++) {
                System.out.print("+");
            }
            System.out.println("*");
        }
    }
}
