/*Задание 19.41
Напишите метод, который принимает в качестве параметра массив
целых чисел и возвращает новый массив с переставленными первой и
второй половинами.
Например, если в качестве параметра получен массив метод возвращает массив 1, 3, 6, 8, 2, 7
 - 8, 2, 7, 1, 3, 6.*/
package JavaBasicTasks.Section19ArrayAndMethods;
import java.util.Scanner;

public class Section19Task41 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("SIZE: ");
        int massifSize = scanner.nextInt();
        int[] massif = new int[massifSize];
        random(massif, massifSize);
        division(massif, massifSize);
    }

    private static void random(int[] arr, int size) {  // Присв. массиву значния
        System.out.print("Old Array: ");
        int min = 0, max = 20;
        for (int i = 0; i < size; i++) {
            arr[i] = min + (int) ((max - min + 1) * Math.random());
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    private static void division(int[] arr, int size) { // Деление
        int halfSizeArray = size / 2;
        int[] firstHalfArray = new int[halfSizeArray];
        int[] secondHalfArray = new int[halfSizeArray];
        for (int i = 0; i < halfSizeArray; i++) { // Присваиваем первую часть массива в новый массив
            firstHalfArray[i] = arr[i];
        }

        if (size % 2 == 1) halfSizeArray++; // если размер нечетный то пропускаем середину

        for (int i = halfSizeArray, j = 0; i < size; i++, j++) { // Присваиваем вторую часть
            secondHalfArray[j] = arr[i];
        }

        for (int i = 0; i < size / 2; i++) {
            arr[i] = secondHalfArray[i];
        }

        for (int i = halfSizeArray, j = 0; i < size; i++, j++) {
            arr[i] = firstHalfArray[j];
        }
        System.out.print("New Array: ");
        for (int i : arr)
            System.out.print(i + " ");
    }

}
