package ObjectOrientedProgrammingTask.Task6Student;

class Student {
    private String firstName, lastName;
    private int group;
    private double averageMark;

    //Конструкторы
    public Student() {

    }

    public Student(String firstName, String lastName, double averageMark, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
        this.group = group;
    }


    //Степендия
    public int getScholarship(double averageMark) {
        return (averageMark <= 5) ? 80 : 100;
    }


    //Геттеры
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }


    //Сеттеры
    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setGroup() {
        this.group = group;
    }

    public void setAverageMark() {
        this.averageMark = averageMark;
    }
}
