package TestPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class TestTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String text;
        while (true) {
            text = scanner.nextLine();
            if (text.toLowerCase().equals("exit")) break;
            list.add(text);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}


