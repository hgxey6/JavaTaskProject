/*Задание 10.1
Напишите класс, который генерирует и выводит на экран случайное
целое чисел из диапазона положительных двузначных чисел.*/
package JavaBasicTasks.Section10MathLibrary;

public class Section10Task1 {
    public static void main(String[] args) {
        int min = 10, max = 99;
        double number = min + (int) ((max - min + 1) * Math.random());
        System.out.println(number);
    }
}
