package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Scrollbar;

/**
 * This example demonstrates how to create a custom
 * Scrollbar UI and override the behavior of the
 * setValue method. In this example, we will change the
 * Scrollbar's value without generating an
 * AdjustmentEvent. Instead, we will directly modify the
 * Scrollbar's state variables.
 */
public class Scrollbar_setValue_Example {

    // Create a custom Scrollbar UI implementation
    private static class CustomScrollbarUI extends ScrollbarUI {

        @Override
        public void paint(Graphics g, JComponent c) {
            super.paint(g, c);
            // Custom painting logic here...
        }

        @Override
        protected int getMinimumThumbSize() {
            return super.getMinimumThumbSize();
            // Custom minimum thumb size logic here...
        }
    }

    public static void main(String[] args) {
        // Create a custom Scrollbar UI implementation instance
        CustomScrollbarUI customScrollbarUI = new CustomScrollbarUI() {
            @Override
            public void valueChanged(AWTEvent e, int id) {
                super.valueChanged(e, id);
                // Custom value changed logic here...
            }
        };

        // Create a Scrollbar instance with our custom Scrollbar UI implementation
        Scrollbar scrollbar = new Scrollbar(customScrollbarUI));

        // Set the initial value of the Scrollbar's thumb to be in the middle of its range
        scrollbar.setValue((scrollbar.getMaximum() + scrollbar.getMinimum()) / 2));

        // Add the Scrollbar instance to a JFrame container
        JFrame frame = new JFrame("Scrollbar Example");
        frame.add(scrollbar);
        frame.pack();
        frame.setVisible(true);
    }
}