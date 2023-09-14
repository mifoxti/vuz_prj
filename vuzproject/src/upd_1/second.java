package upd_1;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности массива
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();

        // Создание массива
        int[] arr = new int[size];

        // Ввод элементов массива с клавиатуры
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Вычисление суммы элементов с использованием цикла do-while
        int sumDoWhile = 0;
        int doWhileIndex = 0;
        do {
            sumDoWhile += arr[doWhileIndex];
            doWhileIndex++;
        } while (doWhileIndex < size);

        // Вычисление суммы элементов с использованием цикла while
        int sumWhile = 0;
        int whileIndex = 0;
        while (whileIndex < size) {
            sumWhile += arr[whileIndex];
            whileIndex++;
        }

        // Нахождение максимального и минимального элементов
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Вывод результатов
        System.out.println("Сумма элементов (do-while): " + sumDoWhile);
        System.out.println("Сумма элементов (while): " + sumWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        // Закрытие сканнера
        scanner.close();
    }
}
