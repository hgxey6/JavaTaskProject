/*Задание 4.18
Назовем «линейным сдвигом числа влево» операцию, при которой его цифры перемещаются на одну
позицию влево  при этом первая цифра удаляется из числа, а на место единиц записывается ноль.
Например, из числа 1234 после такой операции получается число 2340. Напишите класс, который
принимает с клавиатуры трехзначное число и строит новое число, полученное «линейным сдвигом влево».*/
//ДОПОЛНИТЕЛЬНО: для всех чисел и использовать try catch
package JavaBasicTasks.Section4BalanceCalculation;

import java.util.Scanner;

public class Section4Task18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int number = scan.nextInt(); // Вводим число

            int xCase = number; // Находим размер числа
            int numberSize = 0;
            while (xCase > 0) {
                xCase /= 10;
                numberSize++;
            }

            int[] array = new int[numberSize]; // Для хранения всех цифр
            for (int i = 0; i < numberSize; i++) {
                array[i] = number % 10;
                number /= 10;
            }
            System.out.print("Сдвиг влево << ");
            for (int i = numberSize - 1 - 1; i >= 0; i--) { //Сдвиг
                System.out.print(array[i]);
            }
            System.out.print("0");
        } catch (Exception e) {
            System.out.println("Ошибка!");
        } finally {
            System.out.println("\nПрограмма завершена! ");
        }
    }
}
