/*Задание 19.21
Напишите метод, который получает в качестве параметра массив и
заполняет его случайными двузначными числами так, чтобы значения
элементов в массиве не повторялись.*/
// НЕ РЕШЕН
package CayHorstmannCoreJava.Section19ArrayAndMethods;

import java.util.Scanner;

public class Section19Task21 {
    static Scanner scanner = new Scanner(System.in);
    static int min = 0, max = 10;

    public static void main(String[] args) {
        System.out.print("Massive size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        //func(array, arraySize);
    }

    /*private static void func(int[] arr, int size) {
        int k = 0;
        do {
            arr[k] = min + (int) ((max - min + 1) * Math.random());
        } while (k < size); {

        }
    }*/
}
