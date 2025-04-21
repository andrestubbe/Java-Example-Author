package examples.java.awt.im.spi;

import java.util.Locale;
import java.util.Objects;

/**
 * Example implementation of InputMethod class within a single Java file.
 * The code demonstrates how to set an InputMethodContext object using the InputMethod class.
 * This example is designed to showcase the usage of the InputMethod class to set an InputMethodContext object, which can be used for input method API integration and customization.
 */
public class InputMethod_setInputMethodContext_Example {

    /**
     * Method to set the InputMethodContext object using the InputMethod class.
     * This implementation demonstrates how to initialize an instance of the InputMethod class,
     * Then use its getInstance() method to retrieve the singleton instance of the InputMethod class.
     * Finally, invoke the setInputMethodContext() method on the retrieved InputMethod instance with a custom implementation of the InputMethodContext interface as a parameter.
     * This method can be used for setting an input method context object that can be used for providing customized input methods and handling user input events related to input methods.
     * @param inputMethodContext Custom implementation of the InputMethodContext interface.
     */
    public static void setInputMethodContext(InputMethodContext inputMethodContext) {
        // Initialize an instance of the InputMethod class
        final InputMethod inputMethod = Objects.requireNonNull(InputMethod.getInstance()), "Failed to get the singleton instance of the InputMethod class.");

        // Invoke the setInputMethodContext() method on the retrieved InputMethod instance with a custom implementation of the InputMethodContext interface as a parameter.
        inputMethod.setInputMethodContext(Objects.requireNonNull(inputMethodContext), "Failed to set the input method context object."));
    }

    // Private constructor to prevent direct instantiation of this class.
    private InputMethod_setInputMethodContext_Example() { }

}