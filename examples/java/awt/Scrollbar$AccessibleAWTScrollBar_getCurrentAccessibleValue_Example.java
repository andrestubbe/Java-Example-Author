package examples.java.awt;

import java.awt.event.AccessibleEvent;
import javax.accessibility.Accessible;
import javax.swing.Scrollbar;

/**
 * Example of a runnable Java code example using the `Scrollbar$AccessibleAWTScrollBar` class within a single Java file.
 * The code must be runnable and ensure the visibility of the class name in action.
 */
public class Scrollbar_AccessibleAWTScrollBar_Example implements Runnable {

    /**
     * The main method which triggers the execution of this example.
     * It initializes the necessary components, sets up the layout manager, adds a listener for scrollbar events, and finally starts the scrolling animation by invoking the `scrollRectToVisible` method on the scrollbar component.
     */
    public void run() {
        // Initialize the necessary components
        Scrollbar scrollbar = new Scrollbar();

        // Set up the layout manager
        scrollbar.setLayout(null);

        // Add a listener for scrollbar events
        scrollbar.addChangeListener(e -> {
            int maximum = ((javax.swing.JScrollBar) e.getSource())).getMaximumValue();
            int value = ((javax.swing.JScrollBar) e.getSource())).getValue();

            // Update the scrollbar component with the new values
            scrollbar.setValues(minimum, maximum, value));
        }));

        // Start the scrolling animation by invoking the `scrollRectToVisible` method on the scrollbar component
        scrollbar.scrollRectToVisible(new Rectangle()));
    }
}