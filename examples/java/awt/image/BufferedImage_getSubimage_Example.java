package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * Example that demonstrates how to use the `getSubimage` method of the `BufferedImage` class. This example creates a `BufferedImage` from an image file, gets a subimage from it, and draws the subimage onto another `BufferedImage`.
 */
public class BufferedImage_getSubimage_Example {

    /**
     * Entry point for this example.
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create a BufferedImage from an image file
        BufferedImage src = ImageIO.read(new File("src.png")));

        // Get a subimage from the source BufferedImage
        int x1 = 50;
        int y1 = 30;
        int width = 100;
        int height = 150;
        BufferedImage sub = src.getSubimage(x1, y1, width, height));

        // Create a new BufferedImage to draw the subimage onto
        BufferedImage dst = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Draw the subimage onto the destination BufferedImage
        Graphics2D g = (Graphics2D) dst.getGraphics();
        g.drawImage(sub, 0, 0, width, height, null);
        g.dispose();

        // Display the resulting image
        JFrame frame = new JFrame("BufferedImage_getSubimage_Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize(width, height));
        frame.add(new JLabel(new ImageIcon(dst)))));
        frame.setVisible(true));
    }
}