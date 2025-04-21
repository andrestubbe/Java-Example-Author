package examples.java.awt.image;

import java.awt.image.ColorModel;

/**
 * Example of using the `getNumComponents()` method from the `ColorModel` class. This method returns the number of color components in this color model.
 * 
 * @see ColorModel#getNumComponents()
 */
public class ColorModel_getNumComponents_Example {

    // Method to execute the example code
    public static void runExample() {
        
        // Create an instance of ColorModel
        ColorModel colorModel = new ColorModel(false, false, false, true);

        // Get and print the number of components in the ColorModel instance
        int numComponents = colorModel.getNumComponents();
        System.out.println("Number of components: " + numComponents);
    }

    public static void main(String[] args) {
        runExample();
    }
}