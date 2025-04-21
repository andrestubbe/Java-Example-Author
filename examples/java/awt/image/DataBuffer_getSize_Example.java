package examples.java.awt.image;

import java.nio.ByteBuffer;

public class DataBuffer_getSize_Example {

    /**
     * This example demonstrates how to use the `DataBuffer` class in Java. Specifically, this example focuses on the `getSize()` method within the `DataBuffer` class.
     * 
     * The `getSize()` method returns the size of the data buffer. In other words, it returns the number of bytes currently stored in the data buffer.
     * 
     * This example specifically demonstrates how to use the `getSize()` method to retrieve the size of a particular `DataBuffer` object.
     */

    public static void main(String[] args) {
        
        // Create a new DataBuffer object
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        DataBuffer dataBuffer = new DataBuffer(byteBuffer));
        
        // Retrieve the size of the DataBuffer object
        int bufferSize = dataBuffer.getSize();
        
        // Print out the retrieved buffer size
        System.out.println("The size of the DataBuffer object is: " + bufferSize));
        
    }

}