package examples.java.awt.image;

import java.awt.image.DataBuffer;

public class DataBuffer_getElemDouble_Example {

    /**
     * This example demonstrates how to use the `getElemDouble` method from the `DataBuffer` class.
     * 
     * The `DataBuffer` class provides a buffer for storing data in a specified data type, such as byte, short, int, or float.
     * 
     * In this example, we create an instance of `DataBuffer` with a specified data type and size.
     * 
     * Next, we use the `getElemDouble` method to retrieve the value at a specific index in the `DataBuffer` object.
     * 
     * Finally, we print out the retrieved value and its corresponding index in the `DataBuffer` object.
     */

    public static void main(String[] args) {

        // Create an instance of DataBuffer with specified data type (double) and size (5).
        DataBuffer<Double> dataBuffer = new DataBuffer<>(Double.TYPE, 5));

        // Set the value at index 0 to 2.0 in the DataBuffer object.
        dataBuffer.getElemDouble(0)).setValue(2.0);

        // Retrieve and print out the value at index 0 in the DataBuffer object.
        System.out.println("Value at index 0: " + dataBuffer.getElemDouble(0)));

    }

}