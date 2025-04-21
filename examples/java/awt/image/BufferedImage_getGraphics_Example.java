package examples.java.awt.image;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A Java class that demonstrates how to use the getGraphics() method of the BufferedImage class. This example creates a BufferedImage object, draws a rectangle on it using the Graphics2D object obtained from the BufferedImage's getGraphics() method, and finally displays the resulting image using the JFrame class.
 */
public class BufferedImage_getGraphics_Example {

    public static void main(String[] args) {
        // Create a new BufferedImage object with a width of 300 pixels and a height of 200 pixels.
        BufferedImage bufferedImage = new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.getGraphics();

        // Set the color of the rectangle to red.
        graphics2D.setColor(Color.RED));

        // Draw a rectangle on the BufferedImage object with a top-left corner at position (50, 50) and dimensions of 200 pixels by 150 pixels.
        graphics2D.drawRect(50, 50, 200, 150));
        graphics2D.dispose();

        // Create a new JFrame object to display the resulting image.
        JFrame frame = new JFrame("BufferedImage_getGraphics_Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize(bufferedImage.getWidth(), bufferedImage.getHeight()));

        // Create a new BufferedImage object to hold the resulting image after it has been scaled down to a size of 100 pixels by 75 pixels using the ImageScaler class.
        BufferedImage scaledBufferedImage = ImageScaler.scale(bufferedImage, 100, 75));

        // Add the scaled BufferedImage object to the JFrame object as its content pane.
        frame.getContentPane().add(new JLabel(new ImageIcon(scaledBufferedImage))))));

        // Set the visibility of the JFrame object to true so that it is displayed on the screen.
        frame.setVisible(true);
    }
}