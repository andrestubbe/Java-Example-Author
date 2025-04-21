package examples.java.awt.im;

import java.awt.AWTEvent;
import java.awt.EventObject;
import javax.swing.JFrame;

/**
 * Example of a Runnable Java code block that uses the InputContext class within the single Java file. The example is runnable and demonstrates how to use the `InputContext` class in a multi-threaded environment.
 */
public class InputContext_removeNotify_Example implements Runnable {

    private final JFrame frame;

    /**
     * Constructor that accepts a JFrame object as a parameter. This constructor initializes the JFrame object and stores it in an instance variable for later use.
     * @param frame The JFrame object to be used in this example.
     */
    public InputContext_removeNotify_Example(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        // Initialize the InputContext class and set it as the input context for this example.
        InputContext inputContext = new InputContext();
        inputContext.setInputContext(this);

        // Run a multi-threaded environment where each thread removes its own notificaitons from the JFrame object using the removeNotify() method inherited from the Component class.
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                try {
                    // Wait for 1 second before removing a notification from the JFrame object.
                    Thread.sleep(1000));
                    synchronized (frame) {
                        frame.removeNotify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}