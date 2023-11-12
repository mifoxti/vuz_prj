package upd_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Пример меню");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Создание меню
            JMenuBar menuBar = new JMenuBar();

            // Меню "Файл"
            JMenu fileMenu = new JMenu("Файл");
            JMenuItem saveItem = new JMenuItem("Сохранить");
            JMenuItem exitItem = new JMenuItem("Выйти");
            fileMenu.add(saveItem);
            fileMenu.addSeparator();
            fileMenu.add(exitItem);

            // Меню "Правка"
            JMenu editMenu = new JMenu("Правка");
            JMenuItem copyItem = new JMenuItem("Копировать");
            JMenuItem cutItem = new JMenuItem("Вырезать");
            JMenuItem pasteItem = new JMenuItem("Вставить");
            editMenu.add(copyItem);
            editMenu.add(cutItem);
            editMenu.add(pasteItem);

            // Меню "Справка"
            JMenu helpMenu = new JMenu("Справка");

            // Добавление меню в строку меню
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(helpMenu);

            // Панель с кнопками и текстовым полем
            JPanel panel = new JPanel(new BorderLayout());

            // Панель для кнопок
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            // Добавление кнопок
            JButton button1 = new JButton("Кнопка 1");
            JButton button2 = new JButton("Кнопка 2");
            buttonPanel.add(button1);
            buttonPanel.add(button2);

            // Добавление текстового поля
            JTextArea textArea = new JTextArea();
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Добавление компонентов на панель
            panel.add(buttonPanel, BorderLayout.NORTH);
            panel.add(scrollPane, BorderLayout.CENTER);

            // Обработчик событий для кнопки "Сохранить"
            saveItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Логика сохранения
                    JOptionPane.showMessageDialog(frame, "Файл сохранен");
                }
            });

            // Обработчик событий для кнопки "Выйти"
            exitItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            // Добавление компонентов на фрейм
            frame.setJMenuBar(menuBar);
            frame.getContentPane().add(panel);

            // Настройка фрейма
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}


