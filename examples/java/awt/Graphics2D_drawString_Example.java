package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Graphics2D_drawString_Example {

    /**
     * A Java example that demonstrates how to use 
     * the `Graphics2D` class within a single 
     * Java file. This code creates an instance of 
     * `Graphics2D`, sets up rendering hints, 
     * draws a string using `drawString()` method and finally 
     * returns a `BufferedImage` containing the drawn string.
     */

    public BufferedImage drawStringExample() {

        // Create a new BufferedImage with an ARGB channel structure
        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D) image.getGraphics();

        // Set up rendering hints for better quality text drawing
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIASING_ON)));

        g2d.setRenderingHints(hints));

        // Set the font and text color for drawing
        Font font = new Font("Arial", Font.PLAIN);
        g2d.setFont(font);
        g2d.setColor(Color.BLACK));

        // Draw a string using drawString() method
        g2d.drawString("Hello World!" , 50, 150));

        // Dispose the Graphics2D instance to clean up resources
        g2d.dispose();

        return image;
    }

}