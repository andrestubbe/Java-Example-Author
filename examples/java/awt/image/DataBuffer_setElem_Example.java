package examples.java.awt.image;

import java.nio.ByteBuffer;

public class DataBuffer_setElem_Example {

    /**
     * A demonstration of using the `DataBuffer` class's `setElem()` method to modify specific elements within a `ByteBuffer`.
     * <p>
     * This example demonstrates setting a single element at index 42 (0x2a in hexadecimal) to the value 123 (0x7b in hexadecimal)) in a `ByteBuffer` of size 100 (`buffer = ByteBuffer.allocate(100);`)
     * </p>
     */

    public static void main(String[] args) {

        // Allocate a ByteBuffer of size 100
        ByteBuffer buffer = ByteBuffer.allocate(100);

        // Get the primitive array from the ByteBuffer
        byte[] data = buffer.array();

        // Set the element at index 42 to 123
        data[42] = (byte) 0x7b;

        // Reset the position of the ByteBuffer to the beginning
        buffer.position(0);

    }

}