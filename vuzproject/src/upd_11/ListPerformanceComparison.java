package upd_11;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int n = 1000000; // Количество элементов в списках
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Вставка элементов в начало списка
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList: Время вставки " + n + " элементов в начало: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: Время вставки " + n + " элементов в начало: " + (endTime - startTime) + " мс");

        // Удаление элементов из середины списка
        startTime = System.currentTimeMillis();
        for (int i = n / 2; i < n / 2 + 1000; i++) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList: Время удаления 1000 элементов из середины: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = n / 2; i < n / 2 + 1000; i++) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: Время удаления 1000 элементов из середины: " + (endTime - startTime) + " мс");

        // Поиск элемента по образцу
        int searchElement = n / 4;
        startTime = System.currentTimeMillis();
        arrayList.contains(searchElement);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList: Время поиска элемента по образцу: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        linkedList.contains(searchElement);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: Время поиска элемента по образцу: " + (endTime - startTime) + " мс");
    }
}

