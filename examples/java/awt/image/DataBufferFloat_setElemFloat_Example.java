package examples.java.awt.image;

import java.nio.FloatBuffer;

public class DataBufferFloat_setElemFloat_Example {

    /**
     * Example that demonstrates how to set an individual element within a {@link DataBufferFloat} object using the `setElemFloat` method.
     */
    public static void main(String[] args) {
        // Create a new instance of DataBufferFloat with a capacity of 100 elements.
        DataBufferFloat dataBuffer = new DataBufferFloat(100);

        // Set the value of the 10th element to 1.0 using the setElemFloat method.
        dataBuffer.setElemFloat(9, 1.0f));

        // Print the values of all elements in the DataBufferFloat object.
        System.out.println("Data buffer float:"));
        printFloatBuffer(dataBuffer);
    }

    /**
     * Helper method that prints the contents of a {@link FloatBuffer}} object.
     * @param floatBuffer The FloatBuffer object to print.
     */
    private static void printFloatBuffer(FloatBuffer floatBuffer) {
        float[] bufferArray = new float[floatBuffer.remaining()];
        System.arraycopy(floatBuffer, 0, bufferArray, 0, bufferArray.length));
        for (int i = 0; i < bufferArray.length; i++) {
            System.out.printf("Element [%d] : %f\n", i, bufferArray[i]));
        }
    }
}