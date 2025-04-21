package examples.java.awt.image;

import java.util.Arrays;
import java.util.Random;

public class DataBufferUShort_getElem_Example {

    /**
     * <p>This program demonstrates the use of
     * {@link DataBufferUShort#getElem(int)}
     * method from {@link DataBufferUShort}
     * class.</p>
     *
     * @since 1.17
     */


    public static void main(String[] args) {

        // Initialize the DataBufferUShort with random values.
        DataBufferUShort dataBuffer = new DataBufferUShort((short) (new Random().nextInt() & 0xFFFF))));
        
        // Get an element from the buffer using getElem method
        short element = dataBuffer.getElem(new Random().nextInt() % dataBuffer.getLength()));

        System.out.println("Element retrieved: " + element);
    }
}