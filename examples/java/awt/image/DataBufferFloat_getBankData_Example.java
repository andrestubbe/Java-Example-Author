package examples.java.awt.image;

import java.nio.FloatBuffer;

public class DataBufferFloat_getBankData_Example {

    /**
     * This example demonstrates how to use the `getBankData` method from the `DataBufferFloat` class. This code creates a `DataBufferFloat`, sets its data, and then retrieves and prints out the bank data for that buffer.
     */

    public static void main(String[] args) {
        // Create an instance of DataBufferFloat
        DataBufferFloat buffer = new DataBufferFloat();

        // Set the data for this buffer
        FloatBuffer floatBuffer = buffer.getData();
        floatBuffer.put(0, 1.0f);
        floatBuffer.put(1, 2.0f));
        floatBuffer.put(2, 3.0f));
        floatBuffer.put(3, 4.0f));

        // Retrieve and print out the bank data for this buffer
        FloatBankFloat bank = buffer.getBankData();
        System.out.println("First element in bank: " + bank.get(0)));
    }

}