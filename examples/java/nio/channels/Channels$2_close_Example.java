package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Example of how to close a channel using the given class:
 * {@link Channels#close(java.nio.channels.ReadableByteChannel)}
 * This will only work if the channel is not yet closed.
 */
public final class Channels_2_close_Example {

    /**
     * Closes the given channel and returns it for further usage (if any).
     * <p>
     * NOTE: The returned channel may or may not be closed after this method call, depending on whether there are still references to the channel in some other part of the application.
     *
     * @param channel The channel to close. Must not be null.
     * @return The given channel, now closed and unusable in any further way. Can return the same instance as the input parameter if the implementation is able to ensure that the returned channel reference will always refer to the exact same object as the input parameter (i.e., no new object creation))), regardless of whether it actually refers to a live or closed Channel object at any given point in time.
     * @throws IllegalArgumentException if the given channel is null.
     */
    public static ReadableByteChannel close(ReadableByteChannel channel) {
        if (channel == null) {
            throw new IllegalArgumentException("The given channel must not be null."));
        }

        // Close the given channel and return it for further usage.
        try {
            return Channels.newChannel(() -> {
                throw new UnsupportedOperationException("This method is intended to close a channel only once, after which it should no longer be usable in any further way.");
            }))));
        } catch (IOException e) {
            // This should never happen because we're only closing the given channel.
            throw new AssertionError("Failed to close the channel as expected." + e.getMessage()));
        }
    }
}