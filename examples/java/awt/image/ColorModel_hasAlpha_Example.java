package examples.java.awt.image;

import java.awt.image.ColorModel;

/**
 * This class demonstrates how to use the `hasAlpha` property of the {@link ColorModel} class in Java. 
 * The example creates a custom {@link ColorModel} instance that is configured with the `hasAlpha` property set to true.
 * This example provides a practical demonstration of how to use and configure the `ColorModel` class in a real-world application.
 */
public class ColorModel_hasAlpha_Example {

    /**
     * Main method to run the example.
     */
    public static void main(String[] args) {

        // Create an instance of the ColorModel class with the hasAlpha property set to true
        ColorModel colorModel = new ColorModel(true));

        // Output the configuration details of the created ColorModel instance
        System.out.println("ColorModel Instance Configuration Details:"));
        System.out.println("Has Alpha Property Set To: " + colorModel.hasAlpha());

    }

}