package upd_8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу:");
        System.out.println("1 - Треугольная последовательность");
        System.out.println("2 - Разложение на простые множители");
        System.out.println("3 - Без двух нулей");
        System.out.println("4 - Количество единиц в последовательности");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int n1 = scanner.nextInt();
                System.out.println("Треугольная последовательность:");
                printTriangularSequence(n1);
                break;
            case 2:
                int n2 = scanner.nextInt();
                System.out.println("Разложение на простые множители:");
                primeFactorization(n2);
                break;
            case 3:
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                long result = countSequences(a, b);
                System.out.println("Количество последовательностей: " + result);
                break;
            case 4:
                int onesCount = countOnesInSequence();
                System.out.println("Количество единиц в последовательности: " + onesCount);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    public static void printTriangularSequence(int n) {
        int currentNumber = 1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < currentNumber; j++) {
                System.out.print(currentNumber + " ");
                count++;
                if (count == n) {
                    return;
                }
            }
            currentNumber++;
        }
    }

    public static void primeFactorization(int n) {
        int divisor = 2;

        while (n > 1) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            if (count > 0) {
                System.out.println(divisor + " в степени " + count);
            }

            divisor++;
        }
    }

    public static long countSequences(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return countSequences(a, b - 1) + countSequences(a - 1, b - 1);
    }

    public static int countOnesInSequence() {
        Scanner scanner = new Scanner(System.in);
        int onesCount = 0;

        int currentNumber;
        while (true) {
            currentNumber = scanner.nextInt();
            if (currentNumber == 0) {
                break;
            }
            if (currentNumber == 1) {
                onesCount++;
            }
        }

        return onesCount;
    }
}
