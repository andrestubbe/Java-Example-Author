package examples.java.awt.image;

import java.awt.color.ComponentColorModel;

public class ComponentColorModel_initScale_Example {

    /**
     * This example demonstrates the usage of the `ComponentColorModel` class constructor that accepts a boolean value indicating if the colors in the color model should be scaled to cover the full range available.
     */

    public static void main(String[] args) {

        // Define the necessary components and their respective configurations
        int width = 400;
        int height = 400;
        boolean hasAlpha = true;
        boolean hasPremultipliedAlpha = false;

        // Create a new `ComponentColorModel` instance with the specified configuration
        ComponentColorModel colorModel = new ComponentColorModel(hasAlpha, hasPremultipliedAlpha, 8, ComponentColorModel.SRGB);

        // Print the result of the example
        System.out.println("Example completed successfully.");
    }
}