package ObjectOrientedProgrammingTask.Task2Person;

class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }
    //Методы
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public void move() {
        System.out.println(fullName + " гуляет");
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


}
