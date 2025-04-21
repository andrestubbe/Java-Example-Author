package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;

public class DirectColorModel_getDataElement_Example {

    /**
     * This example demonstrates how to use the `DirectColorModel` class within a single Java file. The code creates an instance of `BufferedImage`, sets its color model to `DirectColorModel`, and then retrieves the pixel data for the image.
     */

    public static void main(String[] args) {
        
        // Create a BufferedImage with ARGB base-color model (default): Direct Color Model
        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        
        // Retrieve the pixel data for the image
        int[] pixels = image.getRGB(0, 0, image.getWidth(), image.getHeight(), new int[image.getWidth() * image.getHeight()]], 0);

        // Print the first 10 pixels of the image
        for (int i = 0; i < 10; i++) {
            System.out.println("Pixel " + i + ": " + Integer.toHexString(pixels[i]))));
        }
    }
}