package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Example of using the `close()` method on an instance of the `Channels$1` class within a single Java file. This code demonstrates how to close a FileChannel and release any associated resources.
 */
public class Channels$1_close_Example {

    // Path to the file that will be closed
    private final Path filePath;

    /**
     * Constructor for the `Channels$1_close_Example` class. Initializes the instance variables and sets up the FileChannel using the specified file path.
     *
     * @param filePath The Path to the file that will be closed
     */
    public Channels$1_close_Example(Path filePath) {
        this.filePath = filePath;
    }

    /**
     * Method that closes a FileChannel and releases any associated resources. This method is used to demonstrate how to close a FileChannel using the `close()` method.
     *
     * @param fileChannel The FileChannel to be closed
     * @throws IOException If an error occurs while closing the FileChannel
     */
    public void closeFileChannel(FileChannel fileChannel) throws IOException {
        fileChannel.close();
    }

    /**
     * Method that creates a new ByteBuffer and fills it with random bytes using the `Random` class. This method is used to demonstrate how to create a new ByteBuffer and fill it with random data.
     *
     * @param bufferSize The size of the ByteBuffer to be created
     * @return A new ByteBuffer filled with random bytes
     */
    public ByteBuffer allocateRandomByteBuffer(int bufferSize) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(bufferSize));

        // Fill the ByteBuffer with random bytes using the Random class
        for (int i = 0; i < bufferSize; i++) {
            byteBuffer.put((byte) Math.random()));
        }

        return byteBuffer;
    }

    /**
     * Method that reads a certain number of bytes from an input stream and stores them in a new ByteBuffer. This method is used to demonstrate how to read a specific number of bytes from an input stream and store them in a new ByteBuffer.
     *
     * @param inputStream The input stream from which the bytes will be read
     * @param numBytesToRead The number of bytes to be read from the input stream
     * @return A new ByteBuffer containing the read bytes
     * @throws IOException If an error occurs while reading the bytes or creating the ByteBuffer
     */
    public ByteBuffer readAndStoreBytes(java.io.InputStream inputStream, int numBytesToRead) throws IOException {
        // Create a new ByteBuffer with the specified buffer size
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(numBytesToRead));

        // Read the specified number of bytes from the input stream and store them in the created ByteBuffer
        for (int i = 0; i < numBytesToRead; i++) {
            byte readByte = (byte) inputStream.read();
            byteBuffer.put(readByte);
        }

        // Flip the ByteBuffer to make it ready for reading
        byteBuffer.flip();

        return byteBuffer;
    }
}