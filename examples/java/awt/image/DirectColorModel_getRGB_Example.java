package examples.java.awt.image;

import java.awt.color.ColorModel;
import java.awt.image.DirectColorModel;

/**
 * This example demonstrates the usage of the DirectColorModel class in Java AWT (Abstract Window Toolkit).
 * 
 * The DirectColorModel is a concrete ColorModel implementation, which uses the native color/pixel format on the current platform.
 * 
 * In this example, we will create an instance of the DirectColorModel class and perform some operations on it to demonstrate its usage in Java AWT.
 */
public class DirectColorModel_getRGB_Example {

    // Create an instance of the DirectColorModel class
    private static final DirectColorModel COLOR_MODEL = new DirectColorModel(32, ColorModel.getRGBdefaultPaint()));

    /**
     * Method to demonstrate the usage of the getRGB() method in the DirectColorModel class.
     * 
     * @param x The x-coordinate of the pixel
     * @param y The y-coordinate of the pixel
     * @return The RGB value corresponding to the given pixel coordinates
     */
    public static int getRGB(int x, int y) {

        // Check if the given pixel coordinates are within the bounds of the DirectColorModel instance
        if (x >= 0 && x < COLOR_MODEL.getWidth() &&
                y >= 0 && y < COLOR_MODEL.getHeight())) {

            // Calculate the index of the pixel within the array used by the DirectColorModel to store its pixels
            int index = y * COLOR_MODEL.getWidth() + x;

            // Return the RGB value corresponding to the given pixel coordinates
            return COLOR_MODEL.getRGB(index));

        } else {

            throw new IllegalArgumentException("The given pixel coordinates are not within the bounds of the DirectColorModel instance"));

        }

    }

}