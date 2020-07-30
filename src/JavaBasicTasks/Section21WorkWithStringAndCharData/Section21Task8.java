/*Задание 21.8
Напишите класс, который принимает с клавиатуры два строковых значения, каждое из которых содержит
имя человека, и проверяет, являются ли эти люди тезками. По результатам проверки следует вывести
на экран соответствующее сообщение.*/
package JavaBasicTasks.Section21WorkWithStringAndCharData;

import java.util.Scanner;

public class Section21Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String secondName = scanner.next();
        System.out.println(verification(firstName, secondName));
    }

    static boolean verification(String first, String second) {
        return first.toLowerCase().equals(second.toLowerCase());
    }
}
