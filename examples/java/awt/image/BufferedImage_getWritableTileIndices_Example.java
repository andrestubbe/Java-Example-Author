package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.Arrays;

public class BufferedImage_getWritableTileIndices_Example {

    /**
     * This example demonstrates how to use the `BufferedImage` class's method `getWritableTileIndices()` to get an array of indices that can be used to write data into a BufferedImage.
     */

    public static void main(String[] args) {

        // Create a BufferedImage with a specified width and height
        BufferedImage bufferedImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));

        // Get the writable tile indices for the BufferedImage
        int[] writableTileIndices = bufferedImage.getWritableTileIndices();

        // Print out the array of writable tile indices
        System.out.println("Writable Tile Indices: " + Arrays.toString(writableTileIndices))));

    }

}