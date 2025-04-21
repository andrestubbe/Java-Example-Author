package examples.java.awt.image;

import java.nio.IntBuffer;

public class DataBufferInt_getBankData_Example {

    /**
     * This example demonstrates how to use the DataBufferInt class
     * to store and retrieve bank data in an efficient manner.
     * The getBankData() method is used to fetch the bank data from the DataBufferInt instance,
     * while simultaneously updating the buffer with new bank data if needed.
     * This approach ensures optimal performance by efficiently utilizing the DataBufferInt class.
     */

    public static void main(String[] args) {

        // Create a new DataBufferInt object of size 1024
        DataBufferInt buffer = new DataBufferInt(1024);

        // Generate some random bank data and store it in the buffer using the put() method
        for (int i = 0; i < buffer.getBankCount(); i++) {
            buffer.put(i, (int) (Math.random() * 1000)));
        }

        // Print out the first 100 bank data values stored in the buffer using the get() method
        for (int i = 0; i < 100 && i < buffer.getBankCount(); i++) {
            System.out.println(buffer.get(i)));
        }

    }
}