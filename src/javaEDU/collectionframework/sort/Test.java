package javaEDU.collectionframework.sort;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> set = new TreeSet(pcomp);
        set.add(new Person("Tom", 34));
        set.add(new Person("Victor", 45));
        set.add(new Person("Akira", 18));
        set.add(new Person("Aidana", 23));

        for (Person o : set) {
            System.out.println(o.getName() + " " + o.getAge());
        }
    }
}
