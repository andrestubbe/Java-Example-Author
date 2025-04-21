package examples.java.awt.im.spi;

import java.util.Locale;

/**
 * This example demonstrates how to implement a custom input method provider for the JDK's `InputMethod` class.
 * 
 * The example shows a minimal implementation of an `InputMethodProvider` that supports only one custom input method called "CustomIM".
 *
 * The main logic of this example is located in the `createInputMethods` method, which creates instances of the custom input method (named `CustomIM`) and registers them with the JDK's `InputMethodManager`.
 */
public class InputMethod_getLocale_Example {

    /**
     * This method creates instances of the custom input method (named `CustomIM`) and registers them with the JDK's `InputMethodManager`.
     *
     * @return an array of registered input methods
     */
    private static InputMethod[] createInputMethods() {
        // Create instance(s) of the custom input method(s).
        // In this example, we only have one custom input method called "CustomIM".
        CustomIM customIM = new CustomIM();

        // Register the created input methods with the JDK's InputMethodManager.
        return new InputMethod[]{customIM};
    }

    /**
     * This class represents a custom input method for the JDK's `InputMethod` class.
     * 
     * In this example, we only have one custom input method called "CustomIM".
     */
    static class CustomIM extends InputMethod {

        // Implement the necessary logic of the custom input method.
        // In this example, we only have one custom input method called "CustomIM", so there is no need to implement any additional logic beyond what's already provided by the JDK's `InputMethod` class.

    }
}