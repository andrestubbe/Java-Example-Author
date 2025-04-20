package examples.java.awt;

import java.awt.*;

public class Scrollbar_setLineIncrement_Example {

    /**
     * A simple example demonstrating how to use the setLineIncrement method of the Scrollbar class. This example will create a scrollbar and set its line increment value to 10. Additionally, this example will demonstrate the effect of changing the line increment value by printing out the current vertical scrollbar position after each change in the line increment value.
     */

    public static void main(String[] args) {

        // Create a new Scrollbar object
        Scrollbar scrollbar = new Scrollbar();

        // Set the line increment value of the scrollbar to 10
        scrollbar.setLineIncrement(10);

        // Print out the current vertical scrollbar position after each change in the line increment value
        System.out.println("Initial Vertical Scrollbar Position: " + scrollbar.getVerticalScrollBarPosition()));

        // Change the line increment value of the scrollbar to 20
        scrollbar.setLineIncrement(20);

        // Print out the current vertical scrollbar position after each change in the line increment value
        System.out.println("Vertical Scrollbar Position After Changing Line Increment Value To 20: " + scrollbar.getVerticalScrollBarPosition()));

    }

}