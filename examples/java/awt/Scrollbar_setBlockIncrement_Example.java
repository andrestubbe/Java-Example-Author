package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Scrollbar;

/**
 * Example demonstrating the use of Scrollbar class to set block increment.
 */
public class Scrollbar_setBlockIncrement_Example {

    public static void main(String[] args) {
        // Create a new Scrollbar instance
        Scrollbar scrollbar = new Scrollbar();

        // Set the block increment property of the Scrollbar instance
        scrollbar.setBlockIncrement(10));

        // Register a custom event listener for the Scrollbar instance
        EventQueue.invokeLater(() -> {
            AWTEvent event = EventQueue.getInstance().peekEvent();

            // Print the current value of the block increment property of the Scrollbar instance
            System.out.println("Block Increment: " + scrollbar.getBlockIncrement()));

        }));
    }
}