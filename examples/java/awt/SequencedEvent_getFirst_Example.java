package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.Event;
import java.awt.SequencedEvent;

/**
 * This example demonstrates how to use the `SequencedEvent` class in Java's AWT package. The goal of this example is to show how the `SequencedEvent` class allows for the creation of an ordered sequence of events. 
 *
 * The code provided below creates a runnable Java code example using the `SequencedEvent` class within a single Java file. The code must be runnable and ensures that the command of the class name becomes visible in action.
 */
public class SequencedEvent_getFirst_Example {

    /**
     * This method creates an ordered sequence of events using the `SequencedEvent` class.
     * 
     * @return A string representation of the ordered sequence of events created by this method.
     */
    public String createOrderedSequenceOfEvents() {
        // Create a new SequencedEvent object with a custom event class as its event type.
        SequencedEvent<CustomEvent> sequencedEvent = new SequencedEvent<>();

        // Add two custom events to the sequenced event object.
        sequencedEvent.addEvent(new CustomEvent("First Event")));
        sequencedEvent.addEvent(new CustomEvent("Second Event")));

        // Return a string representation of the ordered sequence of events created by this method.
        return "Ordered Sequence of Events:\n" + sequencedEvent.toString();
    }
}