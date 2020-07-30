/*Задание 22.5
Напишите метод, который получает в качестве параметра двумерный массив целых чисел размером 6х14.
Метод возвращает массив, заполненный случайными числами из диапазона 30 ... 125.*/
package JavaBasicTasks.Section22TwoDimensionalArray;

import java.util.Scanner;

public class Section22Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Пишем нужный размер массива
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        setNumbers(array);
        write(array);
    }

    //Заполняем массив
    private static void setNumbers(int[][] array) {
        int down = 30, up = 125; // верхняя и нижняя граница чисел

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = down + (int) ((up - down + 1) * Math.random());
            }
        }
    }
    //Выводим на консоль
    private static void write(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
