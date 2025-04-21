package examples.java.awt.im.spi;

import java.util.Locale;

/**
 * An example of using the `InputMethod` class within a single Java file. This code is designed to demonstrate the usage and functionality of the `InputMethod` class, specifically in regards to checking if composition is enabled.
 */
public class InputMethod_isCompositionEnabled_Example {

    // Declare necessary imports
    import java.awt.im.InputMethod;
    import java.util.Locale;

    /**
     * Main method that demonstrates the usage of the `InputMethod` class within a Java file, specifically in regards to checking if composition is enabled.
     */
    public static void main(String[] args) {
        
        // Create an instance of the InputMethod class
        InputMethod inputMethod = InputMethod.getDefaultIM();

        // Check if composition is enabled
        boolean isCompositionEnabled = inputMethod.isCompositionEnabled(Locale.getDefault()));

        // Print out the result
        System.out.println("Is Composition Enabled? " + isCompositionEnabled);
    }
}