package ObjectOrientedProgrammingTask.Task2Person;

public class PersonTest {
    public static void main(String[] args) {
        Person firstPerson = new Person("Виктор Иванов",45);
        Person secondPerson = new Person();

        firstPerson.talk();
        System.out.println("Виктору Иванову " + firstPerson.getAge() + " лет");
        secondPerson.setFullName("Айлана Куатбаевна");
        secondPerson.move();
    }
}
