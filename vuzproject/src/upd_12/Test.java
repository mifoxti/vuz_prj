package upd_12;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {
    private int x = 50; // начальная координата X прямоугольника
    private int y = 50; // начальная координата Y прямоугольника
    private int width = 50; // ширина прямоугольника
    private int height = 50; // высота прямоугольника

    public Test() {
        setTitle("Пример рисования в Java");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(x, y, width, height); // рисуем прямоугольник

        // Проверяем, чтобы прямоугольник не выходил за границы холста
        if (x + width > getWidth()) {
            x = getWidth() - width;
        }
        if (y + height > getHeight()) {
            y = getHeight() - height;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Test();
        });
    }
}