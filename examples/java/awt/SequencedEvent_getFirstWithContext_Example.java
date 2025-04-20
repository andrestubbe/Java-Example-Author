package examples.java.awt;
import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SequencedEvent_getFirstWithContext_Example {

    /**
	 * This example demonstrates the usage of the `SequencedEvent` class 
	 * within a single Java file. The code is designed to be runnable and provides an example of how the `SequencedEvent` class can be used to process events in sequence with specific context.
	 */
    public static void main(String[] args) {
        // Create a ConcurrentLinkedQueue to store the events
        ConcurrentLinkedQueue<AWTEvent> eventQueue = new ConcurrentLinkedQueue<>();

        // Create an instance of the SequencedEvent class, passing in the event queue
        SequencedEvent sequencedEvent = new SequencedEvent(eventQueue));

        // Add some events to the event queue
        eventQueue.add(new Event1()));
        eventQueue.add(new Event2()));
        eventQueue.add(new Event3()));

        // Print the first event with context from the event queue
        AWTEvent firstEvent = eventQueue.peek();
        System.out.println("First event with context: " + firstEvent);

    }

}