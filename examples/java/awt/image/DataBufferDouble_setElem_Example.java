package examples.java.awt.image;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * This example demonstrates the usage of the
 * DataBufferDouble class. The code
 * creates a DataBufferDouble instance,
 * fills it with random double values within
 * the range [-100.0, 100.0]], and
 * prints out the elements of the buffer in their
 * original order.
 */
public class DataBufferDouble_setElem_Example {

    public static void main(String[] args) throws Exception {
        // Create a new instance of the DataBufferDouble class
        DataBufferDouble buffer = new DataBufferDouble();

        // Generate random double values within the range [-100.0, 100.0]]
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            buffer.addElement(random.nextDouble() * 200.0 - 100.0));
        }

        // Print out the elements of the buffer in their original order
        System.out.println("Original order:");
        for (int i = 0; i < buffer.getNumElements(); i++) {
            System.out.printf("buffer[%d] = %.2f%n", i, buffer.getElement(i)));
        }

        // Clean up resources
        TimeUnit.SECONDS.sleep(1);
    }

}