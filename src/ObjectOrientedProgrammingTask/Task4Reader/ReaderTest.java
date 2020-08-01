package ObjectOrientedProgrammingTask.Task4Reader;

public class ReaderTest {
    public static void main(String[] args) {
        Reader student = new Reader("Аскарова Г.К", 7544,
                "8-771-874-36-99");
        student.takeBook(2);
        student.information();
        student.returnBook(1);
        student.information();
    }
}
