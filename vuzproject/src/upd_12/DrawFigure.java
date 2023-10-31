package upd_12;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class DrawFigure extends JPanel
{
    public int width = 750, height = 750, figures = 90;
    public Shape[] shapes;
    // private ArrayList<Shape> shap;
    private ArrayList<Shape> shapess;

    public DrawFigure()
    {
        Shape newShape;
        shapess = new ArrayList<>();
        shapes = new Shape[figures];
        Random random = new Random();
        int x, y, radius, widthR, heightR;
        for (int i = 0; i < figures; i++)
        {
            x = random.nextInt(width);
            while ((x < 5) || (x >= width - 5))
                x = random.nextInt(width);
            y = random.nextInt(height);
            while ((y  < 5)  || (y >= height - 5))
                y = random.nextInt(height);

            if (random.nextBoolean()) {
                radius = random.nextInt(15);
               // radius = 15;
                if (x + (2 * radius) >= width - 5) {
                    x = width - 2 * radius;
                }
                if (y + (2 * radius) >= height - 5) {
                    y = height - 2 * radius;
                }
                newShape = new Circle(x, y, radius);
            }
            else
            {

                widthR = random.nextInt(200);
                heightR = random.nextInt(200);
                if (x + widthR > width) {
                    x = width - widthR - 5;
                }
                if (y + heightR > height) {
                    y = height - heightR - 5;
                }
            newShape = new Rectangle(x, y, widthR, heightR);
            }
            boolean intersects = false;
            for (Shape existingShape : shapess) {
                if (newShape.intersects(existingShape)) {
                    intersects = true;
                    break;
                }
            }
            if (intersects) {
                i--;
                continue;
            }
            shapess.add(newShape);
        }
    }
    boolean shapesIntersect() {
        for (int i = 0; i < shapess.size(); i++) {
            for (int j = i + 1; j < shapess.size(); j++) {
                if (shapess.get(i).intersects(shapess.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected void paintComponent(Graphics figure)
    {
        super.paintComponent(figure);
        for (Shape shape : shapess) {
                shape.draw(figure);
        }
    }
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(width, height);
    }

}
