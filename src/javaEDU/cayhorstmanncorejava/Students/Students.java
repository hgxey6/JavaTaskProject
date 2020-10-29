package javaEDU.cayhorstmanncorejava.Students;

class Students {
    // Данные студентов
    private String name;
    private int course;
    private int age;
    private double gpa;

    //Конструктор
    public Students(String n, int c, int a, double g) {
        name = n;
        course = c;
        age = a;
        gpa = g;
    }

    //геттеры
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    //Если у студента GPA >= 3, то он может уехать в США
    private boolean travelUSA = false;
    public void checkForTravelToTheUSA() {
        if (gpa >= 3) travelUSA = true;
    }

    public boolean getTravelUSA() {
        return travelUSA;
    }
}
