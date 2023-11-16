package upd_17.Ex_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.invokeLater;

// Модель
class UniversityEmployee {
    private String name;
    private String position;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}

// Представление
class UniversityEmployeeView {
    private JTextField nameField = new JTextField(10);
    private JTextField positionField = new JTextField(10);
    private JTextField salaryField = new JTextField(10);
    private JButton displayButton = new JButton("Display");
    private JButton promoteButton = new JButton("Promote");
    private JButton demoteButton = new JButton("Demote");

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getPositionField() {
        return positionField;
    }

    public JTextField getSalaryField() {
        return salaryField;
    }

    public JButton getDisplayButton() {
        return displayButton;
    }

    public JButton getPromoteButton() {
        return promoteButton;
    }

    public JButton getDemoteButton() {
        return demoteButton;
    }

    public void createAndShowGUI(UniversityEmployeeController controller) {
        // Создаем и настраиваем окно
        JFrame frame = new JFrame("MVC Demo");

        // Добавляем слушателей к кнопкам
        displayButton.addActionListener(controller);
        promoteButton.addActionListener(controller);
        demoteButton.addActionListener(controller);

        // Добавляем компоненты в окно
        //JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Enter name:");
        nameLabel.setHorizontalAlignment(JLabel.RIGHT);
        JLabel positionLabel = new JLabel("Enter position:");
        positionLabel.setHorizontalAlignment(JLabel.RIGHT);
        JLabel salaryLabel = new JLabel("Enter salary:");
        salaryLabel.setHorizontalAlignment(JLabel.RIGHT);


        nameLabel.setBounds(10, 20, 100, 25);
        positionLabel.setBounds(10, 50, 100, 25);
        salaryLabel.setBounds(10, 80, 100, 25);

        nameField.setBounds(120, 20, 100, 25);
        positionField.setBounds(120, 50, 100, 25);
        salaryField.setBounds(120, 80, 100, 25);

        displayButton.setBounds(250, 20, 115, 85);
        promoteButton.setBounds(29, 115, 166, 30);
        demoteButton.setBounds(200, 115, 166, 30);
        promoteButton.setBackground(Color.green);
        demoteButton.setBackground(Color.red);

        frame.add(nameLabel);
        frame.add(salaryLabel);
        frame.add(positionLabel);

        frame.add(nameField);
        frame.add(positionField);
        frame.add(salaryField);

        frame.add(displayButton);
        frame.add(promoteButton);
        frame.add(demoteButton);

        // Отображаем окно
        frame.setSize(400, 205);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void displayEmployeeDetails(String name, String position, int salary) {
        JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\nPosition: " + position + "\nSalary: " + salary);
    }
}

// Контроллер
class UniversityEmployeeController implements ActionListener {
    private UniversityEmployee model;
    private UniversityEmployeeView view;

    public UniversityEmployeeController(UniversityEmployee model, UniversityEmployeeView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getDisplayButton()) {
            model.setName(view.getNameField().getText());
            model.setPosition(view.getPositionField().getText());
            model.setSalary(Integer.parseInt(view.getSalaryField().getText()));
            view.displayEmployeeDetails(model.getName(), model.getPosition(), model.getSalary());
        } else if (e.getSource() == view.getPromoteButton()) {
            model.setPosition("Senior ");
            model.setSalary((int) (model.getSalary() * 1.1)); // Повышение зарплаты на 10%
            view.displayEmployeeDetails(model.getName(), model.getPosition(), model.getSalary());
        } else if (e.getSource() == view.getDemoteButton()) {
            model.setPosition("Junior ");
            model.setSalary((int) (model.getSalary() * 0.9)); // Понижение зарплаты на 10%
            view.displayEmployeeDetails(model.getName(), model.getPosition(), model.getSalary());
        }
    }
}

public class MVCPatternDemo {
    public static void main(String[] args) {
        UniversityEmployee model = new UniversityEmployee();
        UniversityEmployeeView view = new UniversityEmployeeView();
        UniversityEmployeeController controller = new UniversityEmployeeController(model, view);

        invokeLater(new Runnable() {
            public void run() {
                view.createAndShowGUI(controller);
            }
        });
    }
}



