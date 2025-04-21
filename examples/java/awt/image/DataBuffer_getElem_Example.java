package examples.java.awt.image;
import java.nio.ByteBuffer;
/**
 * <p>This class demonstrates how to use 
 * the `get()` method of the DataBuffer class. This method is used to retrieve a specific element from the buffer.</p>
 * 
 * <p>The example class creates an instance of the DataBuffer class, which represents an array of bytes using a ByteBuffer. The get() method is then called on the DataBuffer object in order to retrieve and print out each individual byte value stored within the buffer.</p>
 */
public class DataBuffer_getElem_Example {
    /**
     * <p>Main method for running the example code.</p>
     */
    public static void main(String[] args) {
        // Create a ByteBuffer with an initial capacity of 1024 bytes and a limit of 768 bytes.
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024).limit(768);
        
        // Create a DataBuffer object from the created ByteBuffer instance.
        DataBuffer dataBuffer = new DataBuffer(byteBuffer, byteBuffer.capacity()));

        // Print out each individual byte value stored within the buffer.
        for (int i = 0; i < dataBuffer.getLength(); i++) {
            System.out.println("Byte " + i + ": " + dataBuffer.getElem(i)));
        }
    }
}