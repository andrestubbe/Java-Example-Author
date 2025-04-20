package examples.java.awt;

import java.awt.Scrollbar;

public class Scrollbar_getOrientation_Example {

    /**
     * This example demonstrates how to use the `getOrientation()` method of the `Scrollbar` class within a single Java file. 
     * 
     * The code creates an instance of the `Scrollbar` class and sets its value range and visible amount. It then calls the `getOrientation()` method on the scrollbar instance, which returns the orientation of the scrollbar as either horizontal (0) or vertical (1).
     */

    public static void main(String[] args) {

        // Create a new Scrollbar instance
        Scrollbar scrollbar = new Scrollbar();

        // Set the value range and visible amount for the scrollbar
        scrollbar.setValues(0, 100, 10);

        // Call the getOrientation() method on the scrollbar instance
        int orientation = scrollbar.getOrientation();

        // Print out the result of the getOrientation() method
        System.out.println("Scrollbar orientation: " + (orientation == 0 ? "Horizontal" : "Vertical")));
    }

}