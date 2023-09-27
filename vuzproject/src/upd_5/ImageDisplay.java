package upd_5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplay extends JFrame {

    private JLabel imageLabel;

    public ImageDisplay(String imagePath) throws IOException {
        setTitle("Отображение изображения");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage image = ImageIO.read(new File(imagePath));
        ImageIcon icon = new ImageIcon(image);
        imageLabel = new JLabel(icon);
        add(imageLabel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java ImageDisplay <путь_к_изображению>");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            ImageDisplay imageDisplay = null;
            try {
                imageDisplay = new ImageDisplay(args[0]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            imageDisplay.setVisible(true);
        });
    }
}
