package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.BandCombineOp;

/**
 * Example of using the BandCombineOp class. This example demonstrates how to use the `getMatrix` method provided by the `BandCombineOp` class.
 * 
 * <p>This code creates a BufferedImage with a single band (i.e., grayscale)), and then uses the `getMatrix` method to retrieve the pixel values of the image. The resulting matrix is printed to the console.</p>
 */
public class BandCombineOp_getMatrix_Example {

    /**
     * Entry point for this example. This method creates a BufferedImage with a single band (i.e., grayscale)), and then uses the `getMatrix` method to retrieve the pixel values of the image. The resulting matrix is printed to the console.</p>
     * 
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a BufferedImage with a single band (i.e., grayscale))
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_BYTE_GRAY);

        // Use the getMatrix method to retrieve the pixel values of the image
        double[][] matrix = ((BandCombineOp) (image.getRenderingInstance())))
            .getMatrix();

        // Print the resulting matrix to the console
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]]));
            }
            System.out.println();
        }
    }
}