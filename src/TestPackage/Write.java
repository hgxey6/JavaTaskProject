package TestPackage;

import java.io.*;

public class Write {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("abc.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            for (int i = 1; i <= 100; i++) {
                buffer.write("My name is Robot");
                buffer.newLine();
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("Ошибка ввода!" + e);
        }
    }
}
