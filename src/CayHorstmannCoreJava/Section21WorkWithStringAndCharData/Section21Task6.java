/*Задание 21.6
Напишите метод, который получает в качестве параметра строку и выводит на экран:
•первый символ строки;
•два первых символа;
•три первых символа и так далее.*/
package CayHorstmannCoreJava.Section21WorkWithStringAndCharData;

import java.util.Scanner;

public class Section21Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        CharOut(text);
    }

    static void CharOut(String text) {
        char[] array = text.toCharArray();
        int loopArrayLength = 1;

        while (loopArrayLength != text.length() + 1) {
            for (int i = 0; i < loopArrayLength; i++) {
                System.out.print(array[i]);
            }
            System.out.print("\n");
            loopArrayLength++;
        }
    }
}
