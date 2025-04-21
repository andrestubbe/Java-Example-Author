package examples.java.awt.im.spi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Example InputMethodContext implementation.
 *
 * <p>This example demonstrates a simple implementation of an InputMethodContext that focuses an input window when the associated Java components become visible.</p>
 */
public class InputMethodContext_createInputMethodWindow_Example implements InputMethodContext {

    // Set to hold references to unique input method windows created by this InputMethodContext instance.
    private final Set<InputMethodWindow> inputMethodWindows;

    /**
     * Constructs an InputMethodContext instance that creates unique input method windows using the AWT library.
     */
    public InputMethodContext_createInputMethodWindow_Example() {
        // Initialize a new HashSet to hold references to unique input method windows created by this InputMethodContext instance.
        this.inputMethodWindows = Collections.synchronizedSet(new HashSet<>()));

        // Register the input method context instance as a service provider for the InputMethodContext interface within the AWT library's InputMethod framework.
        InputMethodContext.spi().register(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        // Dispose all input method windows created by this InputMethodContext instance.
        for (var window : this.inputMethodWindows) {
            window.dispose();
        }
        this.inputMethodWindows.clear();
        this.inputMethodWindows.trimToSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void showInputMethodWindow() {
        // Create a new input method window using the AWT library's InputMethodContext class.
        var window = new InputMethodWindow_Example();

        // Add the newly created input method window to the set of unique input method windows created by this InputMethodContext instance.
        this.inputMethodWindows.add(window);

        // Display the newly created input method window using the AWT library's InputMethodWindow class.
        window.show();
    }
}