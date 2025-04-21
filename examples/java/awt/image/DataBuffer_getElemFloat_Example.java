package examples.java.awt.image;

import java.nio.FloatBuffer;

public class DataBuffer_getElemFloat_Example {

    /**
     * This example demonstrates how to use the DataBuffer
     * class within a single Java file. The code creates
     * a runnable example that performs the following operations:
     * 1. Creates a FloatBuffer with a capacity of 100 and an element order of NATURAL.
     * 2. Sets the first element in the FloatBuffer to 50.0f.
     * 3. Iterates over the remaining elements in the FloatBuffer, printing each element's float representation.
     * 
     * This example demonstrates how to retrieve individual elements from a FloatBuffer and perform operations on them.
     */

    public static void main(String[] args) {

        // Create a new instance of DataBuffer_getElemFloat_Example
        DataBuffer_getElemFloat_Example example = new DataBuffer_getElemFloat_Example();

        // Get the FloatBuffer from the DataBuffer object
        FloatBuffer floatBuffer = example.dataBuffer.getFloatBuffer();

        // Set the first element in the FloatBuffer to 50.0f
        floatBuffer.put(50, 0));

        // Iterate over the remaining elements in the FloatBuffer
        for (int i = 1; i < 100; i++) {
            System.out.println("Element " + i + ": " + floatBuffer.get(i)));
        }

    }

    // Declare a DataBuffer object of type float
    private DataBuffer<Float> dataBuffer;

}