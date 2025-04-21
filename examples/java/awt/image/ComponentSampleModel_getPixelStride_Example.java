package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;

public class ComponentSampleModel_getPixelStride_Example {

    /**
     * This example demonstrates how to use the
     * ComponentSampleModel class in Java's AWT package.
     *
     * The ComponentSampleModel class is used to create an image object that uses a specific sample model.
     *
     * In this example, we will demonstrate how to retrieve the pixel stride of an image using the ComponentSampleModel class.
     */

    public static void main(String[] args) {
        // Create an instance of the ComponentSampleModel class
        ComponentSampleModel sampleModel = new ComponentSampleModel();

        // Get the pixel stride of the image
        int pixelStride = sampleModel.getPixelStride();

        // Print the pixel stride of the image
        System.out.println("Pixel Stride: " + pixelStride);
    }
}