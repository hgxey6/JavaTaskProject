package javaEDU.core;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        randomGiving(array);
        print(array);
        Arrays.sort(array);
        print(array);
    }

     public static void randomGiving(int[] array) {
        int max = 99, min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) ((max - min + 1) * Math.random());
        }
    }

    public static void print(int[] array) {
        System.out.print("Array: ");
        for (int value : array) System.out.print(value + " ");
        System.out.println();
    }
}
