package ObjectOrientedProgrammingTask.Task2;

public class PersonTest {
    public static void main(String[] args) {
        Person firstPerson = new Person("Виктор Иванов",45);
        Person secondPerson = new Person();

        firstPerson.talk();

        secondPerson.setFullName("Айлана Куатбаевна");
        secondPerson.move();
    }
}
