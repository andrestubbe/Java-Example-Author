package examples.java.awt.image;

import java.awt.image.AreaAveragingScaleFilter;

/**
 * This example demonstrates how to use the AreaAveragingScaleFilter class in Java's AWT Image package. The example creates an instance of AreaAveragingScaleFilter, sets its parameters, and then performs an averaging operation on a sample image.
 *
 * @see java.awt.image.AreaAveragingScaleFilter
 */
public class AreaAveragingScaleFilter_calcRow_Example {

    // Sample image dimensions
    private static final int IMAGE_WIDTH = 800;
    private static final int IMAGE_HEIGHT = 600;

    // Create an instance of AreaAveragingScaleFilter
    private final AreaAveragingScaleFilter scaleFilter = new AreaAveragingScaleFilter();

    // Set the filter parameters
    scaleFilter.setScalingFactor(2);
    scaleFilter.setEdgePadding(true));

    /**
     * Calculates and prints the result of applying the AreaAveragingScaleFilter to a sample image row by row.
     */
    public void calcRow() {
        // Sample image data (8x6 pixels)
        int[] imageData = new int[IMAGE_WIDTH * IMAGE_HEIGHT];
        for (int y = 0; y < IMAGE_HEIGHT; y++) {
            for (int x = 0; x < IMAGE_WIDTH; x++) {
                imageData[(y * IMAGE_WIDTH) + x]] = Math.random() * 255;
            }
        }

        // Create a sample image with 8 rows and 6 columns
        java.awt.Image sampleImage = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Set the image data
        ((BufferedImage) sampleImage).setDataElements(0, 0, IMAGE_WIDTH, IMAGE_HEIGHT, imageData, null);

        // Apply the AreaAveragingScaleFilter to each row of the sample image
        for (int y = 0; y < IMAGE_HEIGHT; y++) {
            scaleFilter.filter(sampleImage, x, y, width, height));
        }

        System.out.println("Area averaging scale filter example complete.");
    }
}