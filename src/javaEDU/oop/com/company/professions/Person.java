package javaEDU.oop.com.company.professions;

public class Person {
    private final String fullName;
    private int age; //Возраст меняется

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void yearLater() {
        age ++;
    }

    public void walk() {
        System.out.println(fullName + " гуляет");
    }
}
