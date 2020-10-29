package javaEDU.grokkingalgorithms.hashTable;
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        HashMap<Integer, String> productNameAndPrice = new HashMap<>(); // Хеш таблица
        productNameAndPrice.put(1, "Banana"); // put - добавить
        productNameAndPrice.put(3, "Meat");
        productNameAndPrice.put(56, "salad");
        productNameAndPrice.put(45, "Fish");

        /*for(Map.Entry e: productNameAndPrice.entrySet()) {
            System.out.println(e);
        }*/

        System.out.println(productNameAndPrice.get(45));
    }
}
