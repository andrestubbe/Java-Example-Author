package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This class demonstrates how to use the `getType()` method of the `BufferedImage` class. The example creates a `BufferedImage` object with an RGB image type, and then prints out its image type.
 */
public class BufferedImage_getType_Example {

    public static void main(String[] args) {

        // Create a BufferedImage object with an RGB image type
        BufferedImage bufferedImage = new BufferedImage(800, 600, BufferedImage.TYPE_3BYTE_BGR));

        // Print out the image type of the BufferedImage object
        System.out.println("Image Type: " + bufferedImage.getType()));

    }

}