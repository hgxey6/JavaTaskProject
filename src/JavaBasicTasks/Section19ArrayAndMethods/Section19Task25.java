/*Задание 19.25
Напишите метод, который принимает в качестве параметра массив целых
чисел М и целое число Х и проверяет, встречается ли в массиве пара
расположенных в смежных ячейках чисел, сумма которых равна Х */
package JavaBasicTasks.Section19ArrayAndMethods;
import java.util.Scanner;

public class Section19Task25 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 5 + (int) ((10 - 5 + 1) * Math.random()); // Размер массива ранд.ч. от 5 до 10
        int[] M = new int[size];

        System.out.print("Введите Х: ");
        int X = scanner.nextInt();

        System.out.println(func(M, X));
    }

    private static boolean func(int[] massif, int X) {
        int min = 0, max = 20;
        int sum = 0;
        System.out.print("Massif: ");
        for (int i = 0; i < massif.length; i++) {    // Задаем массив
            massif[i] = min + (int) ((max - min + 1) * Math.random());
            System.out.print(massif[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < massif.length - 1; i++)  {        // Метод пузырька
            for (int j = 0; j < massif.length - 1 - i; j++) {
                if (massif[j] + massif[j + 1] == X) sum++;
            }
        }

        return sum > 0;
    }
}
