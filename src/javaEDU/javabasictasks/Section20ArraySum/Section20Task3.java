/*Задание 20.3
Напишите класс, который генерирует серию из 2000 целых случайных чисел
из диапазона О ... 9999. Класс должен определять, сколько раз в серии встречались однозначные
числа, сколько раз двузначные, сколько раз трехзначные, сколько раз четырехзначные.
Итоговую информацию следует вывести на экран */
package javaEDU.javabasictasks.Section20ArraySum;

public class Section20Task3 {
    final static int min = 0, max = 9999, arraySize = 2000; // Константы

    public static void main(String[] args) {
        int[] array = new int[arraySize];
        fill(array);

        int singleDigitNumbers = 0, twoDigitNumbers = 0;
        int tripleDigitNumbers = 0, fourDigitNumbers = 0;

        for (int i = 0; i < arraySize; i++) {
            if (array[i] < 10) singleDigitNumbers++;
            else if (10 <= array[i] && array[i] < 100) twoDigitNumbers++;
            else if (100 <= array[i] && array[i] < 1000) tripleDigitNumbers++;
            else fourDigitNumbers++;

        }

        System.out.println("Single Digit Numbers: " + singleDigitNumbers);
        System.out.println("Two-Digit Numbers: " + twoDigitNumbers);
        System.out.println("Triple-Digit Numbers: " + tripleDigitNumbers);
        System.out.println("Four-Digit Numbers: " + fourDigitNumbers);
    }

    private static void fill(int[] array) { // Присваиваем массиву числа
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) ((max - min + 1) * Math.random());
        }
    }

}
