package examples.java.awt.image;

import java.awt.color.ColorModel;
import java.awt.image.DirectColorModel;

/**
 * This class demonstrates the usage of the DirectColorModel
 * class within a single Java file. The code is designed to be runnable.
 * 
 * <p>The example creates an instance of the DirectColorModel
 * class and retrieves the blue mask from it.</p>
 */
public class DirectColorModel_getBlueMask_Example {

    /**
     * Main method that demonstrates the usage of the DirectColorModel
     * class to retrieve the blue mask.
     */
    public static void main(String[] args) {

        // Create an instance of the DirectColorModel class
        ColorModel colorModel = new DirectColorModel(32, ColorModel.getRGBdefaultTransparency());

        // Retrieve the blue mask from the DirectColorModel object
        int blueMask = colorModel.getBlueMask();

        // Print the retrieved blue mask value
        System.out.println("Retrieved Blue Mask Value: " + blueMask);
    }
}