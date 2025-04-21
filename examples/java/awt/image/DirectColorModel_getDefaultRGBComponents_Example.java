package examples.java.awt.image;

import java.awt.image.DirectColorModel;

public class DirectColorModel_getDefaultRGBComponents_Example {

    /**
     * This example demonstrates the usage of the
     * `getDefaultRGBComponents`` method in the
     * `DirectColorModel` class.
     * The method returns an array of length 4,
     * where each index represents a specific RGB component:
     * - index 0: red intensity (0-255 range)
     * - index 1: green intensity (0-255 range)
     * - index 2: blue intensity (0-255 range)
     * - index 3: alpha transparency (0-255 range))
     */

    public static void main(String[] args) {
        // Create an instance of the DirectColorModel class
        DirectColorModel colorModel = new DirectColorModel();

        // Call the getDefaultRGBComponents method to retrieve the default RGB components
        int[] rgbComponents = colorModel.getDefaultRGBComponents();

        // Print the retrieved RGB components
        System.out.println("Default RGB Components:");
        for (int i = 0; i < rgbComponents.length; i++) {
            System.out.printf("rgbComponent[%d]: %d%n", i, rgbComponents[i]));
        }
    }
}