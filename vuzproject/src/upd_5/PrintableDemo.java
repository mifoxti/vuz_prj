package upd_5;

import upd_7.Printable;
import upd_7.Magazine;
import upd_7.Book;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4]; // Создаем массив Printable

        // Заполняем массив экземплярами книг и журналов
        printables[0] = new Magazine("Magazine 1");
        printables[1] = new Magazine("Magazine 2");
        printables[2] = new Book("Book 1");
        printables[3] = new Book("Book 2");

        // Выводим названия только журналов
        printMagazines(printables);

        // Выводим названия только книг
        printBooks(printables);
    }

    public static void printMagazines(Printable[] printables) {
        System.out.println("Magazines:");
        for (Printable item : printables) {
            if (item instanceof Magazine) {
                System.out.println(item.getTitle());
            }
        }
    }

    public static void printBooks(Printable[] printables) {
        System.out.println("Books:");
        for (Printable item : printables) {
            if (item instanceof Book) {
                System.out.println(item.getTitle());
            }
        }
    }
}
