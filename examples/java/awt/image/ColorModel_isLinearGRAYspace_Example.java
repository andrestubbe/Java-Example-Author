package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * An example of how to use the {@link ColorModel} class in Java's AWT package. This example specifically focuses on understanding the `isLinearGRAYspace` method within the `ColorModel` class.
 * 
 * In summary, this example demonstrates how to utilize the `ColorModel` class to perform specific operations related to color models and their associated methods.
 */
public class ColorModel_isLinearGRAYspace_Example {

    /**
     * A simple method that takes in an array of RGB integer values and returns a new array containing only the alpha component (0-255) for each corresponding RGB value in the input array.
     * 
     * This method is specifically designed to work with the `ColorModel` class within Java's AWT package. By using this method, we can easily extract the alpha component values from an array of RGB integer values, which is useful when working with color models and their associated methods.
     *
     * @param rgbArray The input array containing RGB integer values.
     * @return int[] An array containing only the alpha component (0-255) for each corresponding RGB value in the input array.
     */
    public static int[] getAlphaComponents(int[] rgbArray) {
        // Create an empty array to store the resulting alpha component values
        int[] alphaComponentArray = new int[rgbArray.length];

        for (int i = 0; i < rgbArray.length; i++) {
            // Extract the red, green, and blue components from the current RGB value
            int r = (rgbArray[i] >> 16) & 0xFF;
            int g = (rgbArray[i] >> 8) & 0xFF;
            int b = (rgbArray[i]) & 0xFF;

            // Calculate the alpha component for the current RGB value
            alphaComponentArray[i] = (r + g + b) / 3;
        }

        return alphaComponentArray;
    }
}