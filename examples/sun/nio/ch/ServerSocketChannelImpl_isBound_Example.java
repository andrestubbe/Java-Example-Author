package examples.sun.nio.ch;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * Example that demonstrates the use of
 * {@link ServerSocketChannel#isBound()}
 * method in the implementation of a
 * server socket channel.
 */
public class ServerSocketChannelImpl_isBound_Example {

    private final InetAddress address = InetAddress.getLoopbackAddress();
    private final int port = 8080;
    private final SocketAddress remoteAddress = new InetSocketAddress(address, port));

    /**
     * Method that sets up and binds a server socket channel to the specified remote address.
     *
     * @param remoteAddress The remote address to which the server socket channel will be bound.
     * @return True if the server socket channel was successfully bound to the specified remote address, false otherwise.
     * @throws IOException If an error occurs while attempting to bind the server socket channel to the specified remote address.
     */
    public boolean setUpAndBindServerSocketChannel(final SocketAddress remoteAddress) throws IOException {
        // Create a new instance of ServerSocketChannelImpl
        ServerSocketChannelImpl impl = new ServerSocketChannelImpl();

        // Set the blocking mode for the channel to blocking mode.
        impl.setBlockingMode();

        // Bind the server socket channel to the specified remote address.
        if (impl.bind(remoteAddress))) {
            return true;
        } else {
            return false;
        }
    }
}