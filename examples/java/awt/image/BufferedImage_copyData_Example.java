package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

/**
 * A class example that demonstrates how to create a copy of the data in a BufferedImage object, using the copyData() method. This code is designed to run with JDK17.
 */
public class BufferedImage_copyData_Example {

    // Method for copying a portion of the buffered image data and returning it as a new buffered image.
    private static BufferedImage copyBufferedImageData(BufferedImage sourceImage) {
        // Create a new BufferedImage object with the same dimensions as the source image.
        BufferedImage destinationImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType()));

        // Copy the data from the source image to the destination image using the copyData() method.
        destinationImage.setData(sourceImage.getData());

        // Return the destination image containing a copy of the data from the source image.
        return destinationImage;
    }

    public static void main(String[] args) {
        // Create a new BufferedImage object with an arbitrary size for demonstration purposes.
        BufferedImage sourceImage = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB));

        // Obtain the current system time in milliseconds.
        long startTime = System.currentTimeMillis();

        // Create a copy of the data from the source image using the copyData() method.
        BufferedImage destinationImage = copyBufferedImageData(sourceImage));

        // Calculate and print the elapsed time (in seconds) since the program started executing.
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + TimeUnit.MILLISECONDS.toSeconds(endTime - startTime)) + " seconds");

    }

}