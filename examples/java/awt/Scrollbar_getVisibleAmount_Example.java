package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Scrollbar;

public class Scrollbar_getVisibleAmount_Example {

    /**
     * This example demonstrates how to use the `getVisibleAmount()` method of the Scrollbar class in Java. 
     * The getVisibleAmount() method returns an integer representing the number of items currently visible in a scroll pane or viewport managed by this scrollbar.
     * 
     * In this example, we create a new Scrollbar object and set its values using the setValues() method. 
     * We then call the getVisibleAmount() method on our Scrollbar object to retrieve the current number of visible items in the associated scroll pane.
     * 
     * Finally, we print out the result of our getVisibleAmount() call to the console for verification purposes.
     */

    public static void main(String[] args) {
        
        // Create a new Scrollbar object
        Scrollbar scrollbar = new Scrollbar();
        
        // Set the values of the Scrollbar object
        scrollbar.setValues(0, 100, 0, 50));
        
        // Get the current number of visible items in the associated scroll pane
        int visibleAmount = scrollbar.getVisibleAmount();
        
        // Print out the result for verification purposes
        System.out.println("Current number of visible items: " + visibleAmount));

    }

}