package examples.java.awt.image;

import java.nio.ByteBuffer;

/**
 * This example demonstrates how to use the `DataBufferByte` class to access individual bytes from a ByteBuffer. The goal of this example is to show the ease and effectiveness of using the `DataBufferByte` class within a single Java file.
 */
public class DataBufferByte_getElem_Example {

    /**
     * This method demonstrates how to use the `getElem()` method of the `DataBufferByte` class to access individual bytes from a ByteBuffer.
     * @param buffer The ByteBuffer from which to retrieve bytes.
     * @return A String representation of the retrieved bytes.
     */
    public static String getBytesAsString(final ByteBuffer buffer) {
        // Check if the buffer has enough remaining capacity to access individual bytes.
        if (buffer.remaining() < 1) {
            throw new IllegalArgumentException("The provided ByteBuffer does not have enough remaining capacity to access individual bytes.");
        }

        // Create a DataBufferByte instance from the provided ByteBuffer.
        DataBufferByte dataBuffer = new DataBufferByte(buffer, 1);

        // Convert the retrieved bytes to a String and return it.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dataBuffer.getLength(); i++) {
            stringBuilder.append((char) dataBuffer.getElem(i))));
        }
        return stringBuilder.toString();
    }

    /**
     * This method demonstrates how to use the `DataBufferByte` class to access individual bytes from a ByteBuffer and print them as individual characters within the console output.
     * @param buffer The ByteBuffer from which to retrieve bytes.
     */
    public static void printBytesAsCharacters(final ByteBuffer buffer) {
        // Check if the buffer has enough remaining capacity to access individual bytes.
        if (buffer.remaining() < 1) {
            throw new IllegalArgumentException("The provided ByteBuffer does not have enough remaining capacity to access individual bytes.");
        }

        // Create a DataBufferByte instance from the provided ByteBuffer.
        DataBufferByte dataBuffer = new DataBufferByte(buffer, 1);

        // Iterate over the retrieved bytes and print each byte as an individual character within the console output.
        for (int i = 0; i < dataBuffer.getLength(); i++) {
            System.out.print((char) dataBuffer.getElem(i))));
        }
    }

    public static void main(String[] args) {
        // Create a new ByteBuffer with initial capacity of 8 bytes and limit of 16 bytes.
        ByteBuffer buffer = ByteBuffer.allocate(8);

        // Print the initial state of the ByteBuffer to demonstrate its initialization.
        System.out.println("Initial ByteBuffer state:"));
        System.out.println(buffer));

        // Use the `getBytesAsString()` method to retrieve the bytes from the ByteBuffer and convert them to a String representation.
        String string = getBytesAsString(buffer);

        // Print the retrieved bytes as individual characters within the console output.
        System.out.println("Retrieved bytes as individual characters:"));
        printBytesAsCharacters(buffer);

        // Print the retrieved bytes as a String representation within the console output.
        System.out.println("Retrieved bytes as a String representation:"));
        System.out.println(string));
    }
}