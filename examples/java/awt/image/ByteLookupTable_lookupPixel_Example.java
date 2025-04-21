package examples.java.awt.image;

import java.awt.image.ByteLookupTable;

/**
 * An example of using the ByteLookupTable
 * class to create a custom lookup table.
 * This example demonstrates how to use the
 * `getData` method to retrieve an array of bytes,
 * which is then used as the lookup table data.
 */
public class ByteLookupTable_lookupPixel_Example {

    /**
     * Creates a new instance of the ByteLookupTable class with a specified data array.
     * @param data the byte array that will be used as the lookup table data.
     * @return a new instance of the ByteLookupTable class with the specified data array.
     */
    public static ByteLookupTable createByteLookupTable(byte[] data) {
        // Create a new instance of the ByteLookupTable class with the specified data array.
        return new ByteLookupTable(data));
    }

    /**
     * Gets an array of bytes containing the lookup table data for the given image width and height.
     * @param imageWidth the desired width of the resulting image (in pixels).
     * @param imageHeight the desired height of the resulting image (in pixels).
     * @return an array of bytes containing the lookup table data for the given image width and height.
     */
    public static byte[] getLookupTableData(int imageWidth, int imageHeight) {
        // Calculate the total number of bytes required to represent the lookup table data for the given image width and height.
        final int numBytes = imageWidth * imageHeight;

        // Create a new array of bytes with the calculated size.
        byte[] lookupTableData = new byte[numBytes];

        // Return the newly created lookup table data array.
        return lookupTableData;
    }
}