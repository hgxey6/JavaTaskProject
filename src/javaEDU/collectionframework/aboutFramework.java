package javaEDU.collectionframework;

import java.util.*;

public class aboutFramework {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(56);
        list.add(12);
        list.add(89);

        for (Object o : list) {
            System.out.println(o);
        }

        Queue queue = new PriorityQueue(); // Кью
        queue.offer(5);
        queue.offer(45);

        Iterator it = queue.iterator();

        while (it.hasNext()) {
            //System.out.println(queue.poll()); удаляет элементы из очереди
            //System.out.println(it.next()); выводит на экран все элементы
        }
    }
}
