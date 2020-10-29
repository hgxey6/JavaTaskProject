package javaEDU.cayhorstmanncorejava.Interface;

public class Employee implements Comparable<Employee> {
    private final String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        salary = (100 + byPercent) * salary / 100;
    }

    @Override
    public String toString() {
        return "{name=" + name + ", salary=" + salary + "}";
    }

    /**
     * Сравнивает зарплаты сотрудников.
     *
     * @param other другой объект типа Employee.
     * @return Возвращает отрицательное числовое значение, если зарплата
     * данного сотрудника ниже, чем у другого; нулевое значение, если
     * зарплата одинаковая; а иначе — положительное числовое значение.
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
