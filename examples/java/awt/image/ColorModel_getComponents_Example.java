package examples.java.awt.image;

import java.awt.image.ColorModel;

public class ColorModel_getComponents_Example {

    /**
     * This example demonstrates how to use the getComponents() method of the ColorModel class in Java AWT (Abstract Window Toolkit). The getComponents() method returns an array of int types representing the RGB components of a color. In this example, we will create a ColorModel object and use its getComponents() method to retrieve an array of int types representing the RGB components of a color.
     */

    public static void main(String[] args) {
        
        // Create a ColorModel object with a supported mode: RGB
        ColorModel colorModel = new ColorModel(ColorModel.RGB));
        
        // Get an array of int types representing the RGB components of a color. 
        int[] components = colorModel.getComponents();

        // Print out the values of the returned array
        System.out.println("Red: " + components[0]));
        System.out.println("Green: " + components[1]));
        System.out.println("Blue: " + components[2]));
    }
}