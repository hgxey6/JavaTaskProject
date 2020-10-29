package javaEDU.oop.Task6Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student("Mike", "Krakov", 3.5, 2);
        students[1] = new Aspirant("Sara", "Connor", 5.0,
                1, true);

        students[0].info();
        System.out.println(students[0].getScholarship());
        System.out.println();

        students[1].info();
        System.out.println(students[1].getScholarship());
        System.out.println();
    }
}
