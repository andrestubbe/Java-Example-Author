package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventObject;
import java.awt.Scrollbar;

public class Scrollbar_getLineIncrement_Example {

    /**
     * This example demonstrates how to use the `getLineIncrement()` method of the `Scrollbar` class.
     * 
     * The `getLineIncrement()` method returns an integer value representing the number of lines by which the viewport is incremented each time the user clicks the scrollbar and moves the mouse in the upward direction.
     */

    public void exampleMethod() {
        // Create a Scrollbar object
        Scrollbar scrollbar = new Scrollbar();

        // Get the line increment value of the scrollbar
        int lineIncrement = scrollbar.getLineIncrement();

        // Print the line increment value to the console
        System.out.println("The line increment value of the scrollbar is: " + lineIncrement);
    }
}