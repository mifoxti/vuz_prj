package upd_17.Ex_2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model  = new Employee("Ivan", 150000.0);

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeSalary(160000.0);
        controller.updateView();
    }
}
