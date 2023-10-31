package upd_12;

import java.awt.*;

public class Rectangle extends Shape
{
    public int width, height;
    public Rectangle(int x, int y, int width, int height)
    {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics figure) {
        figure.setColor(color);
        figure.fillRect(x, y, width, height);
    }
    @Override
    public boolean intersects(Shape other) {
        if (other instanceof Circle) {
            return other.intersects(this);
        } else if (other instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) other;
            return x < rectangle.x + rectangle.width &&
                    x + width > rectangle.x &&
                    y < rectangle.y + rectangle.height &&
                    y + height > rectangle.y;
        }
        return false;
    }
}
