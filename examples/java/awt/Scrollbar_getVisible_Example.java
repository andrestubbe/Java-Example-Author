package examples.java.awt;

import java.awt.Scrollbar;

/**
 * A Java code example that demonstrates how to use the `getVisible()` method of the `Scrollbar` class.
 * 
 * <p>This example creates a scrollbar with a range of values from 0 to 100, and sets the value of the scrollbar to 50. The example then prints out whether the scrollbar is currently visible or not.</p>
 */
public class Scrollbar_getVisible_Example {

    public static void main(String[] args) {
        // Create a new Scrollbar object with a range of values from 0 to 100
        Scrollbar scrollbar = new Scrollbar(0, 100));
        
        // Set the value of the scrollbar to 50
        scrollbar.setValue(50);
        
        // Check whether the scrollbar is currently visible or not
        boolean isVisible = scrollbar.getVisible();
        System.out.println("Is scrollbar visible? " + isVisible));
    }

}