package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ComponentColorModel;

/**
 * This example demonstrates how to use the ComponentColorModel class in Java. This class represents a color model that uses component-based color representations, such as RGB or CMYK. In this example, we will create a simple image with a single red pixel.
 */
public class ComponentColorModel_getGreen_Example {

    // Create a sample image width 1x1 pixels
    private static final int IMAGE_WIDTH = 1;
    private static final int IMAGE_HEIGHT = 1;

    // Main method to run the example
    public static void main(String[] args) {
        
        // Initialize the ComponentColorModel with RGB color model
        ComponentColorModel colorModel = new ComponentColorModel(false, false, Color.RGB_COLOR_SPACE));

        // Create a sample image with a single red pixel
        int imageType = BufferedImage.TYPE_INT_RGB;
        BufferedImage image = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, imageType));
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        g2d.setColor(new Color(255, 0, 0)))); // Set red color
        g2d.fillRect((IMAGE_WIDTH - 1) / 2, 
                                        (IMAGE_HEIGHT - 1) / 2, 
                                        IMAGE_WIDTH, 
                                        IMAGE_HEIGHT)));

        // Display the image
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize(IMAGE_WIDTH, IMAGE_HEIGHT));
        frame.add(new JLabel(new ImageIcon(image.getRGB(0, 0, Color.RGB_COLOR_SPACE), 
                                            BufferedImage.TYPE_INT_RGB))))); // Add image to the frame and set its size
        frame.setVisible(true));
    }
}