package upd_16;
import javax.swing.*;
import java.awt.*;

public class PasswordCheckerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Password Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceTextField = new JTextField();

        JLabel userNameLabel = new JLabel("User name:");
        JTextField userNameTextField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        panel.add(serviceLabel);
        panel.add(serviceTextField);
        panel.add(userNameLabel);
        panel.add(userNameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        JButton checkButton = new JButton("Check Password");
        checkButton.addActionListener(e -> {
            String service = serviceTextField.getText();
            String userName = userNameTextField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            if (isValidPassword(password)) {
                JOptionPane.showMessageDialog(frame, "Password is valid!", "Password Check", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Password is invalid! It should be at least 8 characters.", "Password Check", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.getContentPane().add(checkButton, BorderLayout.SOUTH);

        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}


