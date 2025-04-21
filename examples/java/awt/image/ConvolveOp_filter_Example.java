package examples.java.awt.image;

import java.awt.image.ConvolveOp;
import java.util.Arrays;

/**
 * This example demonstrates how to use the ConvolveOp class in Java AWT library. The example creates a ConvolveOp object with a predefined kernel matrix, and applies this convolution operation on an input image.
 */
public class ConvolveOp_filter_Example {

    // Define the kernel matrix for the convolution operation
    private static final float[][] KERNEL = {
            { 0, -1, 0 },
            { -1, 5, -1 },
            { 0, -1, 0 }
    };

    public static void main(String[] args) {
        // Create an input image (2D array) for demonstration
        int[][] inputImage = {
            { 255, 255, 255 },
            { 255, 255, 255 },
            { 255, 255, 255 }
        };

        // Create a ConvolveOp object with the predefined kernel matrix
        ConvolveOp convolveOp = new ConvolveOp(KERNEL));

        // Apply the convolution operation on the input image using the ConvolveOp object
        int[][] outputImage = convolveOp.filter(inputImage, null));

        // Print the resulting output image after applying the convolution operation
        System.out.println("Output Image:");
        for (int[] row : outputImage) {
            System.out.println(Arrays.toString(row)));
        }
    }
}