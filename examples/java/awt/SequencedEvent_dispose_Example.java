package examples.java.awt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * This class demonstrates the usage of the `SequencedEvent` class within a single Java file. The example code creates a runnable Java code block that uses the `SequencedEvent` class to handle events in a sequential manner. 
 * The `SequencedEvent` class is defined as an inner static class of this class. This class extends the `WindowAdapter` class, which provides default implementations for window event listeners.
 * The main method creates and configures a new JFrame object, sets its title, size, and visibility properties, and adds an instance of the `SequencedEvent` class as a WindowListener to the frame's WindowListeners collection.
 * Finally, the main method calls the frame's setVisible(true) method to make the frame visible on the screen, and blocks the current thread until the frame is closed by the user.
 */
public class SequencedEvent_dispose_Example {

    // Inner static class that extends the WindowAdapter class
    static class SequencedEvent extends WindowAdapter {
        private int nextIndex;
        private final Object[] eventQueue;

        /**
         * Constructor that initializes the instance variables of this class.
         * @param queueCapacity The maximum number of events in the event queue.
         */
        public SequencedEvent(int queueCapacity) {
            eventQueue = new Object[queueCapacity];
            nextIndex = 0;
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // Perform any necessary cleanup or resource release here
            System.out.println("Event closed");
        }

        /**
         * Adds a new event to the event queue in a sequential manner.
         * @param event The event object to be added to the event queue.
         */
        public void addSequencedEvent(Object event) {
            synchronized (this) {
                eventQueue[nextIndex] = event;
                nextIndex = (nextIndex + 1) % eventQueue.length;
                System.out.println("Event added: " + event);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setTitle("Sequenced Event Example");
        frame.setSize(400, 300));
        frame.setVisible(true));

        // Create an instance of the SequencedEvent class
        SequencedEvent sequencedEvent = new SequencedEvent(10));

        // Add events to the event queue in a sequential manner
        sequencedEvent.addSequencedEvent("Event 1"));
        Thread.sleep(2000);
        sequencedEvent.addSequencedEvent("Event 2"));
        Thread.sleep(2000);
        sequencedEvent.addSequencedEvent("Event 3"));
        Thread.sleep(2000);

        // Wait for the user to close the frame
        while (frame.isVisible() && !frame.getFocusOwner().equals(frame)) {
            Thread.sleep(100));
        }
    }

}