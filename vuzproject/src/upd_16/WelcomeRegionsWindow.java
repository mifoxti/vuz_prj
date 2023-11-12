package upd_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomeRegionsWindow extends JFrame {
    public WelcomeRegionsWindow() {
        // Установка заголовка окна
        super("Welcome Regions Window");

        // Установка менеджера компоновки BorderLayout
        setLayout(new BorderLayout());

        // Создание компонентов для каждой области
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.CYAN);
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.YELLOW);
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.GREEN);
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.ORANGE);
        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.PINK);

        // Добавление компонентов в соответствующие области
        add(centerPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);

        // Добавление слушателя мыши для каждой области
        centerPanel.addMouseListener(createWelcomeListener("Добро пожаловать в ЦАО"));
        westPanel.addMouseListener(createWelcomeListener("Добро пожаловать в ЗАО"));
        southPanel.addMouseListener(createWelcomeListener("Добро пожаловать в ЮАО"));
        northPanel.addMouseListener(createWelcomeListener("Добро пожаловать в САО"));
        eastPanel.addMouseListener(createWelcomeListener("Добро пожаловать в ВАО"));

        // Установка параметров окна
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Центрирование окна
        setVisible(true);
    }

    private MouseAdapter createWelcomeListener(String message) {
        return new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, message);
            }
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WelcomeRegionsWindow());
    }
}
