package examples.java.awt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple example of a runnable Java code block using the `SequencedEvent` class. This code demonstrates how to create an event listener and dispatch an event.
 */
public class SequencedEvent_dispatch_Example {

    // Define the action event type
    private static final String ACTION = "action";

    // Create a lambda expression to handle the action event
    private ActionListener actionListener = e -> {
        System.out.println("Action event received: " + e.getActionCommand());
    };

    public static void main(String[] args) {
        // Create an instance of SequencedEvent with a fixed delay of 2000 milliseconds
        SequencedEvent sequencedEvent = new SequencedEvent(actionListener, 2000));

        // Start the event dispatch thread
        sequencedEvent.start();
    }
}