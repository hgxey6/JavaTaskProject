/*Задание 13.16
Математическая последовательность задана формулой ее любого члена:
an = (2n-1) ** 0.5
Напишите класс, который принимает с клавиатуры число членов последовательности
(n) и вычисляет сумму этой последовательности.*/

package javaEDU.javabasictasks.Section13ForLoop;
import java.util.Scanner;

public class Section13Task16 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("a(n) = (2n - 1) ** 0.5\nВведите n: ");
        int n = scanner.nextInt(); //
        double sum = 0; // Сумма всех n элементов

        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(2 * i - 1);
            System.out.printf("a" + i + " = %.3f\n", (Math.sqrt(2 * i - 1)));
        }

        System.out.printf("Сумма " + n + " элементов = %.3f", sum);
    }
}
