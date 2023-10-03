package upd_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortStudents {    
    public static void main(String[] args) {
        Student[] students1 = {
                new Student(101, "Марина", 3.9),
                new Student(102, "Петя", 3.6),
        };

        Student[] students2 = {
                new Student(201, "Дима", 3.8),
                new Student(202, "Артем", 3.7),
        };

        List<Student> mergedStudents = new ArrayList<>();
        mergedStudents.addAll(Arrays.asList(students1));
        mergedStudents.addAll(Arrays.asList(students2));

        // Сортировка объединенного списка с использованием сортировки слиянием и компаратора SortingStudentsByGPA
        Collections.sort(mergedStudents, new SortingStudentsByGPA());

        // Вывод отсортированного списка
        for (Student student : mergedStudents) {
            System.out.println(student);
        }
    }
}

