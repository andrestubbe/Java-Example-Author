package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

/**
 * A simple example that demonstrates how to use the `Channels` class in Java's NIO package to create a writable byte channel and write data to it using a `ByteBuffer`.
 * <p>
 * This code creates an anonymous `WritableByteChannel` implementation by extending the `Object` class. It then uses the `Channels.newChannel()` method to wrap this custom channel implementation in a `SeekableByteChannel` object. Finally, it demonstrates how to write data to this channel using a `ByteBuffer`.
 * <p>
 * This example provides a basic understanding of how to use the `Channels` class and related classes within the NIO package to create writable byte channels and write data to them.
 */
public class Channels_newWriter_Example {

    /**
     * A custom implementation of a writable byte channel that wraps an arbitrary `ByteBuffer`.
     */
    private static class CustomWritableByteChannel implements WritableByteChannel {

        @Override
        public int write(ByteBuffer buf) throws IOException {
            // Wrap the ByteBuffer in a Direct Buffer (ByteBuffer.allocateDirect()) to ensure that it is allocated on the native heap for improved performance.
            final ByteBuffer wrappedBuf = ByteBuffer.allocateDirect().wrap(buf);

            // Perform the write operation using the wrapped buffer.
            int bytesWritten = wrappedBuf.remaining();

            return bytesWritten;
        }

        @Override
        public boolean isOpen() {
            throw new UnsupportedOperationException("This method should not be invoked on a CustomWritableByteChannel implementation.");
        }

        @Override
        public void close() throws IOException {
            throw new UnsupportedOperationException("This method should not be invoked on a CustomWritableByteChannel implementation.");
        }

    }

    /**
     * A test method that demonstrates how to use the `Channels` class and related classes within the NIO package to create writable byte channels and write data to them.
     */
    public static void main(String[] args) throws IOException {

        // Create a custom implementation of a writable byte channel.
        final CustomWritableByteChannel channel = new CustomWritableByteChannel();

        // Wrap the channel in a `SeekableByteChannel` object using the `Channels.newChannel()` method.
        final SeekableByteChannel seekableChannel = Channels.newChannel(channel));

        // Create a `ByteBuffer` that will be used to write data to the channel.
        final ByteBuffer buf = ByteBuffer.allocateDirect();

        // Write some sample data to the channel using the wrapped buffer.
        buf.clear();
        buf.put("Hello, NIO Channels!".getBytes());
        buf.flip();

        int bytesWritten = seekableChannel.write(buf);

        System.out.println("Wrote " + bytesWritten + " bytes to the channel.");

    }

}