package upd_11;

import java.util.*;
import java.text.SimpleDateFormat;

public class DateComparison {
    public static void main(String[] args) {
        // Получение фамилии разработчика
        String developerName = "Ваша фамилия";

        // Получение текущей даты и времени
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));

        // Ввод данных от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время в формате ГГГГММДДЧЧММ:");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            SimpleDateFormat userInputFormat = new SimpleDateFormat("yyyyMMddHHmm");
            Date userDate = userInputFormat.parse(userInput);

            // Сравнение введенной даты и времени с текущей
            if (userDate.after(currentDate)) {
                System.out.println("Введенная дата и время позже текущей.");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата и время раньше текущей.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущей.");
            }

        } catch (Exception e) {
            System.err.println("Ошибка при парсинге введенной даты и времени.");
        }
    }
}
