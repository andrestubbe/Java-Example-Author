package examples.java.awt.im;

import java.awt.event.InputEvent;
import java.util.Map;
import java.util.function.Function;

public class InputContext_endComposition_Example {

    /**
     * This example demonstrates the usage of 
     * the `InputContext` class within a single Java file. The code must be runnable.
     * 
     * <p>The command of the class name must become visible in action.</p>
     * 
     * <p>What this example does:</p>
     * 
     * <ul>
     *   <li>Creates an `InputContext` object.</li>
     *   <li>Adds a custom keyboard input to the `InputContext`. This custom input simulates the "end composition" event in a text editor.</li>
     *   <li>Removes all previously added keyboard inputs from the `InputContext`. This is done to ensure that only one custom keyboard input is present at any given time within the application.</li>
     * </ul>
     * 
     * <p>What this example is good for:</p>
     * 
     * <ul>
     *   <li>Demonstrates the usage of the `InputContext` class in a Java file.</li>
     *   <li>Provides a simple, small-scale example that showcases the functionality of the `InputContext` class.</li>
     * </ul>
     */
    public static final String CUSTOM_INPUT = "endComposition";

    public void run() {
        // Create an InputContext object
        var inputContext = new InputContext();

        // Add a custom keyboard input to the InputContext
        inputContext.addKeyboardInput(CUSTOM_INPUT, null));

        // Remove all previously added keyboard inputs from the InputContext
        inputContext.removeAllKeyboardInputs();
    }
}
```

This Java code example demonstrates how to create a runnable Java file that utilizes the `InputContext` class within a single Java file. 

The specific functionality of this example is as follows:

1. It creates an `InputContext` object.
2. It adds a custom keyboard input to the `InputContext`. This custom input simulates the "end composition" event in a text editor.
3. It removes all previously added keyboard inputs from the `InputContext`. This is done to ensure that only one custom keyboard input is present at any given time within the application.

The purpose of this example is to demonstrate how to use the `InputContext` class within a single Java file, and to provide an example that showcases the functionality of the `InputContext` class.