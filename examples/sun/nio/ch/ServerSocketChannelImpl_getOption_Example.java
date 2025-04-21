package examples.sun.nio.ch;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Example implementation of a runnable Java code example using the `ServerSocketChannelImpl` class. This code creates a simple server that accepts incoming connections and prints a message to the console when a client connects.
 */
public class ServerSocketChannelImpl_getOption_Example {

    private static final int PORT = 8080;
    private static final int MAX_CONNECTIONS = 5;
    private static ExecutorService executorService;

    public static void main(String[] args) throws IOException, InterruptedException {

        // Create a server socket channel and bind it to the specified port.
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress("localhost", PORT)));

        System.out.println("Server started on port " + PORT);

        // Create an executor service with a fixed thread pool of size 5.
        executorService = Executors.newFixedThreadPool(MAX_CONNECTIONS));

        // Listen for incoming client connections and submit them to the executor service for processing.
        while (true) {
            ServerSocketChannel clientSocketChannel = serverSocketChannel.accept();
            executorService.submit(() -> handleClientConnection(clientSocketChannel))));
        }
    }

    /**
     * Handles a single client connection by printing a message to the console and closing the client socket channel.
     * @param clientSocketChannel The client socket channel that has connected to the server.
     */
    private static void handleClientConnection(ServerSocketChannel clientSocketChannel) {
        try {
            // Print a message to the console indicating that a new client connection has been accepted.
            System.out.println("New client connection accepted.");

            // Close the client socket channel after processing.
            clientSocketChannel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}