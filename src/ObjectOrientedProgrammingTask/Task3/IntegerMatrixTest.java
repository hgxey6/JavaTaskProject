package ObjectOrientedProgrammingTask.Task3;

public class IntegerMatrixTest {
    public static void main(String[] args) {
        IntegerMatrix matrix1 = new IntegerMatrix(5, 3);
        IntegerMatrix matrix2 = new IntegerMatrix(5, 3);
        IntegerMatrix matrix3 = IntegerMatrix.integerMatrixAddition(matrix1, matrix2);
        matrix1.showTheIntegerMatrix();
        matrix2.showTheIntegerMatrix();
        matrix3.showTheIntegerMatrix();

    }
}
