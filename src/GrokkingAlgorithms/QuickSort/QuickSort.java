package GrokkingAlgorithms.QuickSort;

import java.util.Arrays;

// Очень сложный алгоритм
public class QuickSort {
    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int m = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < m) {
                i++;
            }

            while (array[j] > m) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int[] array = {3, 67, 34, 97, 2, 143, 565, 345, 98, 45, 223};
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }
}
