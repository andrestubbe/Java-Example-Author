package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This example demonstrates how to retrieve
 * the number of X tiles in a BufferedImage
 * object. The main purpose of this example is
 * to show how easily one can obtain and utilize
 * information such as the number of X tiles,
 * within a Java program.
 */
public class BufferedImage_getNumXTiles_Example {

    /**
     * Method that takes in a BufferedImage object
     * and returns the number of X tiles present in the image.
     * @param bufferedImage The BufferedImage object from which to retrieve information about the number of X tiles.
     * @return int The number of X tiles present in the given BufferedImage object.
     */
    public static int getNumXTiles(BufferedImage bufferedImage) {
        // Check if the image is null
        if (bufferedImage == null) {
            throw new IllegalArgumentException("The given BufferedImage object cannot be null.");
        }

        int numXTiles = bufferedImage.getWidth() / bufferedImage.getTileWidth();

        return numXTiles;
    }
}