package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;

/**
 * Example of how to use the ComponentSampleModel class
 * in the java.awt.image package. This example demonstrates how to retrieve a sample from an image using this model.
 */
public class ComponentSampleModel_getSample_Example {

    // Define necessary imports

    public static void main(String[] args) {
        
        // Create instance of ComponentSampleModel class
        ComponentSampleModel componentSampleModel = new ComponentSampleModel(1, 3, 4, 0);
        
        // Get a sample from the image using this model
        int x = 5; // Image coordinates (x, y)
        int y = 6;
        int[] sample = componentSampleModel.getSample((DataBuffer) null), x, y);

        // Print retrieved sample
        System.out.println("Retrieved Sample: " + java.util.Arrays.toString(sample)));
    }
}