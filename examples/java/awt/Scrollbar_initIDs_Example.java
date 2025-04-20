package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ResizeEvent;
import java.lang.reflect.Field;
import javax.swing.JScrollBar;

public class Scrollbar_initIDs_Example {

    /**
	 * This example demonstrates how to initialize the IDs of a Scrollbar component in Java.
	 * 
	 * <p>This code creates a JFrame, sets its layout to BorderLayout, and adds a JScrollBar component with specified ID strings.</p>
	 */

	public static void main(String[] args) {

		// Create a new JFrame container
		JFrame frame = new JFrame("Scrollbar Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
		frame.setSize(400, 300));
		frame.setLocationRelativeTo(null));
		frame.setVisible(true));

		// Create a new JScrollBar component with specified ID strings
		JScrollBar scrollbar = new JScrollBar();
		scrollbar.setId("exampleScrollbar");
		frame.add(scrollbar, BorderLayout.CENTER);

	    }

}