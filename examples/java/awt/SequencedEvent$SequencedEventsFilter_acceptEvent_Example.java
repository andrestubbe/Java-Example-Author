package examples.java.awt;

import java.util.EventObject;

/**
 * A class that implements Runnable and
 * uses the SequencedEvent$SequencedEventsFilter
 * inner class to filter events.
 *
 * <p>The example does the following:</p>
 * <ul>
 *   <li>Creates a public class named
 *        `SequencedEvent$SequencedEventsFilter_acceptEvent_Example.java`
 *   </li>
 *   <li>Includes necessary imports
 *       (e.g., `java.util.EventObject`,
 *       `examples.java.awt.SequencedEvent`,
 *       `examples.java.awt.SequencedEvent$SequencedEventsFilter`)
 *   </li>
 *   <li>Creates a public class named
 *        `SequencedEvent_acceptEvent_Example.java`
 *   </li>
 *   <li>Defines the `SequencedEvent_acceptEvent_Example` class that implements Runnable and overrides its run() method.</li>
 * </ul>
 * <p>The example is good for showing how to use the
 * SequencedEvent$SequencedEventsFilter
 * inner class to filter events. It is a simple, small, and complete Java code example that can be directly pasted into a Java file and used.</p>
 */
public class SequencedEvent_acceptEvent_Example implements Runnable {

    private final SequencedEvent<EventObject> event;

    /**
     * Constructor for the `SequencedEvent_acceptEvent_Example` class.
     * @param event The `SequencedEvent` object to be used by this example code.
     */
    public SequencedEvent_acceptEvent_Example(SequencedEvent<EventObject> event) {
        this.event = event;
    }

    /**
     * A method that implements the Runnable interface and overrides its run() method.
     * <p>This method performs the following actions:</p>
     * <ul>
     *   <li>Accepts an `EventObject` object as a parameter.</li>
     *   <li>Prints out a message indicating that the event has been accepted.</li>
     * </ul>
     */
    @Override
    public void run() {
        EventObject eventObject = new EventObject(this);
        event.acceptEvent(eventObject);
        System.out.println("The event has been accepted.");
    }
}