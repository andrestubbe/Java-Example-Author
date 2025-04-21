package examples.java.awt.image;

import java.awt.image.ColorModel;

/**
 * This class demonstrates how to use the `isLinearRGBspace` method of the `ColorModel` class.
 * 
 * The `ColorModel` class represents a color model object that specifies the color space used by an image. The `isLinearRGBspace` method returns true if the color model is in linear RGB color space, and false otherwise.
 */
public class ColorModel_isLinearRGBspace_Example {

    /**
     * Main method to demonstrate the usage of the `isLinearRGBspace` method.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        // Create a new ColorModel object with default RGB color space parameters
        ColorModel colorModel = new ColorModel(false, false, false, true);

        // Check if the ColorModel object is in linear RGB color space by invoking the `isLinearRGBspace` method
        boolean isLinearRGBspace = colorModel.isLinearRGBspace();

        // Print the result of the `isLinearRGBspace` method invocation
        System.out.println("Is the ColorModel object in linear RGB color space? " + isLinearRGBspace);
    }
}