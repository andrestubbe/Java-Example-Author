package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.AdjustableColsScrollbar;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Scrollbar_getPageIncrement_Example {

    // AdjustableColsScrollbar is a scrollbar that supports adjustable columns. 
    private final AdjustableColsScrollbar scrollbar = new AdjustableColsScrollbar();

    // ComponentAdapter allows you to implement custom behavior for AWT and Swing components.
    private final ComponentAdapter componentAdapter = new ComponentAdapter() {
        @Override
        public void componentShown(ComponentEvent e) {
            System.out.println("The scrollbar is now visible.");
        }
    };

    public Scrollbar_getPageIncrement_Example() {
        // Add the scrollbar to a container, such as a JFrame or JPanel.
        // This step has been omitted for brevity.
        // By default, the AdjustableColsScrollbar will have its initial value set to 0 (page increment of 0) and its minimum value set to -Integer.MAX_VALUE.

        scrollbar.addComponentListener(componentAdapter);
    }

    public static void main(String[] args) {
        // Create an instance of the Scrollbar_getPageIncrement_Example class.
        Scrollbar_getPageIncrement_Example example = new Scrollbar_getPageIncrement_Example();
    }
}