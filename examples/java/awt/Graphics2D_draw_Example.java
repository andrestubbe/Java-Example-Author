package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Graphics2D_draw_Example {

    /**
     * This example demonstrates how to use the 
     * Graphics2D class within a single Java file. 
     * The code is designed to be runnable and 
     * creates a BufferedImage and uses the 
     * Graphics2D object to draw a simple 
     * shape (a circle) on the BufferedImage.
     */

    public static void main(String[] args) {

        // Create a new BufferedImage with a width of 600 pixels and a height of 400 pixels.
        BufferedImage bufferedImage = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();

        // Set the rendering hints for the Graphics2D object to improve the quality of the rendered shapes.
        RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIASING_ON)));
        graphics2D.setRenderingHints(renderingHints));

        // Draw a circle on the BufferedImage using the Graphics2D object.
        int centerX = 300;
        int centerY = 200;
        int radius = 100;
        graphics2D.setColor(java.awt.Color.BLUE));
        graphics2D.fillOval(centerX - radius, 
                centerY - radius, 
                radius * 2, 
                radius * 2);

        // Dispose the Graphics2D object to release any resources associated with it.
        graphics2D.dispose();

        // Output the BufferedImage as a PNG image file.
        javax.imageio.ImageIO.write(bufferedImage, "png"));

    }

}