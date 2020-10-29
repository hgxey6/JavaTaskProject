/*Задание 20.26
Напишите метод, который принимает в качестве параметра массив целых чисел.
Метод возвращает массив, который содержит номера ячеек, в которых
записаны «уникальные», то есть встречающиеся только один(!) раз,
значения.*/

package javaEDU.javabasictasks.Section20ArraySum;

public class Section20Task26 {
    final static int min = 0, max = 10;

    public static void main(String[] args) {
        int[] array = new int[5 + (int) ((20 - 5 + 1) * Math.random())];//Range(5, 20)
        int[] newArray = new int[array.length];

        fill(array);
        verify(array, newArray);

        System.out.print("\nUnique index: ");
        for (int i : newArray)
            System.out.print(i + " ");
    }

    private static void fill(int[] array) { // Присваивание
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) ((max - min + 1) * Math.random());
            System.out.print(array[i] + " ");
        }
    }

    private static void verify(int[] array, int[] newArray) { //Проверка
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int unique = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    unique++;
                }
            }
            if (unique == 1) {
                newArray[index] = i;
                index++;
            }
        }
    }
}