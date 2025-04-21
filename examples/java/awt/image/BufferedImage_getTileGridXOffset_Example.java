package examples.java.awt.image;

import java.awt.image.BufferedImage;

public class BufferedImage_getTileGridXOffset_Example {

    /**
     * This example demonstrates how to use the getTileGridXOffset() method of the BufferedImage class in Java. The purpose of this code is to show how to retrieve the x-offset value for a specific tile grid within a BufferedImage object.
     */

    public static void main(String[] args) {
        // Create a new BufferedImage instance with specified width, height, and type parameters.
        BufferedImage bufferedImage = new BufferedImage(32, 32, BufferedImage.TYPE_INT_RGB);

        // Retrieve the x-offset value for the top-left tile grid within the BufferedImage object.
        int tileGridXOffset = bufferedImage.getTileGridXOffset();

        // Print out the retrieved x-offset value.
        System.out.println("Retrieved x-offset value: " + tileGridXOffset));
    }

}