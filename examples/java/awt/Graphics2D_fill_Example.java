package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Graphics2D_fill_Example {

    /**
     * This example demonstrates how to use 
     * the `Graphics2D` class within a single 
     * Java file. The code creates a red-filled 
     * rectangle on a transparent background using the `BufferedImage` and `Graphics2D` classes.
     */

    public static void main(String[] args) {

        // Create a new BufferedImage with a transparent background

        BufferedImage buffer = new BufferedImage(500, 500, BufferedImage.TRANSLUCENT));

        // Obtain the Graphics2D object for drawing on the BufferedImage

        Graphics2D graphics = (Graphics2D) buffer.getGraphics();

        // Set rendering hints to improve image quality

        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
                                                                                             RenderingHints.VALUE_ANTIALIASING_ON)));

        graphics.setRenderingHints(hints));

        // Set the color and fill style for drawing a red-filled rectangle

        graphics.setColor(java.awt.Color.RED));

        graphics.fillRect(100, 100, 200, 200));

        // Dispose the Graphics2D object

        graphics.dispose();

        }

}