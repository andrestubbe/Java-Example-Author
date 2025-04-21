package examples.sun.nio.ch;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * An example implementation of a runnable Java code 
 * example using the `ServerSocketChannelImpl` 
 * class within a single Java file. 
 * The code must be runnable. Ensure the code 
 * starts with `package examples.sun.nio.ch` 
 * and includes a public class named 
 * `ServerSocketChannelImpl_implConfigureBlocking_Example.java`. 
 * Include necessary imports. Create necessary inline comments for the class relevant lines. Output ONLY the raw Java code block. Write the smallest version possible.
 */
public class ServerSocketChannelImpl_implConfigureBlocking_Example {

    // Inline comment explaining the purpose of this method
    /**
     * Configures a given ServerSocketChannel 
     * instance to be blocking or non-blocking.
     *
     * @param serverSocketChannel The 
     *        ServerSocketChannel instance that needs to be configured.
     * @param isBlocking Set to true if the channel should be in blocking mode, false otherwise.
     * @return The ServerSocketChannel instance after it has been configured as per the provided parameters.
     * @throws IOException If an I/O error occurs during the configuration of the given ServerSocketChannel instance.
     */
    public static ServerSocketChannel configureBlocking(ServerSocketChannel serverSocketChannel, boolean isBlocking) throws IOException {

        // Check if the provided ServerSocketChannel instance is already configured as per the provided parameters
        if (serverSocketChannel.isBlocking() == isBlocking)) {

            return serverSocketChannel;
        }

        // Configure the given ServerSocketChannel instance 
        // to be blocking or non-blocking based on 
        // the value of 'isBlocking' parameter
        if (isBlocking) {

            serverSocketChannel.configureBlocking(true);
        } else {

            serverSocketChannel.configureBlocking(false);
        }

        return serverSocketChannel;
    }
}