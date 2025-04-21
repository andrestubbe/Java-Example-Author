package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * This example demonstrates how to use the `getColorSpace()` method of the `ColorModel` class. 
 * The `getColorSpace()` method returns an integer value representing the color space used by the `ColorModel` instance.
 * In this example, we will create a simple Java program that utilizes the `getColorSpace()` method of the `ColorModel` class to retrieve the color space information.
 */
public class ColorModel_getColorSpace_Example {

    /**
     * Main method entry point for the Java application.
     * This method initializes and starts the execution of the program.
     * @param args Command line arguments passed to the program's entry point.
     */
    public static void main(String[] args) {

        // Instantiate a ColorModel object
        ColorModel colorModel = new ColorModel();

        // Get the color space information using the getColorSpace() method
        int colorSpaceInfo = colorModel.getColorSpace();

        // Print the retrieved color space information
        System.out.println("Retrieved color space information: " + colorSpaceInfo);

    }

}