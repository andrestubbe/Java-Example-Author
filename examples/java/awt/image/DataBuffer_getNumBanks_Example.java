package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;

/**
 * Example demonstrating the use of
 * {@link DataBuffer} in conjunction with
 * {@link BufferedImage}. This example
 * specifically focuses on showcasing the usage of
 * getNumBanks() method from the
 * DataBuffer class within a single Java file.
 */
public class DataBuffer_getNumBanks_Example {

    /**
     * Main method to run the example.
     */
    public static void main(String[] args) {
        // Initialize the BufferedImage and its corresponding DataBuffer
        BufferedImage bufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT);
        DataBuffer dataBuffer = new DataBufferInt(new int[bufferedImage.getWidth() * bufferedImage.getHeight()]{0}], bufferedImage.getWidth() * bufferedImage.getHeight());

        // Set the pixel values using the DataBuffer
        int[] bankData = dataBuffer.getBufferedImage().getRaster().getPixels(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight()));
        for (int i = 0; i < bankData.length; i++) {
            bankData[i] *= 2; // Multiply pixel values by 2
        }

        // Print the number of banks in the DataBuffer
        System.out.println("Number of Banks: " + dataBuffer.getNumBanks()));
    }
}