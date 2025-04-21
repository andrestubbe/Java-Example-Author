package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public class Channels_newOutputStream_Example {

    /**
     * Example of using the `Channels` class's
     * `newOutputStream()` method to create a
     * writable byte channel and write data to it.
     */

    public static void main(String[] args) throws IOException {

        // Create a ByteBuffer with initial position at 0 and limit set to 1024 bytes.
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        // Get the writable byte channel from the Channels class using the `newOutputStream()` method.
        WritableByteChannel writableByteChannel = Channels.newOutputStream(() -> {
            try {
                return "Hello, World!";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));

        // Write the string "Hello, World!" to the output stream using the `write(ByteBuffer)` method of the WritableByteChannel interface.
        writableByteChannel.write(byteBuffer);

        System.out.println("The output stream has been successfully written with the string 'Hello, World!'.");

    }

}