package javaEDU.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    // В интерфейсе Serializable нет методов. Интерфейс работает как флажок
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
