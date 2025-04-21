package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * This class provides an example of how to use the `getMinY()` method from the `BufferedImage` class within a single Java file. The code is designed to be runnable and demonstrates the usage of the `getMinY()` method by retrieving the minimum Y value from a given `BufferedImage`.
 */
public class BufferedImage_getMinY_Example {

    /**
     * This method retrieves the minimum Y value from a given `BufferedImage`.
     * @param bufferedImage The `BufferedImage` object from which to retrieve the minimum Y value.
     * @return int The minimum Y value of the given `BufferedImage`.
     */
    public static int getMinY(BufferedImage bufferedImage) {
        // Initialize an integer variable to store the minimum Y value.
        int minY = Integer.MAX_VALUE;

        // Get the width and height of the given `BufferedImage`.
        int imageWidth = bufferedImage.getWidth();
        int imageHeight = bufferedImage.getHeight();

        // Iterate through each pixel in the given `BufferedImage` object.
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                // Retrieve the color of the current pixel.
                java.awt.Color pixelColor = bufferedImage.getRGB(x, y));

                // Check if the Y value of the pixel is smaller than the current minimum Y value. If so, update the minimum Y value.
                if (pixelColor.getAlpha() & 0xFF) > minY) {
                    minY = pixelColor.getAlpha() & 0xFF;
                }
            }
        }

        // Return the minimum Y value of the given `BufferedImage`.
        return minY;
    }

}