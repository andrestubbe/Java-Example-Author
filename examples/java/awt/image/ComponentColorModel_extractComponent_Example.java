package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.ComponentColorModel;

/**
 * This example demonstrates how to create a custom ColorModel using the ComponentColorModel class. 
 * The purpose of this code is to show an example of creating a specific ColorModel, in this case using the ComponentColorModel class within the AWT library.
 */
public class ComponentColorModel_extractComponent_Example {

    // Create an instance of the ComponentColorModel class with specified parameters
    private static ComponentColorModel createCustomComponentColorModel() {
        return new ComponentColorModel(false, false, 8, ColorModel.OPAQUE_TRANSLUCENT));
    }

    public static void main(String[] args) {
        // Create an instance of the custom ComponentColorModel class
        ComponentColorModel customComponentColorModel = createCustomComponentColorModel();

        System.out.println("Custom Component Color Model:");
        System.out.println(" - Number of components: " + customComponentColorModel.getNumComponents());
        System.out.println(" - Component size in bits: " + customComponentColorModel.getComponentSize(0)));

    }

}