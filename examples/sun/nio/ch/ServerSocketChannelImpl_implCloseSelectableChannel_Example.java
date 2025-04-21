package examples.sun.nio.ch;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Example implementation of the ServerSocketChannelImpl class.
 * <p>
 * This implementation demonstrates how to create a server socket channel that is closeable and selectable. It also shows how to use an executor service to manage the server socket channel's accept events.
 */
public final class ServerSocketChannelImpl_implCloseSelectableChannel_Example {

    // Inline comments for relevant lines of code
    // ...

    /**
     * Creates and initializes a new instance of this class.
     */
    public ServerSocketChannelImpl_implCloseSelectableChannel_Example() throws IOException {
        // Initialize server socket channel
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(true);

        // Bind the server socket channel to a specific address and port
        InetSocketAddress addr = new InetSocketAddress("localhost", 8080));
        ssc.bind(addr, 0);

        // Initialize executor service for managing accept events
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Register the server socket channel to the executor service
        executor.execute(() -> {
            try {
                while (true) {
                    // Accept a new client connection on the server socket channel
                    SocketChannel clientChannel = ssc.accept();

                    // Handle the client connection here...

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
}