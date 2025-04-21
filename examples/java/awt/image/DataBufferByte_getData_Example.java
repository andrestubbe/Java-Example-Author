package examples.java.awt.image;

import java.nio.ByteBuffer;

public class DataBufferByte_getData_Example {

    /**
     * This example demonstrates how to use the `DataBufferByte` class in Java. The purpose of this example is to show how to retrieve the data from a `DataBufferByte` object using its `getData()` method.
     */

    public static void main(String[] args) {

        // Create an instance of DataBufferByte with a capacity of 100 bytes
        DataBufferByte buffer = new DataBufferByte(100);

        // Fill the buffer with some example data
        byte[] exampleData = new byte[100];
        for (int i = 0; i < 100; i++) {
            exampleData[i] = (byte) (Math.random() * 256));
        }
        buffer.put(0, exampleData);

        // Get the data from the buffer and print it to the console
        ByteBuffer byteBuffer = ByteBuffer.wrap(buffer.getData()));
        while (byteBuffer.hasRemaining()) {
            System.out.print((char) byteBuffer.get())));
        }
        System.out.println();

    }

}