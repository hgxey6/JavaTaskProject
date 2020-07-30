/*Задание 19.7
Напишите метод, который получает в качестве параметра массив и
заполняет его случайными числами в диапазоне О ...99 */
// Дополнительно: вернуть массив в метод main и оттуда вывести на экран
package JavaBasicTasks.Section19ArrayAndMethods;

public class Section19Task7 {
    final static int max = 99, min = 0; // Константа

    public static void main(String[] args) {
        int arraySize = min + (int) ((max - min + 1) * Math.random());
        int[] array = new int[arraySize];

        func(array);
        for (int value : array) System.out.print(value + " ");

    }

    public static int[] func(int[] massif) {
        for (int i = 0; i < massif.length; i++) {
            massif[i] = min + (int) ((max - min + 1) * Math.random());
        }
        return massif;
    }
}
