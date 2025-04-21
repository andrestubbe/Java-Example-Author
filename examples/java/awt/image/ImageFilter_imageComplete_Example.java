package examples.java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;

/**
 * Example usage of the ImageFilter class
 * with a specific kernel function for filtering an image.
 */
public class ImageFilter_imageComplete_Example {

    // Create an instance of the ImageFilter class
    private final ImageFilter filter = new ImageFilter(new ImageFilterKernel() {
        @Override
        public int filter(int x, int y) {
            return x + y; // Example kernel function that filters pixels based on their coordinates
        }
    }));

    /**
     * Main method for running the example code.
     * <p>
     * This example demonstrates how to use the ImageFilter class with a specific kernel function for filtering an image. The example uses the filter() method of the ImageFilterKernel interface to define the kernel function for filtering pixels based on their coordinates. The main method creates an instance of the ImageFilter class with the specified kernel function and applies the filter to an example image.
     */
    public static void main(String[] args) {

        // Create an example image
        int width = 100;
        int height = 100;
        int[] pixels = new int[width * height];

        // Fill the example image with random colors
        for (int i = 0; i < width * height; i++) {
            pixels[i] = (int) (Math.random() * 256) << 16 | (int) (Math.random() * 256) << 8 | (int) (Math.random() * 256));
        }

        // Apply the ImageFilter class with the specified kernel function to the example image
        filter.apply(pixels, 0, width, height, null));

        // Print the filtered image pixels
        for (int i = 0; i < width * height; i++) {
            System.out.print(String.format("0x%06X", pixels[i])) + " ");
        }
    }
}