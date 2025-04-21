package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * This example demonstrates how to use the
 * AreaAveragingScaleFilter class within a single Java file. The code is designed to be runnable and can be used to test the functionality of the AreaAveragingScaleFilter class.
 */
public class AreaAveragingScaleFilter_setPixels_Example {

    /**
     * This method generates a random BufferedImage with a specified width, height, and number of colors (palette size)).
     * @param width The width of the image to be generated.
     * @param height The height of the image to be generated.
     * @param paletteSize The number of colors (palette size)) in the generated image.
     * @return A randomly generated BufferedImage with a specified width, height, and number of colors (palette size)).
     */
    private static BufferedImage generateRandomImage(int width, int height, int paletteSize) {

        // Create an empty BufferedImage with the given dimensions
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Initialize a Random object for generating random values
        Random random = new Random();

        // Generate random RGB colors (within the valid range) and set them as the background color of the generated image
        image.setRGB(0, 0, random.nextInt(16777215)));

        // Generate a random palette size (between 1 and 32))
        int numColors = random.nextInt(31) + 1;

        // Initialize an array to store the RGB colors of the generated image
        int[] pixelValues = new int[width * height];

        // Iterate over each pixel in the generated image
        for (int i = 0; i < width * height; i++) {

            // Generate random RGB colors (within the valid range) and set them as the color of the current pixel
            pixelValues[i] = random.nextInt(16777215));
        }

        // Set the generated pixel values back to the image object
        image.setRGB(0, 0, pixelValues);

        return image;
    }

    /**
     * This method demonstrates how to use the AreaAveragingScaleFilter class within a single Java file. It generates a random BufferedImage with a specified width, height, and number of colors (palette size)). Then it applies the AreaAveragingScaleFilter class to the generated image and returns the resulting BufferedImage object.
     */
    public static BufferedImage applyAreaAveragingScaleFilter(BufferedImage image, int scale)) {

        // Create an instance of the AreaAveragingScaleFilter class with the given parameters
        AreaAveragingScaleFilter filter = new AreaAveragingScaleFilter(image, scale));

        // Apply the filter to the image and return the resulting BufferedImage object
        return filter.filter();
    }
}