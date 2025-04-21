package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * This example demonstrates how to use the `getRGBdefault` method of the `ColorModel` class. The method returns an integer representation of the color. In this example, a random color is generated using the default RGB model.
 */
public class ColorModel_getRGBdefault_Example {

    public static void main(String[] args) {
        // Create a new Color object with random values for red, green, and blue components.
        Color randomColor = new Color(RandomGenerator.DEFAULT.nextInt(), RandomGenerator.DEFAULT.nextInt(), RandomGenerator.DEFAULT.nextInt()));

        // Get the default RGB model instance.
        ColorModel colorModel = ColorModel.getRGBdefault();

        // Convert the random color to its corresponding integer representation using the default RGB model.
        int rgbIntegerRepresentation = colorModel.getRGB(randomColor.getRed(), randomColor.getGreen(), randomColor.getBlue()));

        // Print the resulting integer representation of the random color.
        System.out.println("The resulting integer representation of the random color is: " + rgbIntegerRepresentation));
    }
}