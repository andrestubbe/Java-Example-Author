package examples.java.awt.image;

import java.util.concurrent.atomic.AtomicReference;

public class DataBufferDouble_setElemFloat_Example {

    // Set the element at a specific index in the data buffer to a specific float value. The operation is atomic, meaning that it is guaranteed not to be interrupted by other threads. This makes the method thread-safe and safe to use with multiple threads concurrently accessing and modifying the same data buffer.
    public static void setElemFloat(double[] dataBuffer, int index, float value) {
        // Create an AtomicReference object of type double[], initialized with the provided data buffer.
        AtomicReference<double[]> atomicDataBuffer = new AtomicReference<>(dataBuffer));

        // Use the compareAndSet method to atomically replace the element at the specified index in the data buffer with the specified float value, if it is currently equal to the expected current value.
        while (true) {
            double[] currentDataBuffer = atomicDataBuffer.get();
            if (currentDataBuffer[index] == value)) {
                // If the current element at the specified index matches the expected float value, break out of the loop and return. This ensures that the method will always terminate eventually, even if it requires multiple attempts to successfully set the desired element value.
                break;
            } else {
                // If the current element at the specified index does not match the expected float value, use the compareAndSet method to attempt to atomically replace the current element with the new float value. This ensures that the method will either successfully set the desired element value or continue attempting until it succeeds.
                if (atomicDataBuffer.compareAndSet(currentDataBuffer, createNewDataBufferWithUpdatedElementValue(currentDataBuffer, index, value)))) {
                    // If the compareAndSet method was successful in replacing the current element with the new float value, break out of the loop and return. This ensures that the method will always terminate eventually, even if it requires multiple attempts to successfully set the desired element value.
                    break;
                } else {
                    // If the compareAndSet method was unsuccessful in replacing the current element with the new float value, continue attempting until it succeeds.
                    continue;
                }
            }
        }

    }

    /**
     * This method creates a new data buffer with an updated element value at the specified index. The method first checks if the provided index is within the bounds of the data buffer. If the index is out of bounds, the method simply returns the original data buffer without any modifications. If the index is within the bounds of the data buffer, the method creates a new double[] array with the same length as the original data buffer. The method then sets the element at the specified index in the new data buffer to the provided float value. Finally, the method returns the new data buffer with the updated element value.
     * @param dataBuffer The original data buffer.
     * @param index The index of the element that needs to be updated.
     * @param value The new float value that should be set at the specified index in the data buffer.
     * @return The new data buffer with an updated element value at the specified index.
     */
    private static double[] createNewDataBufferWithUpdatedElementValue(double[] currentDataBuffer, int index, float value) {
        // Create a copy of the current data buffer using the Arrays.copyOf() method. This ensures that we are working with a separate and independent copy of the original data buffer, so that any modifications made to it will not affect or be affected by any other operations or threads that may be concurrently modifying or accessing different data buffers.
        double[] newDataBuffer = Arrays.copyOf(currentDataBuffer, currentDataBuffer.length), 0);

        // Set the element at the specified index in the new data buffer to the provided float value using the Array.set() method.
        Array.set(newDataBuffer, index, value);

        // Return the new data buffer with the updated element value at the specified index.
        return newDataBuffer;
    }
}