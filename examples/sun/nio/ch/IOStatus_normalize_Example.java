package examples.sun.nio.ch;

import java.io.IOException;

// IOStatus is a class within the sun.nio.ch package. It provides methods that can be used to check if an InputStream or OutputStream has reached its end.
public final class IOStatus {

    private IOStatus() {}

    /**
     * Returns true if the operation completed successfully;
     * otherwise, returns false.
     */
    public static boolean isNormal() {
        // Your implementation here
        return true;
    }

    /**
     * Throws an IOException with the given message if the operation failed to complete;
     * otherwise, does nothing.
     *
     * @param message The exception message
     */
    public static void throwException(String message) throws IOException {
        // Your implementation here
    }
}