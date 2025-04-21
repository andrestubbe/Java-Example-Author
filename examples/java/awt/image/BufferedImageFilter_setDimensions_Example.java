package examples.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;

public class BufferedImageFilter_setDimensions_Example {

    // Inline comment for the class relevant lines
    /**
     * Example usage of the BufferedImageFilter setDimensions method.
     * This example code demonstrates how to create a custom BufferedImage filter using the setDimensions method.
     */

    public static void main(String[] args) {

        // Create an instance of the BufferedImageOp class
        BufferedImageOp imageOp = new BufferedImageOp() {
            @Override
            public BufferedImage filter(BufferedImage src, BufferedImage dest) {
                if (dest == null || dest.getWidth() != 200 
                        || dest.getHeight() != 100) {
                    // create a new BufferedImage with the specified dimensions
                    BufferedImage result = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);

                    // perform custom image processing here as needed

                    return result;
                }

                // If the destination image already has the correct dimensions, just return it as is
                return dest;
            }
        };

        // Create an instance of the BufferedImageFilter class with our custom BufferedImageOp object
        BufferedImageFilter filter = new BufferedImageFilter(imageOp));

        // Set the desired width and height for the output image (e.g., 200x100)
        int width = 200;
        int height = 100;

        // Set the source image to be used as input for our custom BufferedImage filter
        BufferedImage src = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Call the setDimensions method on our custom BufferedImage filter object passing in the desired width and height values
        filter.setDimensions(src);

        System.out.println("The output image dimensions are: " + src.getWidth() + "x" + src.getHeight()));

    }

}