package javaEDU.core;

import java.util.ArrayList;

public class ThisIsArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Denmark");
        list.add("USA");
        list.add("Russia");
        list.set(2, "Germany");
        list.add("Canada");
        list.add(1, "France");
        System.out.println(list);
        list.forEach((x) -> System.out.println("Element: " + x));
    }
}
