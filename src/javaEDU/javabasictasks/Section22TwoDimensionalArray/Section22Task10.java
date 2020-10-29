/*Задание 22.10
Напишите метод, который получает в качестве параметра двумерныймассив целых чисел
и возвращает сумму массива (сумму всех значений в массиве).*/

//Попробовать extends
package javaEDU.javabasictasks.Section22TwoDimensionalArray;

public class Section22Task10 extends Section22Task6 {
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        //Наследуем и исользуем метод setNumbers и write
        setNumbers(array);
        write(array);
        System.out.println("Sum = " + sum(array));
    }

    private static int sum(int[][] array) {
        int arraySum = 0;

        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                arraySum += ints[j];
            }
        }
        return arraySum;
    }
}