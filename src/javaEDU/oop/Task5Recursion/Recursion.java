package javaEDU.oop.Task5Recursion;

public class Recursion {
    public static void main(String[] args) {
        recursion(3, 9);
    }

    public static int recursion(int a, int b) {
        if (a == b) {
            return 0;
        } else if (b > a) {
            System.out.println(a + 1);
            return recursion(a + 1, b);
        } else {
            System.out.println(a - 1);
            return recursion(a - 1, b);
        }
    }

}
