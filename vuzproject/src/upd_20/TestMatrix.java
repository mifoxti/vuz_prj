package upd_20;

class TestMatrix {
    public static void main(String[] args) {
        Integer[][] m1 = {{1, 2, 3},
                {4, 5, 6}};

        Integer[][] m2 = {{7, 8, 9},
                {10, 11, 12}};

        Matrix<Integer> mat1 = new Matrix<>(m1);
        Matrix<Integer> mat2 = new Matrix<>(m2);
        System.out.println(Matrix.sum(mat1, mat2));
    }
}
