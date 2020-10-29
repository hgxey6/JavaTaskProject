/*Задание 18.14
Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива следующим образом:
в первой строке - первую половину массива;
во второй строке - вторую половину массива.
В случае если массив имеет нечетный размер, центральную ячейку
следует выводить в первой строке.*/
package javaEDU.javabasictasks.Section18Array;

import java.util.Scanner;

public class Section18Task14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Massif size: ");
        int min = 100, max = 999; // Трехзначное число
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        random(array, min, max);

        int halfMassifSize = (array.length % 2 == 0) ? array.length / 2 : (array.length / 2) + 1;

        System.out.print("First Line: ");
        for (int i = 0; i < halfMassifSize; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nSecond Line: ");
        for (int i = halfMassifSize; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void random(int[] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = min + (int) ((max - min + 1) * Math.random()); // Конструкция рандома
        }
    }
}
