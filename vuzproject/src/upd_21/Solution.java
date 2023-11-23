package upd_21;

import java.io.File;
import java.util.*;

public class Solution<T, V, K> {
    private T[] array;

    public Solution(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return array[index];
    }

    public static <E> List<E> arrayToList(E[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса Solution с типами Integer, String и Double
        Solution<Integer, String, Double> solution = new Solution<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Элемент по индексу 2: " + solution.getElementAtIndex(2));

        // Создание массива целых чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        // Преобразование массива целых чисел в список целых чисел с использованием статического метода
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Список из массива целых чисел: " + intList);

        // Создание массива строк
        String[] stringArray = {"Виски", "Кола", "Королева", "Танцпола"};
        // Преобразование массива строк в список строк с использованием статического метода
        List<String> stringList = arrayToList(stringArray);
        System.out.println("Список из массива строк: " + stringList);

        // Получение списка файлов в каталоге "vuzproject/src" и преобразование массива в список файлов
        File[] filesInDirectory = new File("vuzproject/src").listFiles();
        List<File> fileList = arrayToList(filesInDirectory);
        System.out.println("Список файлов в каталоге: " + fileList);
    }
}