package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This class demonstrates the usage of the `BufferedImage` class's `getSampleModel()` method. This example creates a BufferedImage with a specified type (e.g., ARGB), a specified width, and a specified height. It then retrieves the SampleModel from the created BufferedImage object and prints its hashCode value to demonstrate that two objects with the same properties will produce the same hashCode value.
 * @since 1.17
 */
public class BufferedImage_getSampleModel_Example {

    /**
     * Main method for executing the example. This method creates a BufferedImage object with specified width and height, and then retrieves the SampleModel from the created BufferedImage object and prints its hashCode value to demonstrate that two objects with the same properties will produce the same hashCode value.
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {

        // Specify the type of BufferedImage to create
        int imageType = BufferedImage.TYPE_INT_RGB;

        // Specify the width and height of the BufferedImage to create
        int width = 640;
        int height = 480;

        // Create a BufferedImage object with specified width and height, and type
        BufferedImage bufferedImage = new BufferedImage(width, height, imageType);

        // Retrieve the SampleModel from the created BufferedImage object
        java.awt.image.SampleModel sampleModel = bufferedImage.getSampleModel();

        // Print the hashCode value of the SampleModel to demonstrate that two objects with the same properties will produce the same hashCode value
        System.out.println("BufferedImage_getSampleModel_Example hashCode: " + System.identityHashCode(sampleModel)));

    }

}