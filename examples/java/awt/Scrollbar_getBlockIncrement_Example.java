package examples.java.awt;

import java.awt.Scrollbar;

/**
 * This class demonstrates the usage of the `getBlockIncrement` method from the `Scrollbar` class in a runnable Java code example.
 */
public class Scrollbar_getBlockIncrement_Example {

    // Method to get block increment value for a Scrollbar instance
    private int getBlockIncrement(Scrollbar scrollbar) {
        return scrollbar.getBlockIncrement();
    }

    public static void main(String[] args) {
        // Create a Scrollbar instance
        Scrollbar scrollbar = new Scrollbar();

        // Set the value of the Scrollbar
        scrollbar.setValue(50);

        // Get and print the block increment value for the Scrollbar
        System.out.println("Block Increment Value: " + getBlockIncrement(scrollbar)));
    }
}