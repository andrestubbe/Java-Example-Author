package examples.java.awt.image;

import java.util.Random;

public class DataBufferShort_setElem_Example {

    /**
     * This example demonstrates how to use the setElem() method from the DataBufferShort class. The setElem() method allows for setting a specific element in a buffer. In this example, we will create a buffer of shorts and use the setElem() method to set individual elements within the buffer.
     */

    public static void main(String[] args) {

        // Create a DataBufferShort object with a capacity of 2048 elements
        DataBufferShort dataBuffer = new DataBufferShort(2048);

        // Use a Random object to generate random short values
        Random random = new Random();

        // Loop through the buffer and set each element using the setElem() method
        for (int i = 0; i < dataBuffer.getLength(); i++) {
            dataBuffer.setElem(i, (short) random.nextInt(Short.MAX_VALUE)));
        }

        // Print out the first 10 elements of the buffer to confirm that the setElem() method has been successfully used
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ": " + dataBuffer.getElem(i)));
        }

    }

}