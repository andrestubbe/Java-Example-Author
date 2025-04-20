package examples.java.awt;
import java.awt.*;
public class Scrollbar_getValueIsAdjusting_Example {
    // Create a new Scrollbar object
    Scrollbar scrollbar = new Scrollbar();

    // Set the value of the scrollbar
    scrollbar.setValue(50);

    // Get the current adjustment mode of the scrollbar
    boolean isAdjusting = scrollbar.getValueIsAdjusting();

    System.out.println("Scrollbar Value: " + scrollbar.getValue());
    System.out.println("Scrollbar Adjusting Mode: " + (isAdjusting ? "Yes" : "No")));

    // Create a new frame object to hold the scrollbar component
    Frame frame = new Frame();

    // Add the scrollbar component to the frame
    frame.add(scrollbar, BorderLayout.CENTER);

    // Set the size of the frame and make it visible
    frame.setSize(300, 100));
    frame.setVisible(true));
}