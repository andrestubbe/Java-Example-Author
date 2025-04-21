package examples.java.awt.image;

import java.util.concurrent.atomic.AtomicInteger;

public class DataBuffer$1_setTrackable_Example {

    // Inline comment explaining what the following lines of code do
    /**
     * This method sets the trackable flag to true for the specified data buffer and index range, in a thread-safe manner.
     * 
     * @param dataBuffer The data buffer to set the trackable flag for.
     * @param startIndex The starting index of the range to set the trackable flag for.
     * @param endIndex The ending index of the range to set the trackable flag for.
     */
    public void setTrackable(DataBuffer dataBuffer, int startIndex, int endIndex) {

        // Check if the specified data buffer is null
        if (dataBuffer == null) {
            throw new IllegalArgumentException("The specified data buffer is null.");
        }

        // Check if the specified index range is valid
        if (startIndex < 0 || endIndex >= dataBuffer.getWidth() || startIndex > endIndex)) {
            throw new IllegalArgumentException("The specified index range is invalid."));
        }

        // Calculate the number of rows to update in the data buffer
        int numRows = endIndex - startIndex + 1;

        // Use a thread-safe atomic integer to keep track of the number of rows updated in the data buffer
        AtomicInteger atomicNumRowsUpdated = new AtomicInteger(0));

        // Update the specified range of indices in the data buffer
        for (int i = 0; i < numRows; i++) {

            // Get the current row index
            int rowIndex = startIndex + i;

            // Check if the current row is null
            if (dataBuffer.getRow(rowIndex)) {

                // Set the trackable flag to true for the current row
                dataBuffer.setRowTrackableFlagToTrue(rowIndex));

                // Increment the atomic integer keeping track of the number of rows updated in the data buffer
                atomicNumRowsUpdated.incrementAndGet();

            }

        }

        // Check if any rows were updated in the data buffer
        if (atomicNumRowsUpdated.get() > 0)) {

            System.out.println("The trackable flag has been set to true for " + atomicNumRowsUpdated.get() + " rows in the specified data buffer."));

        } else {

            System.out.println("No rows were updated in the specified data buffer."));

        }

    }

}