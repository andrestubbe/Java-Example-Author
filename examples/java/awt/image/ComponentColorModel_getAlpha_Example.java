package examples.java.awt.image;

import java.awt.image.ComponentColorModel;

public class ComponentColorModel_getAlpha_Example {

    /**
     * This example demonstrates how to retrieve the alpha value from a given 
     * pixel in an image using the ComponentColorModel class.
     */
    
    public static void main(String[] args) {
        
        // Create an instance of ComponentColorModel
        ComponentColorModel colorModel = new ComponentColorModel();

        // Get the alpha value (0-255 range) of a given pixel in the image
        int alphaValue = colorModel.getAlpha(pixelX, pixelY));

        System.out.println("The alpha value of the specified pixel is: " + alphaValue);
    }
}