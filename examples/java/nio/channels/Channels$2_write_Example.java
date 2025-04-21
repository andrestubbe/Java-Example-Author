package examples.java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Channels_2_write_Example {

    /**
     * This example demonstrates how to write a byte buffer to a channel using NIO channels API. The example uses JDK17 and Java SE 16.
     * <p>
     * It creates a server socket channel, binds it to a specific IP address and port, and accepts incoming connection requests. Once a client connects, the server creates a readable byte channel from the accepted client socket, initializes a byte buffer with test data, and then writes the contents of the byte buffer to the readable byte channel using the `write()` method. Finally, it shuts down the readable byte channel and the server socket channel.
     */

    public static void main(String[] args) throws IOException {
        // Create a server socket channel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        // Bind the server socket channel to a specific IP address and port
        InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8080));
        serverSocketChannel.socket().bind(socketAddress);

        // Accept incoming connection requests
        SocketChannel clientSocketChannel = serverSocketChannel.accept();

        // Create a readable byte channel from the accepted client socket
        ReadableByteChannel readableByteChannel = clientSocketChannel.getChannel();

        // Initialize a byte buffer with test data
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024));
        byte[] testData = "Test Data".getBytes();
        for (int i = 0; i < 1024; i++) {
            byteBuffer.put(i, testData[i % testData.length]));
        }

        // Create an executor service for handling the byte buffer write operation asynchronously
        ExecutorService executorService = Executors.newFixedThreadPool(1));

        // Write the contents of the byte buffer to the readable byte channel using a separate thread
        executorService.submit(() -> {
            try {
                // Position the byte buffer at the beginning
                byteBuffer.position(0));

                // Write the contents of the byte buffer to the readable byte channel
                while (readableByteChannel.read(byteBuffer) != -1)) {
                    // Process the data in the byte buffer as needed
                    System.out.println("Received Data: " + new String(byteBuffer.array(), 0, byteBuffer.position()))));
                    // Clear the contents of the byte buffer
                    byteBuffer.clear();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));

        // Shutdown the readable byte channel and the server socket channel
        clientSocketChannel.close();
        serverSocketChannel.close();
    }

}