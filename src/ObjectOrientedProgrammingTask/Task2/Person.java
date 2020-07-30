package ObjectOrientedProgrammingTask.Task2;

class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    //Геттеры
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    //Сеттеры
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public void move() {
        System.out.println(fullName + " гуляет");
    }
}
