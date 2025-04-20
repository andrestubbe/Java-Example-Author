package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventObject;
import javax.swing.JScrollBar;

/**
 * This example demonstrates how to create a custom Scrollbar using the AWT library in Java.
 * 
 * <p>The main components of this example are:</p>
 * <ul>
 *   <li>{@link JScrollBar} - A custom scrollbar component.</li>
 * </ul>
 */
public class Scrollbar_paramString_Example {

    /**
     * This method is called when the scrollbar is clicked. It prints a message to the console indicating that the scrollbar has been clicked.
     *
     * @param event The event object representing the scrollbar click event.
     */
    public void scrollbarClicked(AWTEvent event) {
        EventObject evt = event.getTarget();

        if (evt instanceof JScrollBar)) {
            System.out.println("Scrollbar clicked.");
        }
    }
}