package examples.java.awt.image;

import java.nio.FloatBuffer;

public class DataBuffer_setElemFloat_Example {

    /**
     * A demonstration of the `DataBuffer` class's usage with a `FloatBuffer`. This example specifically demonstrates how to use the `setElemFloat()` method on a `DataBuffer` object containing a `FloatBuffer`.
     */
    public void demonstrateUsage() {
        // Create a DataBuffer object backed by a FloatBuffer.
        FloatBuffer floatBuffer = FloatBuffer.allocate(100));

        DataBuffer<FloatBuffer> dataBuffer = new DataBuffer<>(floatBuffer, 100));

        // Set the first element of the FloatBuffer using the setElemFloat() method on the DataBuffer object.
        dataBuffer.setElemFloat(0, 1.0f)); // Example value: 1.0

        // Print out the current values in the FloatBuffer to demonstrate that the setElemFloat() method successfully modified the buffer's contents.
        float[] floatArray = new float[100];
        dataBuffer.getElemFloat(0, floatArray, 0, 100)); // Example value: 1.0

    }
}