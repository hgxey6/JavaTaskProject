/*Задание 10.5
Напишите класс, который генерирует случайное положительное двузначное число, а затем
генерирует три целых положительных числа, меньших первого.*/
package javaEDU.javabasictasks.Section10MathLibrary;

public class Section10Task5 {
    public static void main(String[] args) {
        int min = 0, max = 99;
        max = min + (int) ((max - min + 1) * Math.random());
        System.out.println(max);
        for (int i = 1; i <= 3; i++) System.out.println(min + (int) ((max - min) * Math.random()));
    }
}
