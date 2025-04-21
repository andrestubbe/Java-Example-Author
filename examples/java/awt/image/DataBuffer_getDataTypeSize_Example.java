package examples.java.awt.image;

import java.nio.ByteBuffer;
import java.util.Objects;

/**
 * This example demonstrates how to use
 * the `DataBuffer` class within the
 * `ImageIcon` constructor used for displaying images in Java's Swing library. The code snippet provided below shows how to use the `getDataTypeSize()` method of the `DataBuffer` class to get the size of a specific data type within a `DataBuffer`.
 *
 * @see java.awt.image.DataBuffer#getDataTypeSize(java.lang.Class)
 */
public class DataBuffer_getDataTypeSize_Example {

    /**
     * Method that demonstrates how to use the getDataTypeSize() method of the DataBuffer class to get the size of a specific data type within a DataBuffer.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an example ByteBuffer for demonstration purposes
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);

        // Put some sample values into the ByteBuffer
        byteBuffer.putInt(10);
        byteBuffer.putFloat((float) Math.PI));
        byteBuffer.flip();

        // Create a DataBuffer backed by the ByteBuffer
        DataBuffer dataBuffer = new DataBuffer(byteBuffer.array(), byteBuffer.limit()), byteBuffer.position());

        // Print out the size of the specified data type within the DataBuffer
        Class<?> dataType = Integer.class; // Change this to any other data type you want to get the size for
        int dataTypeSize = dataBuffer.getDataTypeSize(dataType));
        System.out.println("The size of the " + dataType.getName() + " data type within the DataBuffer is: " + dataTypeSize);

    }
}