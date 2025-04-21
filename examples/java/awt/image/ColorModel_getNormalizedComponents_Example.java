package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * Example of using the `getNormalizedComponents` method of the `ColorModel` class. This method returns an array of normalized RGB components for a given color represented in the default RGB color space.
 */
public class ColorModel_getNormalizedComponents_Example {

    // Method to get normalized RGB components for a given color
    private float[] getNormalizedComponents(Color color) {
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        float[] normalizedComponents = new float[3];
        normalizedComponents[0] = (float) red / 255; // normalize to [0, 1] range
        normalizedComponents[1] = (float) green / 255;
        normalizedComponents[2] = (float) blue / 255;

        return normalizedComponents;
    }

    public static void main(String[] args) {
        Color color = new Color(255, 0, 128)); // create a Color object with RGB values (255, 0, 128))
        System.out.println("Normalized components: " + getNormalizedComponents(color))); // print the normalized components of the given color
    }
}