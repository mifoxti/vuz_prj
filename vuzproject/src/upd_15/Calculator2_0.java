package upd_15;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2_0 {
    private JFrame frame;
    private JTextField displayField;

    private String currentInput = "";
    private double currentResult = 0.0;
    private char currentOperator = ' ';

    public Calculator2_0() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        frame.add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); // Добавлено пространство между кнопками

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ",", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            button.setPreferredSize(new Dimension(40, 40)); // Установка размеров кнопок
            buttonPanel.add(button);
        }

        // Добавлен EmptyBorder для создания пространства вокруг панели кнопок
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            String buttonText = sourceButton.getText();

            switch (buttonText) {
                case "=":
                    calculateResult();
                    break;
                case ",":
                    if (!currentInput.contains(".")) {
                        currentInput += ".";
                    }
                    break;
                default:
                    currentInput += buttonText;
                    break;
            }

            displayField.setText(currentInput);
        }

        private void calculateResult() {
            try {
                double inputNumber = Double.parseDouble(currentInput);

                switch (currentOperator) {
                    case '+':
                        currentResult += inputNumber;
                        break;
                    case '-':
                        currentResult -= inputNumber;
                        break;
                    case '*':
                        currentResult *= inputNumber;
                        break;
                    case '/':
                        if (inputNumber != 0) {
                            currentResult /= inputNumber;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Деление на ноль невозможно", "Ошибка", JOptionPane.ERROR_MESSAGE);
                            currentInput = "";
                            currentResult = 0.0;
                            currentOperator = ' ';
                            displayField.setText(currentInput);
                            return;
                        }
                        break;
                    default:
                        currentResult = inputNumber;
                        break;
                }

                currentInput = Double.toString(currentResult);
                currentOperator = ' ';
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Ошибка ввода", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator2_0::new);
    }
}

