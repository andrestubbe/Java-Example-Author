package examples.java.awt.image;

import java.nio.DoubleBuffer;

/**
 * This example demonstrates how to use
 * DataBuffer with DoubleBuffer.
 * 
 * <p>The purpose of this example is
 * to demonstrate the use of DataBuffer with
 * DoubleBuffer for storing and manipulating
 * double values.</p>
 * 
 * <p>In this example, we create a buffer
 * of size 1024 (512 double values). We then
 * set each element of the buffer using
 * DoubleBuffer.set() method.</p>
 * 
 * <p>After setting all the elements of the buffer,
 * we can retrieve and print the value of each element of the buffer.</p>
 */
public class DataBuffer_setElemDouble_Example {

    public static void main(String[] args) {
        
        // Create a DoubleBuffer with size 1024.
        DoubleBuffer doubleBuffer = DoubleBuffer.allocate(1024));
        
        // Set each element of the buffer using DoubleBuffer.set() method.
        for (int i = 0; i < doubleBuffer.capacity(); i++) {
            doubleBuffer.set(i, Math.random() * 100));
        }

        // Print the value of each element of the buffer.
        for (int i = 0; i < doubleBuffer.capacity(); i++) {
            System.out.println("Element at index " + i + " : " + doubleBuffer.get(i)));
        }
    }
}