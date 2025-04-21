package examples.javax.swing.plaf.nimbus;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.IconProxy;

public class NimbusIcon_paintFilter_Example {

    /**
     * This example demonstrates the usage of the NimbusIcon class, specifically the paintFilter method.
     * 
     * The NimbusIcon class extends IconProxy and is used to create custom icons for use with JComponents such as JButton and JToggleButton.
     * 
     * The paintFilter method is a protected method in the NimbusIcon class that allows subclass implementations to override and customize how painting operations are performed on a component.
     * 
     * This example specifically demonstrates the usage of the paintFilter method by creating a custom icon based on the NimbusIcon class. The resulting custom icon, when applied to a JButton or JToggleButton, will display a tick mark instead of a check box symbol.
     */

    public static void main(String[] args) {
        // Create a new instance of the NimbusIcon class
        NimbusIcon nimbusIcon = new NimbusIcon();

        // Call the paintFilter method on the NimbusIcon instance
        nimbusIcon.paintFilter(new JComponent(){}.getGraphics(), null));
    }
}