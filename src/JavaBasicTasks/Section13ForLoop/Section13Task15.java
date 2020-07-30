/*Задание 13.15
Напишите класс, который принимает с клавиатуры двузначное положительное целое число Х,
составленное из разных цифр, и возвращает сумму однозначных чисел, заключенных между
цифрами этого числа Х (включая сами цифры, из которых составлено число Х).
Например, и для числа 52, и для числа 25 будет возвращено значение 14
(2 + 3 + 4 + 5 = 14)*/

package JavaBasicTasks.Section13ForLoop;
import java.util.Scanner;

public class Section13Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int doubleDigitNumber = scan.nextInt();
        int firstDigit = doubleDigitNumber / 10; //Первая цифра числа
        int lastDigit = doubleDigitNumber % 10;  //Вторая цифра числа
        int sum = 0;

        if (firstDigit > lastDigit) { //Если первая цифра больше второй: 52
            for (int i = lastDigit; i <= firstDigit; i++) {
                sum += i;
            }
        } else {
            for (int i = firstDigit; i <= lastDigit; i++) { //Если вторая цифра больше первой 25
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
