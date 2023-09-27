package upd_5;
import java.awt.*;

class Circle extends Shape {
    private int radius;

    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getPosition().x - radius, getPosition().y - radius, 2 * radius, 2 * radius);
    }
}
