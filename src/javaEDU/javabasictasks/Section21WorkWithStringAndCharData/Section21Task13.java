/*Задание 21.13
Напишите метод, который получает в качестве параметра строку и возвращает строку,
составленную только из заглавных букв русского алфавита.
Например, для строки АБвгде 123ЖзИ метод возвратит АБЖИ.*/
package javaEDU.javabasictasks.Section21WorkWithStringAndCharData;

import java.util.Scanner;

public class Section21Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(deleteSymbol(deleteLowerCase(text)));
    }

    static String deleteLowerCase(String text) {
        char[] textCharArray = text.toCharArray(); // Из string в массив символов
        char[] textUpperCharArray = text.toUpperCase().toCharArray(); // с верхним регистром

        char[] newTextCharArray = new char[text.length()];// Сюда добавляем
        int length = 0; // Для добавление символов в newCharArray

        for (int i = 0; i < textCharArray.length; i++) {
            if (String.valueOf(textCharArray[i]).equals(String.valueOf(textUpperCharArray[i]))) {
                newTextCharArray[length] = textCharArray[i];
                length++;
            }
        }
        return new String(newTextCharArray);
    }

    static String deleteSymbol(String text) {
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i)))
                newText.append(text.charAt(i));
        }
        return newText.toString();
    }
    // How delete number ?
}
