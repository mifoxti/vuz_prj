package upd_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaExample extends JFrame {
    private JTextArea textArea;

    public JTextAreaExample() {
        setTitle("JTextArea Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);

        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        blueItem.addActionListener(new ColorMenuItemListener(Color.BLUE));
        redItem.addActionListener(new ColorMenuItemListener(Color.RED));
        blackItem.addActionListener(new ColorMenuItemListener(Color.BLACK));

        JMenu fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");
        JMenuItem segoeUiLightItem = new JMenuItem("Segoe UI Light");

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);
        fontMenu.add(segoeUiLightItem);

        timesNewRomanItem.addActionListener(new FontMenuItemListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontMenuItemListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontMenuItemListener("Courier New"));
        segoeUiLightItem.addActionListener(new FontMenuItemListener("Segoe UI Light"));
    }

    private class ColorMenuItemListener implements ActionListener {
        private Color color;

        public ColorMenuItemListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontMenuItemListener implements ActionListener {
        private String fontName;

        public FontMenuItemListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font font;
            if (fontName.equals("Segoe UI Light")) {
                font = new Font(fontName, Font.PLAIN, 14); // Установите размер по вашему усмотрению
            } else {
                font = new Font(fontName, Font.PLAIN, 12);
            }
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTextAreaExample example = new JTextAreaExample();
            example.setVisible(true);
        });
    }
}


