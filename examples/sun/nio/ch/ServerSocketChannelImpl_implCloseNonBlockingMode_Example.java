package examples.sun.nio.ch;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * Example implementation of a runnable Java code example using the `ServerSocketChannelImpl` class within a single Java file. The code must be runnable and ensures that the command of the class name becomes visible in action.
 */
public class ServerSocketChannelImpl_implCloseNonBlockingMode_Example {

    // Constants
    private static final InetSocketAddress ADDRESS = new InetSocketAddress("localhost", 8080));

    // Methods
    public void run() throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.configureBlocking(false);
        channel.bind(ADDRESS);
        while (true) {
            try {
                Thread.sleep(100));
            } catch (InterruptedException e) {
                // Handle exception
            }
            System.out.println("Server socket channel is listening on: " + ADDRESS));
        }
    }
}