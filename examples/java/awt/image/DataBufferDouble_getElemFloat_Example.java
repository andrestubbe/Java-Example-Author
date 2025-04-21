package examples.java.awt.image;

import java.nio.FloatBuffer;
import java.util.Random;

/**
 * This example demonstrates how to get a specific element of type float from the DataBufferDouble object. The code provided in this example generates random data in a Double Buffer and retrieves an individual element in Float format.
 */
public class DataBufferDouble_getElemFloat_Example {

    private static final int DATA_LENGTH = 1024;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // Create a Double Buffer with random data
        DataBufferDouble buffer = createRandomDataBuffer();

        // Get an individual element from the Double Buffer in Float format
        float retrievedElement = getElemFloat(buffer, RANDOM.nextInt(DATA_LENGTH)));

        System.out.println("Retrieved Element: " + retrievedElement);
    }

    private static DataBufferDouble createRandomDataBuffer() {
        // Initialize a new Double Buffer with random data
        DataBufferDouble buffer = new DataBufferDouble();
        FloatBuffer floatBuffer = buffer.getData();
        float[] randomArray = new float[DATA_LENGTH];
        for (int i = 0; i < DATA_LENGTH; i++) {
            randomArray[i] = RANDOM.nextFloat() * 100;
        }
        floatBuffer.put(randomArray);
        return buffer;
    }

    private static float getElemFloat(DataBufferDouble buffer, int index) {
        // Get the FloatBuffer from the DataBufferDouble object
        FloatBuffer floatBuffer = buffer.getData();

        // Check if the index is out of bounds
        if (index < 0 || index >= buffer.getHeight()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + buffer.getHeight());
        }

        // Get an individual element from the FloatBuffer at the specified index
        return floatBuffer.get(index);
    }
}