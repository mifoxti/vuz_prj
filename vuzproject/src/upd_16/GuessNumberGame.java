package upd_16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGame extends JFrame {
    private int secretNumber;
    private int attemptsLeft = 3;

    private JLabel instructionLabel;
    private JTextField guessField;
    private JButton guessButton;

    public GuessNumberGame() {
        // Установка заголовка окна
        super("Guess the Number Game");

        // Генерация случайного числа от 0 до 20
        secretNumber = (int) (Math.random() * 21);

        // Создание компонентов
        instructionLabel = new JLabel("Guess the number between 0 and 20:");
        guessField = new JTextField(5);
        guessButton = new JButton("Guess");

        // Добавление слушателя событий к кнопке
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        // Создание панели и добавление компонентов
        JPanel panel = new JPanel();
        panel.add(instructionLabel);
        panel.add(guessField);
        panel.add(guessButton);

        // Установка компонентов в окне
        add(panel);

        // Установка параметров окна
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Центрирование окна
        setVisible(true);
    }

    private void checkGuess() {
        // Получение значения, введенного пользователем
        String input = guessField.getText();

        try {
            // Попытка преобразования введенной строки в число
            int guess = Integer.parseInt(input);

            // Проверка угадывания числа
            if (guess == secretNumber) {
                JOptionPane.showMessageDialog(this, "Congratulations! You guessed the number!");
                System.exit(0);
            } else {
                attemptsLeft--;

                if (attemptsLeft > 0) {
                    JOptionPane.showMessageDialog(this, "Incorrect guess. Try again. Attempts left: " + attemptsLeft);
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry, you've run out of attempts. The correct number was: " + secretNumber);
                    System.exit(0);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }

        // Очистка поля ввода после каждой попытки
        guessField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessNumberGame();
            }
        });
    }
}
