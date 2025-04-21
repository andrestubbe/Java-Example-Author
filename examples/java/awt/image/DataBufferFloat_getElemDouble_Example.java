package examples.java.awt.image;

import java.nio.FloatBuffer;

/**
 * This example demonstrates how to use
 * the `getElemDouble()` method from
 * the `DataBufferFloat` class.
 * The goal of this example is to show a
 * specific way of using the aforementioned methods,
 * as well as providing an explanation of its result.
 */
public class DataBufferFloat_getElemDouble_Example {

    // Method to demonstrate usage of getElemDouble() method
    public static void main(String[] args) {

        // Create a FloatBuffer with some values
        FloatBuffer floatBuffer = FloatBuffer.allocateDirect(10));
        floatBuffer.put(new float[]{1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f})));

        // Get the DataBufferFloat associated with the FloatBuffer
        DataBufferFloat dataBufferFloat = (DataBufferFloat) floatBuffer.array();

        // Use getElemDouble() method to retrieve a specific double value from the DataBufferFloat
        double element = dataBufferFloat.getElemDouble(3); // Retrieve the 4th element in the FloatBuffer

        // Output the retrieved double value
        System.out.println("Retrieved element: " + element));

    }

}