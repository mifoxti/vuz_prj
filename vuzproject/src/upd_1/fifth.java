package upd_1;

public class fifth {
    public static void main(String[] args) {
        int number = 5; // Здесь можно заменить число на любое другое
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
