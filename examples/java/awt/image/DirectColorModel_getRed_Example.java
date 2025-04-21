package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.DirectColorModel;

/**
 * This example demonstrates how to use the DirectColorModel class in Java's AWT (Abstract Window Toolkit) package. The example specifically focuses on the `getRed()` method of the `Color` object, which is used with the `DirectColorModel`.
 * 
 * This example provides a minimalist implementation focused on demonstrating the usage and functionality of the DirectColorModel class in Java's AWT package.
 */
public class DirectColorModel_getRed_Example {

    // Inline comment explaining the purpose of this field
    private final int width = 500; // Width of the buffered image

    /**
     * This method initializes a new BufferedImage object with the specified width and ColorModel. In this case, we use the DirectColorModel as our ColorModel.
     * 
     * @param   width      Width of the buffered image
     * @return  BufferedImage object initialized with the specified width, ColorModel (DirectColorModel), and optional alpha channel parameter (default: 0).
     */
    public BufferedImage initializeBufferedImage(int width) {

        // Create a new DirectColorModel object
        DirectColorModel colorModel = new DirectColorModel(32, Color.RGB);

        // Initialize a new BufferedImage object with the specified width and ColorModel (DirectColorModel).
        // Optional parameter: Set an initial alpha channel value (default: 0).
        BufferedImage bufferedImage = new BufferedImage(width, 1, colorModel.getTransparency());

        return bufferedImage;
    }

    /**
     * This method demonstrates the usage and functionality of the DirectColorModel class in Java's AWT package. The example specifically focuses on the `getRed()` method of the `Color` object, which is used with the `DirectColorModel`.
     * 
     * @param   bufferedImage      BufferedImage object initialized with the specified width, ColorModel (DirectColorModel), and optional alpha channel parameter (default: 0).
     */
    public void demonstrateUsage(BufferedImage bufferedImage) {

        // Get the width of the BufferedImage
        int width = bufferedImage.getWidth();

        // Loop through each pixel in the BufferedImage
        for (int x = 0; x < width; x++) {

            // Get the y-coordinate of the current pixel
            int y = 0; // Initialize to the topmost row of pixels

            // Get the Color object representing the current pixel
            Color color = new Color(bufferedImage.getRGB(x, y))));

            // Print the red component of the Color object (range: 0-255))
            System.out.println("Pixel at (" + x + "," + y + "): Red Component = " + color.getRed());
        }
    }
}