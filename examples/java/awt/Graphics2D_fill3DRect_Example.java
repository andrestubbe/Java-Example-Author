package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * This class demonstrates the usage of
 * the Graphics2D class within a single Java file. The code creates a runnable example that fills and outlines three different rectangles using the `fill3DRect()` method. Additionally, the code includes necessary imports and provides comments to explain its result.
 */
public class Graphics2D_fill3DRect_Example {

    /**
     * This method creates a BufferedImage object of specified width and height, and then fills and outlines three different rectangles using the `fill3DRect()` method within a single Java file.
     * @param width The width of the BufferedImage to be created.
     * @param height The height of the BufferedImage to be created.
     */
    public static void drawRectangle(int width, int height) {

        // Create a BufferedImage object with specified width and height
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Get the Graphics2D context of the BufferedImage to be drawn on
        Graphics2D graphics2D = (Graphics2D) image.getGraphics();

        // Set the rendering hints for better quality and performance
        RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_DEFAULT_QUALITY));
        graphics2D.setRenderingHints(renderingHints));

        // Define the parameters for filling and outlining the rectangles
        int x = 50;
        int y = 50;
        int width1 = 100;
        int height1 = 50;
        int width2 = 75;
        int height2 = 60;
        int width3 = 125;
        int height3 = 80;

        // Fill and outline three different rectangles using the `fill3DRect()` method
        graphics2D.setColor(java.awt.Color.BLUE));
        graphics2D.fill3DRect(x, y, width1, height1), java.awt.Color.WHITE);
        graphics2D.drawRect(x - 2, y - 2, width1 + 4, height1 + 4), java.awt.Color.BLACK);

        graphics2D.setColor(java.awt.Color.RED));
        graphics2D.fill3DRect(x + 100, y + 50, width2, height2), java.awt.Color.WHITE);
        graphics2D.drawRect(x + 102, y + 52, width2 - 4, height2 - 4), java.awt.Color.BLACK);

        graphics2D.setColor(java.awt.Color.GREEN));
        graphics2D.fill3DRect(x + 200, y + 100, width3, height3), java.awt.Color.WHITE);
        graphics2D.drawRect(x + 202, y + 102, width3 - 4, height3 - 4), java.awt.Color.BLACK);

        // Dispose the Graphics2D object to release resources and end the drawing process
        graphics2D.dispose();

        // Output the resulting BufferedImage object as a PNG image file with 100 symbols hard-wrap
        java.io.File outputFile = new java.io.File("output.png");
        javax.imageio.ImageIO.write(image, "PNG", outputFile));
    }

    public static void main(String[] args) {
        // Call the drawRectangle() method to create and save the resulting BufferedImage object as a PNG image file
        drawRectangle(400, 400));
    }
}