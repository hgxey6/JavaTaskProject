package ObjectOrientedProgrammingTask.Task3Matrix;

/**
 * Матрицу нельзя создать без указнанной строки(row) и столбца(column)(Math: n && m).
 * Матрица генерирует и заполняет числами типа double(вещественные числа,после запятой
 * первые 3 числа ) от 0 до 100.
 *
 * Класс имеет несколько методов:
 * showTheMatrix выводит на консоль матрицу.
 * matrixAddition является статистическим.
 * scalarMultiplication умнажает матрицу на указанное число
 **/
class Matrix {
    private final int row;
    private final int column;
    private final double[][] matrix;

    private int down = 0;// Минимальное значение в матрице
    private int up = 100;// Максимальное значение в матрице

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        matrix = new double[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                double number = down + ((up - down + 1) * Math.random());
                matrix[i][j] = number;
            }
        }
    }

    public void showTheMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.3f\t\t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Сложение двух матриц
     * Если у двух матриц равны столбцы и строки, то можно сложить их по формуле:
     * С(ij) = A(ij) + B(ij)
     * Если у матриц не равны row && column, мы должны вернуть null.
     */
    public static Matrix matrixAddition(Matrix mat1, Matrix mat2) {
        Matrix returnMatrix = null;

        if (mat1.row == mat2.row && mat1.column == mat2.column) {
            Matrix mat3 = new Matrix(mat1.row, mat2.column);
            for (int i = 0; i < mat1.matrix.length; i++) {
                for (int j = 0; j < mat1.matrix[0].length; j++) {
                    mat3.matrix[i][j] = mat1.matrix[i][j] + mat2.matrix[i][j];
                }
            }
            returnMatrix = mat3;
        } else {
            System.out.println("Столбцы и строки матриц разные!");
        }

        return returnMatrix;
    }

    /**
     * Умножение матрицы на число
     * Число умнажается на каждого элемента матрицы.
     * Элементы матрицы ужножаются на заданное число.
     * B(i,j) = k * A(i, j)
     */

    public void scalarMultiplication(int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] *= number;
            }
        }
    }

    //Можно изменить нижний и верхний регистр чисел в матрице(необязательно)
    public void setDown(int down) {
        this.down = down;
    }

    public void setUp(int up) {
        this.up = up;
    }
}
