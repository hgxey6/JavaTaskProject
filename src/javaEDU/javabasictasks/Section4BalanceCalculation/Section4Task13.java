/*Задание 4.13
Назовем «степенью четности» числа количество четных цифр в нем.
Для числа 1684 :  3 (6, 8, 4)
Напишите класс, который принимает с клавиатуры положительное
двузначное число, а затем вычисляет и выводит на экран его «степень
четности» */
// ДОПОЛНИТЕЛЬНО: сделать для любого числа
package javaEDU.javabasictasks.Section4BalanceCalculation;
import java.util.Scanner;

public class Section4Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int sumOfEvenDigits = 0; // Сумма четных цифр

        while (number > 0) {   //
            int lastDigitInNumber = number % 10;  // Берем последнюю цифру в number
            if (lastDigitInNumber % 2 == 0) sumOfEvenDigits++;
            number /= 10; // Избавляемся от посл. цифры в number
        }
        System.out.println("Степень четности: " + sumOfEvenDigits);
    }
}
