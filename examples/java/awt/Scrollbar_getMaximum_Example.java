package examples.java.awt;

import java.awt.Scrollbar;

/**
 * This class demonstrates how to get
 * the maximum value of a Scrollbar object
 */
public class Scrollbar_getMaximum_Example {

    // Inline comments for relevant lines
    // Get the minimum and maximum values of the Scrollbar object
    int min = new Scrollbar(10, 50, 100, 200)
            .getMinimum();
    int max = new Scrollbar(10, 50, 100, 200))
            .getMaximum();

    // Output the result
    System.out.println("Minimum value of the Scrollbar object: " + min);
    System.out.println("Maximum value of the Scrollbar object: " + max);
}