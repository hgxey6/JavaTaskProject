/*Задание 22.6
Напишите метод, который получает в качестве параметра двумерный массив целых чисел.
Метод возвращает массив, заполненный случайными числами из диапазона 10 ... 99 по следующему правилу:
все ячейки первой строки заполнены первым сгенерированным случайным числом;
все ячейки второй строки заполнены вторым сгенерированным случайным числом и так далее.*/
package javaEDU.javabasictasks.Section22TwoDimensionalArray;

import java.util.Scanner;

public class Section22Task6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Пишем нужный размер массива
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        setNumbers(array);
        write(array);
    }

    //Заполняем массив
    protected static void setNumbers(int[][] array) {
        int down = 10, up = 99; // верхняя и нижняя граница чисел

        for (int i = 0; i < array.length; i++) {
            int k = down + (int) ((up - down + 1) * Math.random());
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = k;
            }
        }
    }

    //Выводим на консоль
    protected static void write(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
