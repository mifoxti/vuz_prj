package upd_9;

public class TestStudentSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Даша", 5.0),
                new Student(102, "Тимофей", 4.9),
                new Student(103, "Даня", 4.8),
        };

        // Сортировка с использованием сортировки вставками
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }

        // Вывод отсортированного списка
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

