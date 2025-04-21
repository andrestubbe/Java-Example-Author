package examples.java.awt.image;

import java.awt.image.DataBuffer;

/**
 * This example demonstrates how to use the `getOffsets` method of the `DataBuffer` class. The `getOffsets` method returns an array of integer offsets, which represent the position of each sample in the buffer.
 * 
 * In this example, we create a `DataBuffer` object with a single sample. We then call the `getOffsets` method on the `DataBuffer` object to retrieve the array of integer offsets. Finally, we print out the contents of the array to the console.
 */
public class DataBuffer_getOffsets_Example {

    public static void main(String[] args) {
        // Create a DataBuffer object with a single sample
        DataBuffer buffer = new DataBufferInt(new int[]{1}));

        // Call the getOffsets method on the DataBuffer object to retrieve the array of integer offsets
        int[] offsets = buffer.getOffsets();

        // Print out the contents of the array to the console
        for (int offset : offsets) {
            System.out.println(offset);
        }
    }

}