package examples.java.awt;

import java.awt.AWTMismatchException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * <p>Example of using the Scrollbar class within a single Java file.</p>
 *
 * <p>This code demonstrates the usage of the serialization features in Java. It shows how to create an object of type Scrollbar, deserialize it from a byte stream, and then serialize it back into a byte stream.</p>
 */
public class Scrollbar_readObject_Example {

    /**
     * <p>Method that creates a Scrollbar object, deserializes it from a byte stream, and then serializes it back into a byte stream.</p>
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create an instance of Scrollbar
        Scrollbar scrollbar = new Scrollbar();

        try {

            // Serialize the Scrollbar object to a byte stream
            ObjectOutputStream out = new ObjectOutputStream(System.out);
            out.writeObject(scrollbar);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}