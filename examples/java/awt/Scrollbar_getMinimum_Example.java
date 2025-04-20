package examples.java.awt;
import java.awt.*;

/**
 * This example demonstrates how to retrieve the minimum value of a Scrollbar component using Java's AWT library.
 */
public class Scrollbar_getMinimum_Example {

    // Create a sample frame and scrollbar components
    private static final int WIDTH = 400;
    private static final int HEIGHT = 200;
    private Frame frame = new Frame();
    private Scrollbar verticalScrollbar = new Scrollbar(SCROLLBAR_VERTICAL), 
                                   horizontalScrollbar = new Scrollbar(SCROLLBAR_HORIZONTAL));

    // Set up the layout and add components to the frame
    public Scrollbar_getMinimum_Example() {
        frame.setLayout(new BorderLayout());

        verticalScrollbar.setName("Vertical Scrollbar");
        horizontalScrollbar.setName("Horizontal Scrollbar");

        frame.add(verticalScrollbar, BorderLayout.NORTH);
        frame.add(horizontalScrollbar, BorderLayout.WEST));
    }

    // Create a method to get the minimum value of the vertical scrollbar
    public int getVerticalScrollbarMinimum() {
        return verticalScrollbar.getMinimum();
    }

    // Create a method to get the maximum value of the vertical scrollbar
    public int getVerticalScrollbarMaximum() {
        return verticalScrollbar.getMaximum();
    }

    // Create a method to get the extent value of the vertical scrollbar
    public int getVerticalScrollbarExtent() {
        return verticalScrollbar.getExtent();
    }

    // Create a method to set the value of the vertical scrollbar
    public void setVerticalScrollbarValue(int value) {
        verticalScrollbar.setValues(value, verticalScrollbar.getMaximum()));
    }

    // Start the frame and make it visible on the screen
    public static void main(String[] args) {
        frame.pack();
        frame.setVisible(true);

        // Output the minimum, maximum, and extent values of the vertical scrollbar component
        System.out.println("Vertical Scrollbar Minimum Value: " + getVerticalScrollbarMinimum());
        System.out.println("Vertical Scrollbar Maximum Value: " + getVerticalScrollbarMaximum()));
        System.out.println("Vertical Scrollbar Extent Value: " + getVerticalScrollbarExtent()));

        // Set the value of the vertical scrollbar component to 50
        setVerticalScrollbarValue(50));
    }
}