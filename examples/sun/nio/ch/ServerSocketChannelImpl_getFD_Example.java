package examples.sun.nio.ch;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Example of how to get the File Descriptor (FD)
 * from a ServerSocketChannel using JDK17.
 *
 * This example demonstrates how to create an ExecutorService with fixed thread pool size, submit tasks to handle incoming client connections, and finally shut down the executor service.
 */
public class ServerSocketChannelImpl_getFD_Example {

    // Define the number of threads in the fixed thread pool
    private static final int NUM_THREADS = 5;

    public void run() throws IOException {

        // Create a ServerSocketChannel and configure it as needed
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(true); // Set blocking mode to true
        serverSocketChannel.bind(null, 0); // Bind the channel to any available port

        // Create an ExecutorService with a fixed thread pool of size NUM_THREADS
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS));

        while (true) {

            // Accept a new client connection using the ServerSocketChannel's accept() method
            ServerSocketChannel clientConnection = serverSocketChannel.accept();

            // Submit a new task to handle this client connection using the ExecutorService's submit() method
            executorService.submit(() -> {
                try {
                    // Handle the client connection here
                    System.out.println("New client connected: " + clientConnection.getInetSocketAddress()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        }

        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}