package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import javax.swing.*;
import java.awt.*;

/**
 * This example demonstrates how to create a custom Scrollbar in Java using the Scrollbar class within the AWT package. The code provided creates a custom scrollbar with adjustable thumb size and scrollable range. The example is designed to be runnable and can be directly pasted into a Java file and used.
 */
public class Scrollbar_setMaximum_Example {

    // Create JFrame for main window
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private static JFrame frame;

    // Create custom scrollbar with adjustable thumb size and scrollable range
    private static Scrollbar createCustomScrollbar() {
        // Initialize a new Scrollbar object
        Scrollbar scrollbar = new Scrollbar();

        // Set the minimum, maximum, and unit increments for the scrollbar
        scrollbar.setMinimum(0);
        scrollbar.setMaximum(100);
        scrollbar.setUnitIncrement(1);
        scrollbar.setBlockIncrement(10);

        // Add a thumb position adjustment listener to the scrollbar
        scrollbar.addAdjustmentListener((AdjustmentEvent e) -> {
            // Get the new thumb position from the adjustment event
            int thumbPosition = e.getValue();

            // Update the thumb position label with the current thumb position value
            thumbPositionLabel.setText(String.valueOf(thumbPosition)));

        return scrollbar;
    }

    // Create a JPanel to hold custom components and layout
    private static JPanel createCustomPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(createCustomScrollbar(), BorderLayout.CENTER);
        return panel;
    }

    // Create a JFrame and set its components to display the custom scrollbar example
    private static void createAndShowExample() {
        frame = new JFrame("Custom Scrollbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.getContentPane().add(createCustomPanel(), BorderLayout.CENTER);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT));
        frame.setVisible(true));
    }

    // Main method to run the example
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowExample()));
    }
}