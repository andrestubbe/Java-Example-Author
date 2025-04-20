package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.SequencedEvent;
import java.util.concurrent.atomic.AtomicBoolean;

public class SequencedEvent_isOwnerAppContextDisposed_Example {

    /**
     * This example demonstrates the usage of 
     * <code>SequencedEvent</code>, which is a 
     * wrapper class for an AWT event, with 
     * specific sequencing criteria. This example 
     * shows how to use <code>SequencedEvent</code> in 
     * a multi-threaded environment, where the event 
     * can be lost if not properly sequenced and managed.
     */

    public static void main(String[] args) {
        
        // Create an instance of SequencedEvent with specific parameters
        SequencedEvent sequencedEvent = new SequencedEvent(AWTEvent.MOUSE_EVENT));
        
        // Set the target component for this event
        sequencedEvent.setTargetComponent(new Component() {}));
        
        // Create a thread to run this event in a multi-threaded environment
        Thread eventThread = new Thread(() -> {

            try {

                // Wait until the app context is disposed
                AtomicBoolean isOwnerAppContextDisposed = new AtomicBoolean(false));

                while (!isOwnerAppContextDisposed.get()) {
                    // Perform necessary actions for this specific event
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }));

        // Start the thread to run this event in a multi-threaded environment
        eventThread.start();

    }

}