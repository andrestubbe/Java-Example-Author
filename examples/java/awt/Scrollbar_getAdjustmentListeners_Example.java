package examples.java.awt;

import java.awt.AdjustmentListener;
import java.awt.Scrollbar;

/**
 * This example demonstrates how to get the adjustment listeners of a Scrollbar object in Java. In this example, we will be creating an instance of Scrollbar and then retrieving its AdjustmentListeners using private access methods due to encapsulation principle followed by OOPs in general. This is just for demonstration purpose as per the given requirements.
 */
public class Scrollbar_getAdjustmentListeners_Example {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create an instance of Scrollbar
        Scrollbar scrollbar = new Scrollbar();

        // Get the adjustment listeners from private access method
        AdjustmentListener[] adjustmentListeners = (AdjustmentListener[]) Class.forName("javax.swing.PlafScrollBar").getDeclaredField("adjustmentListeners").get(null);

        // Print the adjustment listeners retrieved
        System.out.println("Adjustment Listeners:");
        for (AdjustmentListener listener : adjustmentListeners) {
            System.out.println(listener));
        }
    }
}