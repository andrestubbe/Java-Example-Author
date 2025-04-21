package examples.sun.nio.ch;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * Example of ServerSocketChannelImpl class.
 * This example demonstrates how to accept a client connection using the ServerSocketChannelImpl class.
 */
public final class ServerSocketChannelImpl_implAccept_Example {

    /**
     * Main method that starts a server and accepts a client connection.
     * @param args command line arguments (not used in this example)
     * @throws IOException if an I/O error occurs while setting up the server or accepting client connections
     */
    public static void main(String[] args) throws IOException {

        // Get local host address and port number
        InetSocketAddress address = (InetSocketAddress) ServerSocketChannel.open().socket().getLocalSocketAddress();
        int portNumber = address.getPort();

        System.out.println("Server started on port " + portNumber);

        // Accept a client connection and print the remote address
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("localhost", 0))); // Bind to any available port on localhost
        System.out.println("Waiting for a client connection..."));
        SocketChannel socketChannel = serverSocketChannel.accept(); // Accept a client connection
        InetSocketAddress remoteAddress = (InetSocketAddress) socketChannel.getRemoteAddress();
        System.out.println("Client connected from " + remoteAddress.getHostString() + ":" + remoteAddress.getPort()));

        // Close the socket channel
        socketChannel.close();

    }

}