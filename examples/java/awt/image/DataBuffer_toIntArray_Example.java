package examples.java.awt.image;

import java.nio.ByteBuffer;
import java.util.IntArrayList;

public class DataBuffer_toIntArray_Example {

    /**
     * This example demonstrates the usage of the `DataBuffer` class by creating an int array from a `ByteBuffer`. The resulting int array can be useful when working with image data in Java applications.
     */

    public static void main(String[] args) {

        // Create a ByteBuffer containing some sample image data
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * 100 * 100)); // Allocate a buffer of size 4MB (4,294,967,296 bytes), with each element representing an RGB color value encoded in 8 bits per channel format.

        // Convert the ByteBuffer to an int array
        IntArrayList intArray = new IntArrayList();
        while (byteBuffer.hasRemaining()) {
            int b = byteBuffer.get() & 0xFF; // Get a byte from the buffer and mask out any high bit values to ensure that the resulting int value is within the range of a signed 32-bit integer (-2^31, 2^31 - 1)).
            int g = byteBuffer.get() & 0xFF;
            int r = byteBuffer.get() & 0xFF;

            // Combine the RGB color values into a single int value
            int combinedColorValue = (r << 16) | (g << 8) | b;

            // Add the combined color value to the IntArrayList
            intArray.add(combinedColorValue);
        }

        // Print the resulting int array
        System.out.println("Int Array: " + intArray));

    }
}