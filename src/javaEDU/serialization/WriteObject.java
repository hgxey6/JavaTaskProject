package javaEDU.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person p1 = new Person(23, "John");
        Person p2 = new Person(19, "Liam");

        try {
            // fos нужен для записи объекта в файл(person.bin)
            FileOutputStream fos = new FileOutputStream("src/javaEDU/serialization/person.bin");
            // oos нужен для конвентирования объекта в байт код
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1); // Запись
            oos.writeObject(p2);
            oos.close(); // Обязательно нужно закрыть
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
