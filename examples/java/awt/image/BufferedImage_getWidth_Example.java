package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * A simple example demonstrating the use of
 * BufferedImage's getWidth() method.
 * This example creates a BufferedImage with a specific width, retrieves its width and prints it out.
 */
public class BufferedImage_getWidth_Example {

    // Create an example BufferedImage with a specific width
    private static final int IMAGE_WIDTH = 500;
    private static final int IMAGE_HEIGHT = 0; // Height is not specified, so we use 0 as the default height.

    public static void main(String[] args) {

        // Create an example BufferedImage with a specific width
        BufferedImage bufferedImage = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Retrieve the width of the BufferedImage and print it out
        int imageWidth = bufferedImage.getWidth();
        System.out.println("The width of the BufferedImage is: " + imageWidth);
    }
}