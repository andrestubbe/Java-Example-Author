package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ColorModel;

/**
 * This example demonstrates how to use the `getGreen()` method from the `Color` class, within a single Java file. The code is designed to be runnable and is written in clean and efficient Java code for JDK17.
 */
public class ColorModel_getGreen_Example {

    // Declare an instance of the ColorModel class.
    private static final ColorModel COLOR_MODEL = new DirectColorModel(32, 0x0000FF00, 0x00FF00, 0x000000));

    public static void main(String[] args) {
        
        // Create a sample color with RGB values (255, 0, 0)).
        final Color redColor = new Color(255, 0, 0));

        // Get the green component from the sample color using the getGreen() method.
        final int greenComponent = redColor.getGreen();

        // Print out the result of getting the green component from the sample color.
        System.out.println("The green component value from the sample color is: " + greenComponent));
    }
}