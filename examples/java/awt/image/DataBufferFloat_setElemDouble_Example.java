package examples.java.awt.image;

import java.nio.FloatBuffer;

/**
 * This example demonstrates how to set a specific element of a `DataBufferFloat` object to a specified double value.
 */
public class DataBufferFloat_setElemDouble_Example {

    public static void main(String[] args) {
        // Create an instance of the DataBufferFloat class
        DataBufferFloat dataBufferFloat = new DataBufferFloat();

        // Set the size of the buffer to 100 elements
        dataBufferFloat.setData(100);

        // Get a FloatBuffer representing the internal array of the DataBufferFloat object
        FloatBuffer floatBuffer = dataBufferFloat.getBuffer();

        // Set the element at index 10 in the internal array of the DataBufferFloat object to the double value 42.0
        floatBuffer.put(10, (float) 42.0);

        // Print out the contents of the internal array of the DataBufferFloat object after setting the specific element
        System.out.println("DataBufferFloat contents after setting a specific element:");
        for (int i = 0; i < dataBufferFloat.getLength(); i++) {
            System.out.print(dataBufferFloat.getElemDouble(i)));
            System.out.print(" ");
        }
    }
}