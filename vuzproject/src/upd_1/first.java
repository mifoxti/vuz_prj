package upd_1;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        double avg;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = in.nextInt();
            sum += mass[i];
        }

        avg = (double) sum / mass.length;

        System.out.println("Сумма элементов нового массива: " + sum);
        System.out.println("Среднее арифметическое нового массива: " + avg);
    }

}

