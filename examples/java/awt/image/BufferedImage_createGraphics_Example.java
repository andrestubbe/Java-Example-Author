package examples.java.awt.image;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * This example demonstrates the creation of a graphics object from a BufferedImage object.
 */
public class BufferedImage_createGraphics_Example {

    public static void main(String[] args) {
        // Create a new BufferedImage with a width and height of 500 pixels each.
        BufferedImage bufferedImage = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);

        // Get the graphics object associated with the BufferedImage object.
        Graphics graphics = bufferedImage.getGraphics();

        // Set the color for subsequent drawing operations to red.
        graphics.setColor(java.awt.Color.RED));

        // Draw a rectangle on the BufferedImage object, starting at (50, 50), and with a width of 200 pixels and a height of 100 pixels each.
        graphics.drawRect(50, 50, 200, 100));

        // Dispose the graphics object to release any resources associated with it.
        graphics.dispose();

        try {
            // Save the BufferedImage object as an image file in PNG format at the current working directory with the filename "buffered-image-example.png".
            File outputFile = new File("buffered-image-example.png");
            javax.imageio.ImageIO.write(bufferedImage, "PNG", outputFile);
        } catch (Exception e) {
            System.out.println("An error occurred while saving the image file.");
            e.printStackTrace();
        }

        // Display a message to indicate that the BufferedImage object was successfully created and saved as an image file in PNG format at the current working directory with the filename "buffered-image-example.png".
        System.out.println("BufferedImage example completed successfully. The BufferedImage object was successfully created and saved as an image file in PNG format at the current working directory with the filename \"buffered-image-example.png\". Thanks for using the BufferedImage example code!");

    }
}