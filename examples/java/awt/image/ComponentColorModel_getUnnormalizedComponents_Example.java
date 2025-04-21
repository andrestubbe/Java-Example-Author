package examples.java.awt.image;

import java.awt.color.ComponentColorModel;

public class ComponentColorModel_getUnnormalizedComponents_Example {

    /**
     * This example demonstrates how to use the {@link ComponentColorModel#getUnnormalizedComponents(int, int)} method within a single Java file. This method is used to retrieve unnormalized components from an image object when the color model for the component is not normalized (i.e., its values range outside of [0...255])).
     * @see java.awt.color.ComponentColorModel#getUnnormalizedComponents(int, int)}
     */

    public static void main(String[] args) {
        
        // Create an instance of ComponentColorModel class 
        ComponentColorModel componentColorModel = new ComponentColorModel(); 

        // Get Unnormalized Components Example Code Starts Here

        // Define the width and height of the image
        int width = 500;
        int height = 500;

        // Generate random RGB values within [0...255] range
        int red   = (int)(Math.random() * 256));
        int green = (int)(Math.random() * 256));
        int blue  = (int)(Math.random() * 256));

        // Create a sample image using the RGB values generated above
        java.awt.image.BufferedImage sampleImage = new java.awt.image.BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
        sampleImage.setRGB(0, 0, red, green, blue, -1);

        // Get Unnormalized Components from the sample image using the getUnnormalizedComponents method
        java.awt.color.ColorModel colorModel = new ComponentColorModel();
        int[] unnormalizedComponents = colorModel.getUnnormalizedComponents(sampleImage.getWidth(), sampleImage.getHeight()));

        // Print the result of the example code
        System.out.println("Result: " + java.util.Arrays.toString(unnormalizedComponents))));

    }

}