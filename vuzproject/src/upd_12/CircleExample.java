package upd_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleExample extends JFrame implements ActionListener {
    private int x = 50; // начальная координата X круга
    private int y = 50; // начальная координата Y круга
    private int radius = 30; // радиус круга
    private Timer timer;

    public CircleExample() {
        setTitle("Пример рисования круга в Java");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        timer = new Timer(10, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (x + 2 * radius > getWidth() || x < 0) {
            x = getWidth() - 2 * radius;
        }
        if (y + 2 * radius > getHeight() || y < 0) {
            y = getHeight() - 2 * radius;
        }
        x += 1; // перемещаем круг вправо
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(x, y, 2 * radius, 2 * radius); // рисуем круг
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CircleExample();
        });
    }
}