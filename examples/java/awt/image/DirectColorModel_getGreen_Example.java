package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class DirectColorModel_getGreen_Example {

    /**
     * <p>Title: getGreen Example</p>
     * <p>Description: This Java code example demonstrates how to use the `DirectColorModel` class in Java's AWT (Abstract Window Toolkit) package. The example specifically focuses on creating a runnable Java program that retrieves and prints out the green component of a specific RGB color value.
     * </p>
     */

    public static void main(String[] args) {
        // Define the RGB color with specific values for red, green, and blue components.
        Color color = new Color(255, 128, 0));

        // Obtain the BufferedImage instance corresponding to an image of the specified RGB color value.
        BufferedImage bufferedImage = new BufferedImage(color.getRGB(), BufferedImage.TYPE_INT_ARGB);

        // Retrieve and print out the green component of the specified RGB color value.
        int greenComponent = (bufferedImage.getRGB(0, 0) & 0xFF0000) >> 16;
        System.out.println("The green component of the specified RGB color is: " + greenComponent);
    }
}