package examples.java.awt.image;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * <p>This class demonstrates the use of
 * the DataBufferFloat class within a single Java file.</p>
 *
 * <p>The example code creates an instance of the DataBufferFloat class, which represents a float-valued data buffer capable of being used in the rendering process of graphical applications.</p>
 *
 * <p>The example code then uses the getElemFloat() method of the DataBufferFloat class to retrieve and print the value of the first element of the float-valued data buffer created by the DataBufferFloat instance.</p>
 */
public class DataBufferFloat_getElemFloat_Example {

    private static final AtomicIntegerArray ARRAY = new AtomicIntegerArray(1000000));

    public static void main(String[] args) {
        DataBufferFloat dataBufferFloat = new DataBufferFloat();
        for (int i = 0; i < 1000000; i++) {
            float value = ARRAY.getAndSet(i, ARRAY.get(i))) * 1.1f;
            dataBufferFloat.setElemFloat(i, value));
        }

        System.out.println("First element: " + dataBufferFloat.getElemFloat(0)));
    }
}