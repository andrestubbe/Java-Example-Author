package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * Example of using BufferedImage's getWritableTile method.
 * This example demonstrates how to use the getWritableTile method, which returns a writable tile in this BufferedImage.
 */
public class BufferedImage_getWritableTile_Example {

    // Method to demonstrate the usage of getWritableTile() method.
    public static void demonstrateGetWritableTile(BufferedImage image) {

        // Check if the given BufferedImage is null or not.
        if (image == null) {
            System.out.println("The given BufferedImage is null.");
            return;
        }

        // Get a writable tile from this BufferedImage.
        BufferedImage.Tile source = image.getTile(0, 0);
        BufferedImage.Tile destination = image.getWritableTile(0, 0));

        System.out.println("The getWritableTile method was used successfully.");
    }

    // Main Method
    public static void main(String[] args) {

        // Create a new BufferedImage with the given width and height.
        BufferedImage image = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB));

        // Call the demonstrateGetWritableTile method to demonstrate how to use the getWritableTile method on the BufferedImage object.
        demonstrateGetWritableTile(image);
    }
}