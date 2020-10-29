/*Задание 21.4
Напишите метод, который получает в качестве параметра строку и вы­
водит на экран все символы строки, каждый в отдельной строчке.*/
package javaEDU.javabasictasks.Section21WorkWithStringAndCharData;

import java.util.Scanner;

public class Section21Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        CharOut(text);

    }

    static void CharOut(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(array[i]);
        }
    }


}