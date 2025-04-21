package examples.java.awt.image;

import java.awt.color.ColorSpace;

public class DirectColorModel_toString_Example {

    /**
     * This example demonstrates the usage of the `DirectColorModel` class within a single Java file. The code is designed to create an instance of `DirectColorModel`, setting its color space to a custom `CustomColorSpace` object, and then printing out the string representation of this `DirectColorModel` instance.
     */

    public static void main(String[] args) {
        // Define the RGB channel components' ranges for our custom color space
        int minR = 0;
        int maxR = 255;
        int minG = 0;
        int maxG = 255;
        int minB = 0;
        int maxB = 255;

        // Create a new instance of DirectColorModel, using our custom color space
        DirectColorModel directColorModel = new DirectColorModel(ColorSpace.getDefaultData(ColorSpace.TYPE_RGB), ColorSpace.getDefaultData(ColorSpace.TYPE_RGB).getType(), new int[]{minR, maxR}, new int[]{minG, maxG}, new int[]{minB, maxB});

        // Print out the string representation of our DirectColorModel instance
        System.out.println(directColorModel);
    }

}