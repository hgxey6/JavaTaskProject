package GrokkingAlgorithms.BinarySearch;

import java.util.Scanner;

// log2 1 000 000  = 20 (Максимальное количество попыток, если без ошибок)
public class BinarySearchGame {
    private static void search() {
        Scanner scanner = new Scanner(System.in);
        int low = 0;
        int high = 1000000;
        int move = 0;
        String answer = "";
        while (!answer.equals("true")) {
            int middle = (high + low) / 2;
            System.out.println("Это число " + middle + " ?");
            answer = scanner.nextLine();
            switch (answer) {
                case "h", "high" -> {
                    low = middle + 1;
                    move++;
                }
                case "l", "low" -> {
                    high = middle - 1;
                    move++;
                }
                case "y", "yes" -> {
                    answer = "true";
                    move++;
                }
            }
        }
        System.out.println("Количество ходов: " + move);
    }

    public static void main(String[] args) {
        System.out.println("Загадайте число от 0 до 1 000 000");
        System.out.println("Управление: 'y', 'yes' - правильно\t'l', 'low' - ниже\t'h', 'high' -  выше");
        search();
    }
}
