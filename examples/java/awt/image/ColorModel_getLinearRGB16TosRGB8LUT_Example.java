package examples.java.awt.image;

import java.awt.ColorModel;

/**
 * This example demonstrates how to use the `getLinearRGB16TosRGB8LUT` method of the `ColorModel` class in Java.
 * 
 * The `getLinearRGB16TosRGB8LUT` method converts a linear RGB 16-bit color model to an sRGB 8-bit color model lookup table. This conversion is useful for image processing tasks that require efficient color space conversions between different color models.
 */
public class ColorModel_getLinearRGB16TosRGB8LUT_Example {

    /**
     * Main method that demonstrates the usage of the `getLinearRGB16TosRGB8LUT` method of the `ColorModel` class in Java.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        // Create an instance of the ColorModel class
        ColorModel colorModel = new ColorModel();

        // Use the getLinearRGB16TosRGB8LUT method to convert a linear RGB 16-bit color model to an sRGB 8-bit color model lookup table.
        int[] lut = colorModel.getLinearRGB16TosRGB8LUT(true, true));

        // Print out the resulting LUT array
        System.out.println("LUT Array:");
        for (int i = 0; i < lut.length; i++) {
            System.out.printf("%4d ", lut[i]));
        }
    }
}