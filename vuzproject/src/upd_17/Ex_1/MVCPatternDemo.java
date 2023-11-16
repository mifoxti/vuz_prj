package upd_17.Ex_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Эржан");
        System.out.println("After updating, Course Details are as follows");
        controller.updateView();
    }
    private static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Тимофей");
        student.setRollNo("22И0807");
        return student;
    }
}