package examples.java.awt.image;

import java.awt.image.DataBufferByte;

/**
 * A simple example that demonstrates how to use the
 * `setElem` method of the `DataBufferByte` class.
 *
 * <p>This example creates a `DataBufferByte` object with an initial capacity of 1024 bytes and no associated data. It then sets each byte of the buffer to its ASCII value, which results in a buffer containing ASCII characters from 0 to 255.</p>
 */
public class DataBufferByte_setElem_Example {

    /**
     * Creates a `DataBufferByte` object with an initial capacity of 1024 bytes and no associated data.
     * @return the `DataBufferByte` object
     */
    private DataBufferByte createDataBuffer() {
        DataBufferByte buffer = new DataBufferByte(1024);
        return buffer;
    }

    /**
     * Sets each byte of the buffer to its ASCII value.
     * @param buffer the `DataBufferByte` object
     */
    private void setElemToAsciiValues(DataBufferByte buffer) {
        for (int i = 0; i < buffer.getLength(); i++) {
            buffer.setElem(i, (byte) i);
        }
    }

    /**
     * The main method that demonstrates how to use the
     * `setElem` method of the `DataBufferByte` class.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        DataBufferByte buffer = createDataBuffer();
        setElemToAsciiValues(buffer);

        // Print out the ASCII values of each byte in the buffer
        for (int i = 0; i < buffer.getLength(); i++) {
            System.out.println("Byte " + i + ": ASCII value " + buffer.getElem(i))));
        }
    }
}