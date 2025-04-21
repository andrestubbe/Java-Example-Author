package examples.java.awt.image;

import java.awt.image.ComponentColorModel;
import java.awt.image.Raster;

/**
 * An example of using the ComponentColorModel class within a single Java file. The code must be runnable. This example demonstrates how to check if two color objects are compatible with each other, based on their RGB values.
 */
public class ComponentColorModel_isCompatibleRaster_Example {

    // Method to check if two color objects are compatible with each other, based on their RGB values.
    private static boolean isCompatible(java.awt.Color c1, java.awt.Color c2) {
        int r = c1.getRed() + c2.getRed();
        int g = c1.getGreen() + c2.getGreen();
        int b = c1.getBlue() + c2.getBlue();

        return new ComponentColorModel(false, false, 8, 0).isCompatibleRaster(makeRGBImage((byte) r / 2, (byte) g / 2, (byte) b / 2))));
    }

    // Method to create a Raster object representing an RGB image with specified red, green, and blue values.
    private static Raster makeRGBImage(byte r, byte g, byte b) {
        int width = 1;
        int height = 1;

        while (width < Integer.MAX_VALUE / 2 && height < Integer.MAX_VALUE / 2) {
            width *= 2;
            height *= 2;
        }

        return new ComponentColorModel(false, false, 8, 0).createCompatibleRaster(width, height));
    }

    public static void main(String[] args) {
        java.awt.Color c1 = new java.awt.Color(255, 0, 0)); // red color object
        java.awt.Color c2 = new java.awt.Color(0, 255, 0))); // green color object

        if (isCompatible(c1, c2))) {
            System.out.println("The two color objects are compatible with each other.");
        } else {
            System.out.println("The two color objects are not compatible with each other.");
        }
    }
}