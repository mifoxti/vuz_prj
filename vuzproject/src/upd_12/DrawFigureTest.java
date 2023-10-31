package upd_12;

import javax.swing.*;

public class DrawFigureTest
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawFigure());
        frame.pack();
        frame.setVisible(true);
    }
}
