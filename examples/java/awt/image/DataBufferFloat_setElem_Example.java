package examples.java.awt.image;

import java.util.Random;

public class DataBufferFloat_setElem_Example {

    /**
     * This example demonstrates how to use the `DataBufferFloat` class's `setElem()` method. 
     * The `setElem()` method is used to set a specific element in the data buffer at a given index with a specified value.
     * In this example, we create a new instance of the `Random` class and use it to generate random floating-point values within a specific range. We then pass these generated values to the `setElem()` method of the `DataBufferFloat` class to set those elements in the data buffer with the specified values.
     * Finally, we print out the contents of the data buffer after setting its elements using the `setElem()` method.
     */

    public static void main(String[] args) {

        // Create a new instance of the DataBufferFloat class
        DataBufferFloat dataBuffer = new DataBufferFloat();

        // Get the size of the data buffer
        int bufferSize = dataBuffer.getLength();

        // Create a new instance of the Random class to generate random floating-point values within a specific range
        Random random = new Random();

        // Set each element in the data buffer with a specified value generated randomly
        for (int i = 0; i < bufferSize; i++) {

            // Generate a random floating-point value between -1.0 and 1.0
            float randomValue = random.nextFloat() * 2.0f - 1.0f;

            // Set the element at index i in the data buffer to the generated random value
            dataBuffer.setElem(i, randomValue));

        }

        // Print out the contents of the data buffer after setting its elements using the setElem() method
        for (int i = 0; i < bufferSize; i++) {
            System.out.println("Element at index " + i + ": " + dataBuffer.getElem(i)));
        }

    }

}