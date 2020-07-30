package ObjectOrientedProgrammingTask.Task3;
/**
 * Матрицу нельзя создать без указнанной строки и столбца (n && m)
 * Матрица генерирует и заполняет числами типа double(вещественные числа)
 * от 0 до 100
 */
class Matrix {
    private final int row; //Строки
    private final int column; //Столбцы
    private final double[][] matrix; //Сама матрица

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        matrix = new double[row][column];
        double down = 0;
        double up = 100;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                double number = down + ((up - down + 1) * Math.random());
                matrix[i][j] = number;
            }
        }
    }
    //Показывает матрцу
    public void showTheMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    /** Сложение двух матриц
     * Если у двух матриц равны столбцы и строки, то можно сложить их по формуле
     * С(ij) = A(ij) + B(ij)
     * Метод static, потэтому решил, что удобнее будет указать 2 матрицы.
     */
    public static Matrix matrixAddition(Matrix mat1, Matrix mat2) {
        // Если у матриц не равны row && column, мы должны вернуть null
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
}
