package javaEDU.cayhorstmanncorejava.nestedСlasses;

public class AnonClass {
    public void foo() {
        System.out.println("Foo");
    }



}

class Main {
    public static void main(String[] args) {
        AnonClass bar = new AnonClass() {
            @Override
            public void foo() {
                System.out.print("Bar");
            }
        };

        bar.foo();
    }
}
