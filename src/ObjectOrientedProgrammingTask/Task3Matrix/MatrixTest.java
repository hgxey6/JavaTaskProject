package ObjectOrientedProgrammingTask.Task3Matrix;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(4, 5); //Первая матрица
        Matrix secondMatrix = new Matrix(4, 5); //Вторая матрица

        firstMatrix.scalarMultiplication(3); //Ужножение на число 3
        Matrix thirdMatrix = Matrix.matrixAddition(firstMatrix, secondMatrix); // Сложение матриц
        thirdMatrix.showTheMatrix();// Показать матрицу №3

    }
}
