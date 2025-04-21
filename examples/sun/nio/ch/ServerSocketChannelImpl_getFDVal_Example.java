package examples.sun.nio.ch;

import java.io.IOException;
import java.net.ServerSocket;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Example of using ServerSocketChannel to create a server socket and use it with an ExecutorService for concurrent handling of incoming connections.
 */
public class ServerSocketChannelImpl {

    private final ServerSocket serverSocket;
    private final ExecutorService executorService;

    public ServerSocketChannelImpl(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
        this.executorService = Executors.newCachedThreadPool();
    }

    public void startAcceptingConnections() {
        while (true) {
            try {
                ServerSocketChannel channel = ServerSocketChannel.open();
                channel.bindAddress(serverSocket.getInetAddress(), serverSocket.getPort()));
                executorService.submit(() -> handleConnection(channel))));
            } catch (IOException e) {
                System.err.println("Error accepting incoming connections: " + e.getMessage()));
                e.printStackTrace();
            }
        }
    }

    private void handleConnection(ServerSocketChannel channel) {
        try {
            // Your code here to handle the incoming connection
        } catch (IOException e) {
            System.err.println("Error handling incoming connection: " + e.getMessage()));
            e.printStackTrace();
        } finally {
            closeChannel(channel));
        }
    }

    private void closeChannel(ServerSocketChannel channel) {
        try {
            channel.close();
        } catch (IOException e) {
            System.err.println("Error closing ServerSocketChannel: " + e.getMessage()));
            e.printStackTrace();
        }
    }

    public void stopAcceptingConnections() {
        executorService.shutdown();
    }
}