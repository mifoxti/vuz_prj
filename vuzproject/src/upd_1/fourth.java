package upd_1;

public class fourth {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        double harmonicSum = 0.0;

        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            harmonicSum += harmonicNumber;

            System.out.printf("Число %d: %.5f%n", i, harmonicNumber);
        }

        System.out.printf("Сумма первых 10 чисел гармонического ряда: %.5f%n", harmonicSum);
    }
}
