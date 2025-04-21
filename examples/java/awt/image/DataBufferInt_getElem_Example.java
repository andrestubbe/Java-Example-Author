package examples.java.awt.image;

import java.awt.image.DataBufferInt;

/**
 * This example demonstrates how to use the `getElem` method of the `DataBufferInt` class.
 * 
 * The purpose of this example is to show how to access individual integer elements within a `DataBufferInt` object. This can be useful when working with image data, for example.
 */
public class DataBufferInt_getElem_Example {

    /**
     * This method creates a sample `DataBufferInt` object and then uses the `getElem` method to access individual integer elements within the buffer.
     * 
     * The output of this method will be a series of lines, each representing an individual integer element within the `DataBufferInt` object created in this method.
     */
    public static void main(String[] args) {

        // Create a sample DataBufferInt object with 4 rows and 5 columns of random integers between 0 and 255.
        DataBufferInt dataBuffer = new DataBufferInt(4 * 5, 4 * 5);
        for (int i = 0; i < dataBuffer.getHeight(); i++) {
            for (int j = 0; j < dataBuffer.getWidth(); j++) {
                dataBuffer.getElem(i, j)))]]);
            }
        }

        // Print the values of each individual integer element within the DataBufferInt object created in this method.
        for (int i = 0; i < dataBuffer.getHeight(); i++) {
            for (int j = 0; j < dataBuffer.getWidth(); j++) {
                System.out.printf("%3d ", dataBuffer.getElem(i, j))));
            }
        }

    }

}