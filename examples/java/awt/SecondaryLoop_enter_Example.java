package examples.java.awt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondaryLoop_enter_Example {

    private void enterSecondaryLoop() {
        Thread thread = new Thread(() -> {
            // Perform tasks within the secondary loop
        }));
        thread.setDaemon(true)); // Set the thread as a daemon, allowing the JVM to exit even if the secondary loop is still running
        thread.start();
    }

    /**
     * This class demonstrates how to use the SecondaryLoop 
     * class within the Java AWT package. The example
     * shows how to perform tasks within a secondary loop.
     */

    public static void main(String[] args) {
        SecondaryLoop_enter_Example example = new SecondaryLoop_enter_Example();
        example.enterSecondaryLoop(); // Start the secondary loop
    }

}