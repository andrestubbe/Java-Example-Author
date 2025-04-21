package examples.java.awt.image;

import java.awt.image.ConvolveOp;
import java.util.Arrays;

/**
 * Example demonstrating the usage of ConvolveOp
 * class within a single Java file.
 */
public class ConvolveOp_getKernel_Example {

    // Define an example kernel for convolution operation
    private static final int[] KERNEL = {
            1, 0, 1,
            0, 2, 0,
            1, 0, 1
    };

    public static void main(String[] args) {
        // Create a ConvolveOp instance with the defined kernel
        ConvolveOp convolveOp = new ConvolveOp(getKernel()));

        // Define an example image to be used for convolution operation
        int width = 10;
        int height = 10;
        float image[][] = new float[height][width]];

        // Initialize the image with some sample values
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                image[i][j] = Math.random() * 255;
            }
        }

        // Perform the convolution operation on the image using the ConvolveOp instance
        convolveOp.filter(image, null, width, height));

        // Print the resulting image after the convolution operation
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%.2f ", image[i][j]]);
            }
            System.out.println();
        }
    }

    // Helper method to get the kernel matrix for convolution operation
    private static int[][] getKernel() {
        return new int[][]{KERNEL}};
    }
}