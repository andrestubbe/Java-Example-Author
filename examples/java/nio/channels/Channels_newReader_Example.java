package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Channels_newReader_Example {

    /**
     * This example demonstrates how to use the `Channels` class within the NIO package in Java. The code is specifically designed to create a new reader for the given channel using the `Channels.newReader()` method.
     */

    public static void main(String[] args) throws IOException {
        // Create an instance of ReadableByteChannel
        ReadableByteChannel channel = Channels.openChannel();

        // Create an instance of ByteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // Use the newReader() method to create a new reader for the given channel
        Channels.newReader(channel, buffer));
    }

}