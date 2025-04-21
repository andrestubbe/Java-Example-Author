package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;

/**
 * Example of using the ConvolveOp class to apply a convolution filter to an image. This example demonstrates how to apply a simple box blur filter to a BufferedImage object.
 */
public class ConvolveOp_getPoint2D_Example {

    public static void main(String[] args) {
        // Create a sample BufferedImage
        BufferedImage input = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB));

        // Define the convolution filter kernel matrix
        int kernelSize = 3; // Kernel size should be odd number
        float[] kernelMatrix = {
                0.05f, 0.15f, 0.05f,
                0.15f, 1.00f, 0.15f,
                0.05f, 0.15f, 0.05f
        };

        // Create the ConvolveOp object with the kernel matrix and appropriate edge pixels replication
        ConvolveOp convolveOp = new ConvolveOp(kernelMatrix, true));

        // Apply the convolution filter to the input image
        BufferedImage output = convolveOp.filter(input, null));

        // Display the original and filtered images side by side for comparison
        // ...
    }

}