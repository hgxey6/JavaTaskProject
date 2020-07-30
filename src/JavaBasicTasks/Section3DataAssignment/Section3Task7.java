/*Задание 3.7
Напишите класс, который принимает с клавиатуры целое число и выводит на экран
три предыдущих ему целых числа, причем каждое в отдельной строке.*/
package JavaBasicTasks.Section3DataAssignment;

import java.util.Scanner;

public class Section3Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number - 1);
    }
}
