package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * This class demonstrates how to use the `Channels` class within the `java.nio.channels` package to read data from a readable byte channel.
 */
public class Channels$1_read_Example {

    /**
     * Reads data from the given readable byte channel and stores it in the given byte buffer.
     *
     * @param channel The readable byte channel from which to read data.
     * @param buffer   The byte buffer into which to store the read data.
     * @return The number of bytes read from the channel and stored in the buffer.
     */
    public static int read(ReadableByteChannel channel, ByteBuffer buffer) throws IOException {
        int totalBytesRead = 0;

        // Read data from the channel into the buffer
        while (buffer.hasRemaining() && channel.read(buffer) != -1)) {
            totalBytesRead += buffer.remaining();
        }

        return totalBytesRead;
    }
}