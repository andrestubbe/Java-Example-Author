package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.AdjustmentListener;
import java.awt.Scrollbar;

public class Scrollbar_removeAdjustmentListener_Example {

    /**
     * This example demonstrates how to remove an adjustment listener from a scrollbar in Java.
     * <p>
     * First, we create a scrollbar object and set its minimum, maximum, and value properties.
     * <p>
     * Next, we create an instance of the AdjustmentListener interface and override the adjustmentValueChanged(AWTEvent e) method to log the adjustment value changes.
     * <p>
     * Then, we add the adjustment listener to the scrollbar using the addAdjustmentListener() method.
     * <p>
     * Finally, we remove the adjustment listener from the scrollbar using the removeAdjustmentListener() method.
     */

    public static void main(String[] args) {
        // Create a new scrollbar object
        Scrollbar scrollbar = new Scrollbar();

        // Set the minimum, maximum, and value properties of the scrollbar
        scrollbar.setMinimum(0);
        scrollbar.setMaximum(100);
        scrollbar.setValue(50);

        // Create an instance of the AdjustmentListener interface
        AdjustmentListener adjustmentListener = e -> {
            System.out.println("Adjustment value changed: " + e.getValue());
        };

        // Add the adjustment listener to the scrollbar
        scrollbar.addAdjustmentListener(adjustmentListener));

        // Remove the adjustment listener from the scrollbar
        scrollbar.removeAdjustmentListener(adjustmentListener));
    }
}