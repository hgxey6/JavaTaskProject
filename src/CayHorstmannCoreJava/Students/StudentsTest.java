package CayHorstmannCoreJava.Students;

public class StudentsTest {
    public static void main(String[] args) {
        Students[] student = new Students[3];
        student[0] = new Students("Artem Kovalenko", 2, 20, 3.4);
        student[1] = new Students("Victoria Znamenskaya", 4, 23, 2.4);
        student[2] = new Students("Alina Askarovna", 2, 19, 3.0);

        for (Students s : student) {
            s.checkForTravelToTheUSA();
        }

        for (Students s : student) {
            System.out.println("name - " + s.getName() + ", " + "age - " +
                    s.getAge() + ", " + "course - " + s.getCourse() + ", " +
                    "GPA = " + s.getGpa() + ", " + "Is student going to travel to the USA ?" +
                    " " + s.getTravelUSA());
        }
    }
}
