package upd_5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp extends JPanel {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private final Random random = new Random();

    private Shape[] shapes;

    public RandomShapesApp() {
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            Point position = new Point(x, y);
            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 20; // Радиус от 20 до 69
                shapes[i] = new Circle(randomColor, position, radius);
            } else {
                int width = random.nextInt(100) + 50; // Ширина от 50 до 149
                int height = random.nextInt(100) + 50; // Высота от 50 до 149
                shapes[i] = new Rectangle(randomColor, position, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            RandomShapesApp app = new RandomShapesApp();
            frame.add(app);
            frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
