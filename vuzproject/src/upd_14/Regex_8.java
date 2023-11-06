package upd_14;

import java.util.ArrayList;
import java.util.List;

public class Regex_8 {
    interface Filter {
        boolean apply(Object o);
    }

    public static <T> List<T> filter(T[] arr, Filter filter) {
        List<T> result = new ArrayList<>();
        for (T item : arr) {
            if (filter.apply(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Filter evenFilter = (Object o) -> ((Integer) o) % 2 == 0;

        List<Integer> evenNumbers = filter(numbers, evenFilter);
        System.out.println("Even numbers: " + evenNumbers);

        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        Filter longWordFilter = (Object o) -> ((String) o).length() > 5;

        List<String> longWords = filter(words, longWordFilter);
        System.out.println("Long words: " + longWords);
    }
}
