/*Задание 17.13
Напишите метод, который принимает в качестве параметра два целыхчисла и возвращает значение
true, если в числах одинаковое количество цифр; в ином случае метод возвращает
значение false.*/
package JavaBasicTasks.Section17Methods;
import java.util.Scanner;

public class Section17Task13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int FirstNumber = scanner.nextInt();
        int SecondNumber = scanner.nextInt();

        System.out.println(func(FirstNumber, SecondNumber));
    }

    static boolean func(int FirstNumber, int SecondNumber) {
        int FirstNumberDigitSize = 0, SecondNumberDigitSize = 0;

        while (FirstNumber > 0) {
            FirstNumber /= 10;
            FirstNumberDigitSize++;
        }

        while (SecondNumber > 0) {
            SecondNumber /= 10;
            SecondNumberDigitSize++;
        }

        return FirstNumberDigitSize == SecondNumberDigitSize;
    }
}
