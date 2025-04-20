package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;

/**
 * This example demonstrates how the `SequencedEvent` class can be used to track when an AWT event is processed for the first time, or when an event has been disposed of.
 */
public class SequencedEvent_isFirstOrDisposed_Example {

    // Create a JFrame and add it to the frame
    private final JFrame frame = new JFrame("SequencedEvent Example");

    /**
     * Constructs a new SequencedEvent_isFirstOrDisposed_Example object.
     */
    public SequencedEvent_isFirstOrDisposed_Example() {
        // Initialize the frame size and make it visible
        frame.setSize(600, 400);
        frame.setVisible(true);

        // Add a ComponentAdapter to the frame's component listener chain
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e));

                // Create a SequencedEvent object and add it to an EventQueue
                SequencedEvent event = new SequencedEvent();
                EventQueue.invokeLater(() -> {
                    event.setFirstOrDisposed(true);
                }));

                // Print the result of the SequencedEvent processing
                System.out.println("The SequencedEvent has been processed for the first time. The event's `isFirstOrDisposed()` method returned `true`. The AWT component that this EventQueue is listening to, has become visible and can receive user input.");
            }
        }));
    }
}