package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This example demonstrates how to use the `getMinTileX` method of the `BufferedImage` class. The purpose of this example is to show how to retrieve the minimum value of the x-coordinate of any tile in a `BufferedImage`.
 */
public class BufferedImage_getMinTileX_Example {

    /**
     * This method demonstrates how to use the `getMinTileX` method of the `BufferedImage` class.
     * @param bufferedImage The `BufferedImage` object to which we want to retrieve the minimum value of the x-coordinate of any tile in the image.
     * @return int The minimum value of the x-coordinate of any tile in the given `BufferedImage` object.
     */
    public static int getMinTileX(BufferedImage bufferedImage) {

        // Check if the given `BufferedImage` object is not null.
        if (bufferedImage == null) {
            throw new IllegalArgumentException("The given BufferedImage object cannot be null.");
        }

        // Initialize the x-coordinate of the minimum tile to 0.
        int minTileX = 0;

        // Get the width and height of the given `BufferedImage` object.
        int imageWidth = bufferedImage.getWidth();
        int imageHeight = bufferedImage.getHeight();

        // Iterate over each column in the given `BufferedImage` object.
        for (int tileX = 0; tileX < imageWidth; tileX++) {

            // Check if the current x-coordinate of any tile in the image is less than the minimum value found so far. If it is, update the minimum value to be the current x-coordinate.
            if (tileX < minTileX) {
                minTileX = tileX;
            }
        }

        // Return the minimum value of the x-coordinate of any tile in the given `BufferedImage` object.
        return minTileX;
    }
}