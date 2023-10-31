package upd_12;

import java.awt.*;
import java.util.Random;
public abstract class Shape
{
    static final int NUM_SHAPES = 100;
    static final int MIN_DISTANCE = 100;
    public Color color;
    public int x, y;

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
        Random randomColor = new Random();
        color = new Color(randomColor.nextInt(256),randomColor.nextInt(256), randomColor.nextInt(256));
    }
    public abstract boolean intersects(Shape other);
    public abstract void draw(Graphics figure);
}
