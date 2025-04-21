package examples.sun.nio.ch;

import java.net.InetAddress;
import java.nio.channels.ServerSocketChannel;

public class ServerSocketChannelImpl_getLocalAddress_Example {

    /**
     * This example demonstrates the usage of the <code>getLocalAddress()</code> method in the <code>ServerSocketChannel</code> class. It shows how to obtain the local address of a server socket channel.
     * 
     * @since   1.4
     */

    public static void main(String[] args) throws Exception {

        // Obtain the ServerSocketChannel object
        ServerSocketChannel ssc = ServerSocketChannel.open();

        // Bind the server socket channel to a specific local address and port number
        InetAddress localAddr = InetAddress.getLoopbackAddress(); // Get the loopback address
        int portNum = 8080; // Set the port number
        ssc.bind(new InetSocketAddress(localAddr, portNum)));

        // Get the local address of the server socket channel
        InetAddress localAddrRetrieved = ssc.getLocalAddress();

        // Print the retrieved local address
        System.out.println("The local address of the server socket channel is: " + localAddrRetrieved);

    }

}