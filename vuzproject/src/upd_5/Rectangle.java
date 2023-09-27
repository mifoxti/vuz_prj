package upd_5;
import java.awt.*;


class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, Point position, int width, int height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getPosition().x, getPosition().y, width, height);
    }
}
