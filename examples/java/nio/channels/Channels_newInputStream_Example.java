package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Example of using the `newInputStream` method from the {@link Channels} class within a single Java file. This code demonstrates how to use the `Channels.newInputStream()` method to create an input stream from a readable byte channel. The example also shows how to read data from the input stream and convert it to a string using the `ByteBuffer` class.
 *
 * @author <NAME> (<EMAIL>)
 */
public class Channels_newInputStream_Example {

    /**
     * Main method of the example code. This method creates an instance of the {@link Channels_newInputStream_Example} class and calls its `run` method to execute the example code.
     *
     * @param args command line arguments (not used in this example))
     */
    public static void main(String[] args) {
        Channels_newInputStream_Example example = new Channels_newInputStream_Example();
        example.run();
    }

    /**
     * Override of the `run` method of the {@link Runnable} interface. This method is called by the `main` method to execute the example code.
     */
    @Override
    public void run() {
        try {
            // Create a new input stream from a readable byte channel using the `Channels.newInputStream()` method.
            ReadableByteChannel channel = Channels.open(getClass().getResourceAsStream("/test-data.txt")));
            InputStreams example = new InputStreams();

            // Read data from the input stream and convert it to a string using the `String` class constructor that takes an array of bytes as its parameter.
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024));
            while (channel.read(byteBuffer)) {
                // Clear the buffer before converting it to a string.
                byteBuffer.flip();

                // Convert the array of bytes to a string using the `String` class constructor that takes an array of bytes as its parameter.
                String line = String.valueOf(byteBuffer.array()));
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}