package CayHorstmannCoreJava.Employee;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
    //Данные сотрудника
    private String name;
    private double salary;
    private Date hireDay;

    //Конструктор
    public Employee(String n, double s, int year, int mouth, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, mouth - 1, day);
        hireDay = calendar.getTime();
    }

    //геттеры
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
    }
}

