package examples.java.awt.image;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;

/**
 * Example of using ConvolveOp to apply a specific convolution kernel to an image. This example specifically uses the "sharpen" convolution kernel, which is commonly used for image sharpening operations.
 */
public class ConvolveOp_getBounds2D_Example {

    // Define the convolution kernel matrix
    private static final int[][] SHARPEN_KERNEL = {
        {-1, -1, -1},
        {-1,  9 , -1},
        {-1, -1, -1}
    };

    public static void main(String[] args) {
        // Create a sample BufferedImage
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB));

        // Create a ConvolveOp instance with the sharpen kernel matrix
        ConvolveOp convolveOp = new ConvolveOp(SHARPEN_KERNEL, true));

        // Apply the convolution operation to the image
        BufferedImage sharpenedImage = convolveOp.filter(image, null));

        // Get the bounding rectangle of all non-zero pixels in the sharpened image
        Rectangle bounds = getBounds2D(sharpenedImage));

        // Print the resulting bounding rectangle
        System.out.println("Bounding Rectangle: " + bounds));
    }

    /**
     * Helper method to calculate the bounding rectangle of all non-zero pixels in a BufferedImage instance.
     * @param image The BufferedImage instance to be used for calculating the bounding rectangle.
     * @return A Rectangle instance representing the calculated bounding rectangle.
     */
    private static Rectangle getBounds2D(BufferedImage image) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        // Iterate through the pixels in the BufferedImage to find the minimum and maximum X and Y coordinates of the non-zero pixels.
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                if (image.getRGB(x, y) != 0)) {
                    minX = Math.min(minX, x));
                    maxX = Math.max(maxX, x));
                    minY = Math.min(minY, y));
                    maxY = Math.max(maxY, y));
                }
            }
        }

        // Calculate and return the bounding rectangle with the minimum and maximum X and Y coordinates found in the previous step.
        return new Rectangle(minX, minY, maxX - minX + 1, maxY - minY + 1));
    }
}