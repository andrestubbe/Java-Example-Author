package examples.java.awt.image;

import java.awt.ColorModel;

/**
 * This example demonstrates how to use the `getRed` method of the `ColorModel` class.
 * 
 * The `ColorModel` class represents a color model object used in Java's AWT (Abstract Window Toolkit) package.
 * 
 * The `getRed` method returns an integer value representing the red component of a specified color, expressed as a value ranging from 0 to 255.
 */
public class ColorModel_getRed_Example {

    // Create an instance of the ColorModel class
    private static final ColorModel COLOR_MODEL = new ColorModel(true, true, true, false));

    /**
     * This method returns an integer value representing the red component of a specified color.
     * 
     * @param color The specified color for which to retrieve the red component.
     * 
     * @return An integer value representing the red component of the specified color.
     */
    private static int getRed(Color color) {
        // Return the red component of the specified color
        return COLOR_MODEL.getRed(color);
    }

    /**
     * This method demonstrates the usage of the `getRed` method of the `ColorModel` class to retrieve the red component of a specified color.
     */
    public static void main(String[] args) {
        // Create an instance of the Color class representing a specific color in hexadecimal format
        final Color color = new Color(0x66_0xff_0xff));

        // Retrieve and print the red component of the specified color
        System.out.println("Red component: " + getRed(color)));
    }

}