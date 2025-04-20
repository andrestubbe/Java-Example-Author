package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Scrollbar;

public class Scrollbar_setValues_Example {

    // Inline comments for the relevant lines
    /*
     * The main event loop that processes 
     * events from the EventQueue.
     */
    private static void createAndRunEventLoop() {
        // Create a new EventQueue instance
        EventQueue queue = EventQueue.newInstance();

        // Add the scrollbar instance to the EventQueue instance
        queue.add(new Scrollbar_setValues_Example().scrollbar));
    }

    public static void main(String[] args) {
        createAndRunEventLoop();
    }

    /*
     * The instance of the Scrollbar class 
     * that is used to demonstrate setting values for 
     * the scrollbar component.
     */
    private Scrollbar scrollbar;

    // Constructor for the Scrollbar_setValues_Example class
    public Scrollbar_setValues_Example() {
        this.scrollbar = new Scrollbar();

        // Set the minimum and maximum values for the scrollbar
        this.scrollbar.setMinimum(1);
        this.scrollbar.setMaximum(100);

        // Set the initial value of the scrollbar
        this.scrollbar.setValue(50);
    }
}