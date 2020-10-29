package interestingmethod;

import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replaceAll("[^A-Za-z]", ""));
    }
}
