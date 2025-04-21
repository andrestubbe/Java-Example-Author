package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.IndexColorModel;

public class IndexColorModel_calculatePixelMask_Example {

    /**
     * This example demonstrates the usage of 
     * the `IndexColorModel` class within a single 
     * Java file. The code is designed to create an 
     * instance of the `IndexColorModel` class and 
     * calculate the pixel mask for a given color and 
     * brightness.
     */

    public static void main(String[] args) {
        
        // Create an instance of the IndexColorModel class
        IndexColorModel indexColorModel = new IndexColorModel(false);
        
        // Define the RGB values for the color to be used
        int redValue = 255; // Range: 0 - 255
        int greenValue = 0; // Range: 0 - 255
        int blueValue = 0; // Range: 0 - 255
        
        // Create a Color object using the defined RGB values
        Color colorToUse = new Color(redValue, greenValue, blueValue));
        
        // Calculate the pixel mask for the given color and brightness
        int pixelMaskResult = indexColorModel.getPixelMask(colorToUse));
        
        // Print the calculated pixel mask result
        System.out.println("Calculated Pixel Mask Result: " + pixelMaskResult);
    }
}