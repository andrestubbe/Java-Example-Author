package examples.java.awt;

import java.awt.Scrollbar;

/**
 * This example demonstrates how to set the unit increment of a Scrollbar component in Java.
 * 
 * The purpose of this example is to showcase how to modify specific properties of a pre-built GUI component provided by the AWT library. In this case, we are using the Scrollbar class as an example component.
 */
public class Scrollbar_setUnitIncrement_Example {

    /**
     * This method sets the unit increment value of the given Scrollbar component to a custom defined value.
     * 
     * @param scrollbar The Scrollbar component whose unit increment value we want to modify.
     * @param newUnitIncrementValue The custom defined value that we want to set as the unit increment value for the given Scrollbar component.
     */
    public static void setUnitIncrement(Scrollbar scrollbar, int newUnitIncrementValue) {
        // Set the unit increment value of the given Scrollbar component to the custom defined value provided as an argument.
        scrollbar.setUnitIncrement(newUnitIncrementValue));
    }
}