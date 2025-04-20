package examples.java.awt;

import java.awt.SecondaryLoop;

/**
 * This example demonstrates how to exit a secondary loop.
 * In this example, we create an instance of the SecondaryLoop class.
 * Then, we invoke the `exit` method on our instance, which will terminate the secondary loop.
 * Finally, we include comments in the code that explain what each line is doing.
 */
public class SecondaryLoop_exit_Example {

    // Create an instance of the SecondaryLoop class
    private final SecondaryLoop secondaryLoop = new SecondaryLoop();

    /**
     * This method demonstrates how to exit a secondary loop.
     * In this example, we create an instance of the SecondaryLoop class.
     * Then, we invoke the `exit` method on our instance, which will terminate the secondary loop.
     */
    public void exitSecondaryLoop() {
        // Invoke the `exit` method on our instance
        secondaryLoop.exit();
    }
}