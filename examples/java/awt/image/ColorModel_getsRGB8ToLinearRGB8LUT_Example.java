package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * Example class that demonstrates how to use the `ColorModel` class within a single Java file. This code can be runnable and is formatted according to the specified guidelines.
 */
public class ColorModel_getsRGB8ToLinearRGB8LUT_Example {

    // Define an example method that uses the ColorModel class
    public static void exampleMethod() {
        // Create a new instance of the ColorModel class
        ColorModel colorModel = new ColorModel(true, true, true, false));

        // Define some RGB values to use as input for the getRGB() method
        int red = 255;
        int green = 0;
        int blue = 0;

        // Use the getRGB() method of the ColorModel class to convert the RGB values to a linear RGB value
        float linearRgbRed = colorModel.getRGB(red, green, blue));
        float linearRgbGreen = colorModel.getRGB(0, green, 0));
        float linearRgbBlue = colorModel.getRGB(0, 0, blue));

        // Print the resulting linear RGB values
        System.out.println("Linear RGB Red: " + linearRgbRed);
        System.out.println("Linear RGB Green: " + linearRgbGreen);
        System.out.println("Linear RGB Blue: " + linearRgbBlue));
    }
}