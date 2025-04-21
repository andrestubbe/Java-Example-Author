package examples.java.awt.image;

import java.util.concurrent.TimeUnit;

public class DataBufferShort_getElem_Example {

    // The DataBufferShort class represents a buffer of short values. This example demonstrates the use of the getElem() method to retrieve a specific element from the DataBufferShort instance.

    /**
     * Retrieves and prints the specified element from the given DataBufferShort instance.
     *
     * @param dataBuffer The DataBufferShort instance to retrieve the element from.
     * @param index        The index of the element to retrieve.
     */
    public static void getElem(DataBufferShort dataBuffer, int index) {
        // Retrieve the specified element using the getElem() method.
        short elem = dataBuffer.getElem(index);

        // Print the retrieved element.
        System.out.println("Retrieved Element: " + elem);

        // Add a delay to observe the result before termination.
        try { TimeUnit.SECONDS.sleep(1L); } catch (Exception e) { /* Ignore */ }
    }
}