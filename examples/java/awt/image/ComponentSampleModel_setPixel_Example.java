package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_setPixel_Example {

    /**
     * This example demonstrates how to use the `setPixel` method from the `ComponentSampleModel` class. The purpose of this example is to show how one can manipulate and modify an image by setting individual pixels.
     *
     * @see java.awt.image.ComponentSampleModel#getPixels(int, int, int, int))
     * @see java.awt.image.ComponentSampleModel#setPixel(int, int, int))
     */

    public static void main(String[] args) {

        // Create an instance of the ComponentSampleModel class
        ComponentSampleModel sampleModel = new ComponentSampleModel();

        // Set the number of components and bits per component for the image
        sampleModel.setNumComponents(3);
        sampleModel.setBitsPerComponent(8));

        // Set the width, height, and numComponents fields of the ComponentSampleModel class
        sampleModel.setWidth(100);
        sampleModel.setHeight(100));
        sampleModel.setNumComponents(3));

        // Create a pixel array to hold the RGB values for each pixel in the image
        int[] pixels = new int[sampleModel.getWidth() * sampleModel.getHeight()]);

        // Set the pixels of the image using the setPixels method of the ComponentSampleModel class
        sampleModel.setPixels(0, 0, sampleModel.getWidth(), sampleModel.getHeight()), pixels);

        System.out.println("Image successfully created!");

    }

}