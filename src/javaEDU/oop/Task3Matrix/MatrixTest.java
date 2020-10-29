package javaEDU.oop.Task3Matrix;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(4, 5); //Первая матрица
        Matrix secondMatrix = new Matrix(4, 5); //Вторая матрица

        firstMatrix.scalarMultiplication(3); //Ужножение на число 3

        Matrix thirdMatrix = firstMatrix.matrixAddition(secondMatrix); // Сложение матриц

        Matrix.print(thirdMatrix);// Показать матрицу №3
        Matrix.print(firstMatrix.matrixAddition(secondMatrix));//То же самое, без самого объекта
    }
}
