package javaEDU.oop.Task3Matrix;

/**
 * Матрицу нельзя создать без указнанной строки(row) и столбца(column)(Math: n && m).
 * Матрица генерирует и заполняет числами типа double от 0 до 100.
 */
class Matrix {
    private final int row; //Строки
    private final int column; // Столбцы
    private final double[][] matrix;

    private int down = 0;// Минимальное значение в матрице
    private int up = 100;// Максимальное значение в матрице

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * Создает матрицу row x column и заполняет вещественными числами от 0.0 до 100.0
     *
     * @param row    принимает количество строк в матрице.
     * @param column принимает количество стоблцов в матрице.
     */
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

    /**
     * Метод выводит на консоль матрицу.
     * @param m принимает матрицу, которую мы дожлны вывести на консоль
     */
    public static void print(Matrix m) {
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0; j < m.matrix[0].length; j++) {
                System.out.printf("%.3f\t\t", m.matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Сложение двух матриц:  матрица1.сложить(матрица2).
     * @param mat2 принимает вторую матрицу.
     * Если у двух матриц равны столбцы и строки, то можно сложить их по формуле:
     * С(ij) = A(ij) + B(ij)
     *
     * @return Если у матриц равны столбцы и строки, сложить матрицы и вернуть новую
     * матрицу, иначе вернуть null.
     */
    public Matrix matrixAddition(Matrix mat2) {
        Matrix returnMatrix = null;

        if (row == mat2.row && column == mat2.column) {
            Matrix mat3 = new Matrix(row, mat2.column);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    mat3.matrix[i][j] = matrix[i][j] + mat2.matrix[i][j];
                }
            }
            returnMatrix = mat3;
        } else {
            System.out.println("Столбцы и строки матриц разные!");
        }

        return returnMatrix;
    }

    /**
     * @param number число, которое умнажается на каждый элемент матрицы.
     *               Математическая формула B(i,j) = k * A(i, j)
     */
    public void scalarMultiplication(int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] *= number;
            }
        }
    }

    // Изменить нижний регистр рандомных чисел. По умолчанию 0.
    public void setDown(int down) {
        this.down = down;
    }

    // Изменить верхний регистр рандомных чисел. По умолчанию 100.
    public void setUp(int up) {
        this.up = up;
    }
}
