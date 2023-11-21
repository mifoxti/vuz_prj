package upd_19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class INN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос данных у пользователя
        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        // Проверка валидности ИНН
        try {
            validateInn(inn);
            System.out.println("ИНН действителен. Заказ успешно оформлен.");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод для проверки валидности ИНН
    private static void validateInn(String inn) throws InvalidInnException {
        // Регулярное выражение для ИНН (10 или 12 цифр)
        String innRegex = "\\d{10}|\\d{12}";

        // Проверка совпадения с регулярным выражением
        Pattern pattern = Pattern.compile(innRegex);
        Matcher matcher = pattern.matcher(inn);

        if (!matcher.matches()) {
            throw new InvalidInnException("Неверный формат ИНН");
        }

        // Дополнительные проверки могут быть добавлены в зависимости от требований

        // Пример: проверка контрольной суммы для 10-значного ИНН
        if (inn.length() == 10 && !isValidInnChecksum10(inn)) {
            throw new InvalidInnException("Неверная контрольная сумма для ИНН");
        }

        // Пример: проверка контрольной суммы для 12-значного ИНН
        if (inn.length() == 12 && !isValidInnChecksum12(inn)) {
            throw new InvalidInnException("Неверная контрольная сумма для ИНН");
        }
    }

    // Пример метода для проверки контрольной суммы для 10-значного ИНН
    private static boolean isValidInnChecksum10(String inn) {

        return true;
    }

    // Пример метода для проверки контрольной суммы для 12-значного ИНН
    private static boolean isValidInnChecksum12(String inn) {

        return true;
    }
}

// Исключение для обработки ошибок валидации ИНН
class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}
