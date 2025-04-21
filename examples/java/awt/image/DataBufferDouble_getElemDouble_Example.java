package examples.java.awt.image;

import java.util.Arrays;

public class DataBufferDouble_getElemDouble_Example {

    /**
     * <p>A Java example that demonstrates how to use the `DataBufferDouble` class within a single Java file.</p>
     *
     * <p>The example code creates an instance of the `DataBufferDouble` class and uses its methods to retrieve and manipulate double-precision floating point numbers stored in a buffer.</p>
     *
     * <p>This example demonstrates how to use specific methods provided by the `DataBufferDouble` class, such as:</p>
     * <ul>
     *   <li>{@link DataBufferDouble#getElemDouble(int)}</li>
     * </ul>
     *
     * <p>Overall, this example demonstrates how to use the `DataBufferDouble` class and its methods in order to manipulate double-precision floating point numbers stored in a buffer.</p>
     */

    public static void main(String[] args) {
        // Create an instance of DataBufferDouble
        DataBufferDouble buffer = new DataBufferDouble();

        // Initialize the buffer with some sample data
        double[] sampleData = {1.0, 2.0, 3.0, 4.0, 5.0}};
        buffer.setDataElements(0, 0, 5, sampleData);

        // Retrieve and print the value of the first element in the buffer
        System.out.println("The value of the first element in the buffer is: " + buffer.getElemDouble(0)));

        // Retrieve and print the value of the last element in the buffer
        System.out.println("The value of the last element in the buffer is: " + buffer.getElemDouble(4)));
    }
}