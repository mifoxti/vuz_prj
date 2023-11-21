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
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);

        System.out.println("List from Integer array: " + intList);

        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = arrayToList(stringArray);

        System.out.println("List from String array: " + stringList);

        File[] filesInDirectory = new File("src").listFiles();
        List<File> fileList = arrayToList(filesInDirectory);

        System.out.println("List of files in directory: " + fileList);

        Solution<Integer, String, Double> solution = new Solution<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Element at index 2: " + solution.getElementAtIndex(2));
    }
}