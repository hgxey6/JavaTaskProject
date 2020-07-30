/*Задание 3.5
Напишите класс, который принимает с клавиатуры три числа: длины
двух катетов и гипотенузы прямоугольного треугольника, и выводит
на экран площадь и периметр этого треугольника.
При решении следует предусмотреть возможность того, что размеры
сторон треугольника не выражаются целыми числами.*/
package JavaBasicTasks.Section3DataAssignment;
import java.util.Scanner;

public class Section3Task5 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt(); // a & b это катеты
        int b = scan.nextInt();
        int c = scan.nextInt(); // "c" гипотенуза

        int perimeter = a + b + c; // Периметр
        float halfPerimeter = perimeter / 2;

        double S = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) *
                (halfPerimeter - c));  //Используем формулу "Герона"

        System.out.println("Perimeter: " + perimeter + " | Area: " + S);
    }
}
