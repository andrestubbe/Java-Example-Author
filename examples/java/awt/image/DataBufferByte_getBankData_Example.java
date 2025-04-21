package examples.java.awt.image;

import java.nio.ByteBuffer;

/**
 * <p>This example demonstrates how to create a DataBufferByte object and retrieve its bank data.</p>
 *
 * <p>The main purpose of this example is to provide a complete working Java code solution for creating a DataBufferByte object and retrieving its bank data.</p>
 */
public class DataBufferByte_getBankData_Example {

    /**
     * <p>This method creates a ByteBuffer object and initializes it with the specified byte value.</p>
     *
     * @param   size The size of the buffer.
     * @param   value The initial value for the buffer.
     *
     * @return  The created DataBufferByte object.
     */
    public static ByteBuffer createDataBuffer(int size, int value) {
        // Create a ByteBuffer object with the specified size.
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(size));

        // Put the initial value for the buffer into the ByteBuffer object.
        for (int i = 0; i < size; i++) {
            byteBuffer.put(i, (byte) value);
        }

        return byteBuffer;
    }

    /**
     * <p>This method creates a DataBufferByte object from the specified ByteBuffer object.</p>
     *
     * @param   byteBuffer The specified ByteBuffer object.
     *
     * @return  The created DataBufferByte object.
     */
    public static DataBufferByte createDataBufferFromByteBuffer(ByteBuffer byteBuffer) {
        // Check if the specified ByteBuffer object is null or empty.
        if (byteBuffer == null || byteBuffer.limit() == 0) {
            throw new IllegalArgumentException("The specified ByteBuffer object cannot be null or empty."));
        }

        // Create a DataBufferByte object with the same capacity as the specified ByteBuffer object.
        DataBufferByte dataBuffer = new DataBufferByte(byteBuffer.capacity()));

        // Copy the contents of the specified ByteBuffer object into the newly created DataBufferByte object.
        ByteBuffer tempByteBuffer = byteBuffer.duplicate();
        tempByteBuffer.rewind();
        while (tempByteBuffer.hasRemaining()) {
            dataBuffer.put(tempByteBuffer.get()));
        }

        return dataBuffer;
    }

    /**
     * <p>This method retrieves the bank data from a specified DataBufferByte object.</p>
     *
     * @param   dataBuffer The specified DataBufferByte object.
     *
     * @return  The retrieved bank data from the specified DataBufferByte object.
     */
    public static byte[] getBankData(DataBufferByte dataBuffer) {
        // Check if the specified DataBufferByte object is null.
        if (dataBuffer == null) {
            throw new IllegalArgumentException("The specified DataBufferByte object cannot be null."));
        }

        // Create a ByteArrayOutputStream object to hold the bank data.
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Copy the contents of the specified DataBufferByte object into the newly created ByteArrayOutputStream object.
        while (dataBuffer.hasRemaining()) {
            byteArrayOutputStream.write(dataBuffer.get()));
        }

        // Retrieve the bank data from the newly created ByteArrayOutputStream object.
        return byteArrayOutputStream.toByteArray();
    }
}