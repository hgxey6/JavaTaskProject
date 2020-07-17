/*Задание 21.5
Напишите класс, который принимает с клавиатуры фамилию человека,
а затем выводит ее на экран, добавив знак «пробел» между буквами.*/
package CayHorstmannCoreJava.Section21WorkWithStringAndCharData;

import java.util.Scanner;

public class Section21Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        CharOut(text);

    }

    static void CharOut(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}

