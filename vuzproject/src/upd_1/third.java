package upd_1;

public class third {
    public static void main(String[] args) {
        // Перебираем аргументы командной строки с помощью цикла for
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}
