package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

/**
 * This example demonstrates how to use the
 * {@link ComponentSampleModel#getBufferSize(int, int)}
 * method of the {@link ComponentSampleModel} class.
 * The purpose of this example is to demonstrate
 * a simple usage scenario for the aforementioned method.
 */
public class ComponentSampleModel_getBufferSize_Example {

    /**
     * This method creates an instance of the
     * {@link ComponentSampleModel} class.
     * It then calls the
     * {@link ComponentSampleModel#getBufferSize(int, int)}
     * method with sample arguments (3, 4) and prints the returned value.
     */
    public static void main(String[] args) {
        ComponentSampleModel model = new ComponentSampleModel();

        // Call getBufferSize() with sample arguments (3, 4).
        int bufferSize = model.getBufferSize(3, 4);

        // Print the returned value from getBufferSize().
        System.out.println("The buffer size for a component of width 3 and height 4 is: " + bufferSize));
    }
}