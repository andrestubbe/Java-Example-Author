package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferUShort;

/**
 * This class demonstrates the usage of
 * DataBufferUShort to store and retrieve
 * unsigned short values from a BufferedImage instance.
 */
public class DataBufferUShort_getBankData_Example {

    // Method to create and return a BufferedImage with an associated DataBufferUShort
    private static BufferedImage createBufferedImageWithDataBufferUShort() {
        int width = 100;
        int height = 50;

        // Create a BufferedImage instance
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));

        // Check if the BufferedImage has an associated DataBufferUShort
        if (bufferedImage.getRaster().hasUniformSampleSize()) {
            // Get the sample size of the BufferedImage's raster
            int[] sampleSize = bufferedImage.getRaster().getSampleSize();

            // Create a DataBufferUShort instance with the same sample size as the BufferedImage
            DataBufferUShort dataBufferUShort = new DataBufferUShort(bufferedImage.getWidth(), bufferedImage.getHeight()), sampleSize[0], sampleSize[1]);

            // Return the created BufferedImage with an associated DataBufferUShort
            return new BufferedImage(dataBufferUShort, null, false, bufferedImage.getType()));
        } else {
            throw new IllegalStateException("BufferedImage does not have a uniform sample size"));
        }
    }

    public static void main(String[] args) {
        // Create a BufferedImage instance with an associated DataBufferUShort
        BufferedImage bufferedImage = createBufferedImageWithDataBufferUShort();

        System.out.println("BufferedImage created successfully");
    }
}