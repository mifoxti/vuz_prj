package upd_15;

import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Калькулятор");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 250, 20);

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");

        Button bPlus = new Button("+");
        Button bMinus = new Button("-");
        Button bMultiply = new Button("*");
        Button bDivide = new Button("/");
        Button bEqual = new Button("=");
        Button bClear = new Button("C");

        // Положение кнопок
        int buttonX = 50;
        int buttonY = 120;
        for (Button button : new Button[] { b1, b2, b3, b4, b5, b6, b7, b8, b9, b0 }) {
            button.setBounds(buttonX, buttonY, 50, 50);
            buttonX += 60;
            if (buttonX > 230) {
                buttonX = 50;
                buttonY += 60;
            }
        }

        bPlus.setBounds(50, 300, 50, 50);
        bMinus.setBounds(110, 300, 50, 50);
        bMultiply.setBounds(170, 300, 50, 50);
        bDivide.setBounds(230, 300, 50, 50);
        bEqual.setBounds(290, 240, 50, 110);
        bClear.setBounds(290, 170, 50, 50);

        // Добавление обработчика событий для операций
        ActionListener operationListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                String currentText = tf.getText();

                // Если поле пусто, то не выполняем операции
                if (currentText.isEmpty()) {
                    return;
                }

                switch (command) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        tf.setText(currentText + " " + command + " ");
                        break;
                    case "=":
                        try {
                            String result = evaluateExpression(currentText);
                            tf.setText(result);
                        } catch (ArithmeticException ex) {
                            tf.setText("Ошибка");
                        }
                        break;
                    case "C":
                        tf.setText("");
                        break;
                }
            }
        };

        // Добавление обработчика событий для операций
        bPlus.addActionListener(operationListener);
        bMinus.addActionListener(operationListener);
        bMultiply.addActionListener(operationListener);
        bDivide.addActionListener(operationListener);
        bEqual.addActionListener(operationListener);
        bClear.addActionListener(operationListener);

        // Добавление обработчика событий для цифровых кнопок
        for (Button button : new Button[] { b1, b2, b3, b4, b5, b6, b7, b8, b9, b0 }) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tf.setText(tf.getText() + e.getActionCommand());
                }
            });
        }

        // Настройка кнопки закрытия окна
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Добавление компонентов на фрейм
        f.add(tf);
        for (Button button : new Button[] { b1, b2, b3, b4, b5, b6, b7, b8, b9, b0 }) {
            f.add(button);
        }
        f.add(bPlus);
        f.add(bMinus);
        f.add(bMultiply);
        f.add(bDivide);
        f.add(bEqual);
        f.add(bClear);

        // Настройка фрейма
        f.setSize(450, 400);
        f.setLayout(null);
        f.setResizable(false); // Запрет изменения размеров окна
        f.setVisible(true);
    }

    private static String evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");
        double num1 = Double.parseDouble(tokens[0]);
        double num2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];

        switch (operator) {
            case "+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "*":
                return String.valueOf(num1 * num2);
            case "/":
                if (num2 != 0) {
                    return String.valueOf(num1 / num2);
                } else {
                    throw new ArithmeticException("Деление на ноль");
                }
            default:
                return expression; // Если оператор не распознан, возвращаем исходное выражение
        }
    }
}

