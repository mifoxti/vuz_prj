package upd_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskInfo {
    public static void main(String[] args) {
        String developerName = "Ляхов";

        // Дата и время получения задания
        Date dateReceived = new Date(); // Текущая дата и время

        // Дата и время сдачи задания (предположим, что задание сдаётся сразу после получения)
        Date dateSubmitted = new Date();

        // Форматирование даты и времени
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(dateReceived));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(dateSubmitted));
    }
}