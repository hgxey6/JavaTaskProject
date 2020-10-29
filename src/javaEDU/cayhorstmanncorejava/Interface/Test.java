package javaEDU.cayhorstmanncorejava.Interface;

public class Test {
    public static void main(String[] args) {
        Employee person = new Employee("Robert Johnson", 55000);
        Employee aPerson = new Employee("John Smith", 45000);
        Manager manager = new Manager("Aaron Smile", 43000, 500);
        System.out.println(person.compareTo(aPerson));
        System.out.println(manager.compareTo(aPerson));
    }
}
