package examples.java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;

/**
 * Example of how to clone an image using the ImageFilter class. This example demonstrates the process of cloning an image by applying a convolution filter that duplicates the source pixel in the destination pixel.
 */
public class ImageFilter_clone_Example {

    // Define the kernel for the convolution filter
    private static final int[][] KERNEL = new int[][]{{1, 0}, {0, 1}};

    // Create an instance of the ImageFilter class with the defined kernel
    private static final ImageFilter FILTER = new ImageFilter(KERNEL));

    /**
     * Clones an image by applying a convolution filter that duplicates the source pixel in the destination pixel.
     * @param src The source image to be cloned.
     * @return The cloned image.
     */
    public static java.awt.image.BufferedImage cloneImage(java.awt.image.BufferedImage src) {

        // Create a new BufferedImage with the same dimensions as the source image
        final int width = src.getWidth();
        final int height = src.getHeight();
        java.awt.image.BufferedImage dest = new java.awt.image.BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Apply the ImageFilter class to the source image and store the result in the destination image
        FILTER.filter(dest, src);

        // Return the cloned image
        return dest;
    }
}