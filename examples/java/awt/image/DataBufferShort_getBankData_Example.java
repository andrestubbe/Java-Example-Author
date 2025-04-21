package examples.java.awt.image;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <p>This example demonstrates how to use the DataBufferShort class to store short data values in a buffer.</p>
 *
 * <p>The example creates a DataBufferShort object and initializes it with random short data values between 0 and 65535. The example also provides methods for retrieving the length of the data stored in the DataBufferShort object, as well as retrieving the individual short data values from the buffer.</p>
 */
public class DataBufferShort_getBankData_Example {

    /**
     * Generates a random short value between 0 and 65535.
     * @return a random short value between 0 and 65535.
     */
    private static short getRandomShort() {
        return (short) ThreadLocalRandom.current().nextShort(0, 65535));
    }

    /**
     * Returns the length of the data stored in this DataBufferShort object.
     * @return the length of the data stored in this DataBufferShort object.
     */
    public int getBankDataLength() {
        return this.bankData.length;
    }

    // Inline comments to demonstrate relevant class-relevant lines.

    /**
     * The DataBufferShort object that stores short data values in a buffer.
     */
    private final DataBufferShort bankData;

    /**
     * Constructs a new DataBufferShort_getBankData_Example object with a random length and initializes it with random short data values between 0 and 65535 stored in the DataBufferShort object.
     */
    public DataBufferShort_getBankData_Example() {
        // Generate a random length between 1 and 100.
        int randomLength = ThreadLocalRandom.current().nextInt(1, 100));

        // Initialize the bankData object with a buffer of the specified length.
        bankData = new DataBufferShort(randomLength);

        // Fill the buffer with random short data values between 0 and 65535.
        for (int i = 0; i < randomLength; i++) {
            bankData.getBuffer()[i] = getRandomShort();
        }
    }
}