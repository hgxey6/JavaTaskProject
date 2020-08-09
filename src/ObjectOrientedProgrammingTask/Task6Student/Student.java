package ObjectOrientedProgrammingTask.Task6Student;

class Student {
    private String firstName, lastName;
    private int group;
    private double averageMark;

    //Конструктор для создания клона объекта
    public Student(Student ob) {
        firstName = ob.firstName;
        lastName = ob.lastName;
        group = ob.group;
        averageMark = ob.averageMark;
    }

    //Конструктор
    public Student(String firstName, String lastName, double averageMark, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
        this.group = group;
    }

    //Степендия
    public int getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }

    //Показать все данные
    public void info() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Group: " + group);
        System.out.println("AverageMark: " + averageMark);
    }

    //Геттер для ср. оценки
    public double getAverageMark() {
        return averageMark;
    }
}

