package GrokkingAlgorithms.Recursion;

import java.util.Scanner;

public class RecursionFactorial {
    private static long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(factorial(n));
    }
}
