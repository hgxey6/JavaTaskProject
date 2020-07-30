/*Задание 22.28
Внутренний элемент двумерного массива называется «локальным максимумом»,
если его значения больше значений всех 8 соседних ячеек.
Глобальный максимум массива это самое большое значение, которое в нем находится.

1)
Напишите метод, который получает в качестве параметра двумерный массив целых чисел
и два дополнительных целых параметра С и К, определяющих местоположение внутреннего элемента массива.
Метод должен проверить, является ли данный элемент массива локальным максимумом.
2)
Напишите метод, который получает в качестве параметра двумерный массив целых чисел
и выводит на экран координаты всех локальных максимумов. */
package JavaBasicTasks.Section22TwoDimensionalArray;

import java.util.Scanner;

public class Section22Task28 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Задаем размер
        System.out.println("Введите размер");
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("m: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        setNumbers(array); // Задать массиву рандомные числа числа
        print(array); // вывод на консоль

        System.out.println("Задайте параметры (параметры нужны для проверки array[c][k] == localMax)");
        System.out.print("Параметр С: ");
        int c = scanner.nextInt();
        System.out.print("Параметр K: ");
        int k = scanner.nextInt();

        //Первое условие задачи
        System.out.println("1) Является ли элемент array[c][k] локальным максимумом : "
                + verifyLocalMax(array, c, k));
        //Второе условие задачи
        System.out.println("2) Максимальные локальные элементы");
        printLocalMaxElementIndex(array);
    }

    private static void setNumbers(int[][] array) {
        System.out.print("Мин. значение элемента массива : ");
        int down = scanner.nextInt();
        System.out.print("Maкс. значение элемента массива: ");
        int up = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = down + (int) ((up - down + 1) * Math.random());
            }
        }
    }

    private static void print(int[][] array) {
        for (int[] i : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(i[j] + "\t");
            }
            System.out.println();
        }
    }

    //Первый метод задачи
    private static boolean verifyLocalMax(int[][] array, int c, int k) {
        try {
            int i = 1;
            int localMax = array[c][0];
            while (i < array[0].length) {
                if (localMax < array[c][i]) localMax = array[c][i];
                i++;
            }
            return localMax == array[c][k];
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    //Второй метод задачи
    private static void printLocalMaxElementIndex(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int localMax = array[i][0];
            int y = 0;

            for (int j = 0; j < array[0].length; j++) {
                if (localMax < array[i][j]) {
                    localMax = array[i][j];
                    y = j;
                }
            }
            System.out.println(localMax + ": [" + i + ", " + y + "]");
        }
    }
}
