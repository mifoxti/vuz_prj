package upd_5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    private Color color;
    private Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public Point getPosition() {
        return position;
    }

    public abstract void draw(Graphics g);
}
