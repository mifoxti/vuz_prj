package upd_20;


public class Matrix<T> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        int length = matrix[0].length;
        for (T[] row : matrix) {
            if (row == null) {
                throw new IllegalArgumentException("Массив не может содержать null");
            }
            if (row.length != length) {
                throw new IllegalArgumentException("Несовпадение размеров матрицы");
            }
            length = row.length;
        }

        this.matrix = matrix;
    }

    public static <T extends Number> Matrix<T> sum(Matrix<T> mat1, Matrix<T> mat2) /*T[][] matrix1, T[][] matrix2*/ {
        if (mat1.matrix.length != mat2.matrix.length || mat1.matrix[0].length != mat2.matrix[0].length) {
            throw new IllegalArgumentException("Для сложения размеры матрицы должны быть одинаковы!");
        }

        T[][] result = (T[][]) new Number[mat1.matrix.length][mat1.matrix[0].length];

        for (int i = 0; i < mat1.matrix.length; i++) {
            for (int j = 0; j < mat1.matrix[0].length; j++) {
                result[i][j] = (T) Double.valueOf(mat1.matrix[i][j].doubleValue() + mat2.matrix[i][j].doubleValue());
            }
        }
        return new Matrix<T>(result);
    }

    public static <T extends Number> Matrix<T> subtraction(T[][] matrix1, T[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Для вычитания размеры матрицы должны быть одинаковы!");
        }

        T[][] result = (T[][]) new Number[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = (T) Double.valueOf(matrix1[i][j].doubleValue() - matrix2[i][j].doubleValue());
            }
        }
        return new Matrix<T>(result);
    }

    public static <T extends Number> Matrix<T> multiplyByNumber(T[][] matrix1, T number) {

        T[][] result = (T[][]) new Number[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = (T) Double.valueOf(matrix1[i][j].doubleValue() * number.doubleValue());
            }
        }
        return new Matrix<T>(result);
    }

    public static <T extends Number> Matrix<T> multiplyMatrices(T[][] matrix1, T[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы");
        }

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        T[][] result = (T[][]) new Number[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                T sum = (T) Double.valueOf(0);
                for (int k = 0; k < cols1; k++) {
                    sum = (T) Double.valueOf(sum.doubleValue() + matrix1[i][k].doubleValue() * matrix2[k][j].doubleValue());
                }
                result[i][j] = sum;
            }
        }
        return new Matrix<>(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] row : matrix) {
            for (T element : row) {
                sb.append(element);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

