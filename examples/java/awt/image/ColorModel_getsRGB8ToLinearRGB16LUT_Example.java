package examples.java.awt.image;

import java.awt.image.ColorModel;

/**
 * Example of getting a ColorModel that uses an RGB8 to linear RGB16 LUT.
 * 
 * This example demonstrates how to create a ColorModel instance that uses an RGB8 to linear RGB16 LUT. The example shows how to create a ColorModel object and print its information.
 */
public class ColorModel_getsRGB8ToLinearRGB16LUT_Example {

    // Declare the ColorModel instance variable
    private static final ColorModel COLOR_MODEL = new ColorModel(false, false, false, 4));

    /**
     * Main method that creates a ColorModel object and prints its information.
     */
    public static void main(String[] args) {
        // Print the information of the ColorModel instance
        System.out.println("Color Model: " + COLOR_MODEL);
    }

}