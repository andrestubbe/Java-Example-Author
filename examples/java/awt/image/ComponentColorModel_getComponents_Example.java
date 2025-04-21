package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.ComponentColorModel;
import java.util.Arrays;

/**
 * This class demonstrates the usage of the ComponentColorModel
 * class within a single Java file.
 * 
 * The code creates an instance of the ComponentColorModel
 * class, sets its colors array to specific RGB values,
 * and then retrieves the components from the color model's getComponents() method.
 */
public class ComponentColorModel_getComponents_Example {

    public static void main(String[] args) {

        // Create an instance of the ComponentColorModel class
        ComponentColorModel componentColorModel = new ComponentColorModel();

        // Set the colors array to specific RGB values
        int[] rgbValues = {255, 0, 255}};
        componentColorModel.setRGBs(rgbValues);

        // Get the components from the color model's getComponents() method
        float[] components = componentColorModel.getComponents();

        System.out.println("Original RGB values: " + Arrays.toString(rgbValues)));
        System.out.println("Retrieved components: " + Arrays.toString(components))));
    }
}