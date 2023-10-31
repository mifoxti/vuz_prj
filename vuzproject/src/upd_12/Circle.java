package upd_12;

import java.awt.*;

public class Circle extends Shape
{
    public int radius;
    public Circle(int x, int y, int radius)
    {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics figure)
    {
        figure.setColor(color);
        int circleX, circleY, circleWidth, circleHeight;
        figure.fillOval(x-5, y-5, 2 * radius, 2 * radius);
    }
    @Override
    public boolean intersects(Shape other) {
        if (other instanceof Circle) {
            Circle otherCircle = (Circle) other;
            int distanceSquared = (x - otherCircle.x) * (x - otherCircle.x) +
                    (y - otherCircle.y) * (y - otherCircle.y);
            int sumOfRadii = radius + otherCircle.radius;
            return distanceSquared < sumOfRadii * sumOfRadii;
        } else if (other instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) other;
            int closestX = clamp(x , rectangle.x, rectangle.x + rectangle.width);
            int closestY = clamp(y, rectangle.y, rectangle.y + rectangle.height);
            int distanceSquared = (x - closestX) * (x - closestX) + (y - closestY) * (y - closestY);
            return distanceSquared < (radius + 25)* (radius + 25);
        }
        return false;
    }
    private int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(val, max));
    }
}