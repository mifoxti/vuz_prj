package upd_19.p_19_2;

import java.util.List;
import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI() {
        labClass = new LabClass();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Sort Students by Average Score");
            System.out.println("3. Find Student by Full Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    sortStudents();
                    break;
                case 3:
                    findStudent();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter average score: ");
        double averageScore = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        Student student = new Student(fullName, averageScore);
        labClass.addStudent(student);
        System.out.println("Student added.");
    }

    private void sortStudents() {
        labClass.sortByAverageScore();
        List<Student> students = labClass.getStudents();
        System.out.println("Students sorted by average score:");
        for (Student student : students) {
            System.out.println("Full Name: " + student.getFullName() + ", Average Score: " + student.getAverageScore());
        }
    }

    private void findStudent() {
        System.out.print("Enter full name to search: ");
        String fullName = scanner.nextLine();

        Student student = null;
        try {
            student = labClass.findStudentByFullName(fullName);
        } catch (StudentNoEx e) {
            throw new RuntimeException(e);
        }
        System.out.println("Student found - Full Name: " + student.getFullName() + ", Average Score: " + student.getAverageScore());
    }

    public static void main(String[] args) {
        LabClassUI labClassUI = new LabClassUI();
        labClassUI.run();
    }
}

