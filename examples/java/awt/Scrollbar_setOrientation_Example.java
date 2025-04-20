package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Scrollbar;

public class Scrollbar_setOrientation_Example {

    /**
     * This example demonstrates how to set the orientation of a 
     * Scrollbar widget within a Java Swing application.
     * 
     * The code uses a lambda expression and passes it as an argument 
     * to the `addNotify` method of the Scrollbar widget.
     * 
     * The lambda expression takes two parameters, an AWTEvent parameter and 
     * a Component parameter. These parameters are not used in this example, 
     * but they are required by the Java compiler.
     * 
     * In the code block below, you will notice that there is only a single line of code within the class definition body. This is because the bulk of the code resides within the lambda expression passed as an argument to the `addNotify` method.
     * 
     * As such, the example demonstrates how to set the orientation of a Scrollbar widget within a Java Swing application without requiring any additional classes or methods beyond those required for this specific task.
     */

    public void runExample() {
        Scrollbar scrollbar = new Scrollbar();

        // Set the orientation of the Scrollbar widget.
        scrollbar.addNotify(event -> {
            if (event instanceof javax.swing.JComponent.ComponentEvent)) {
            javax.swing.JComponent component = (javax.swing.JComponent) event.getSource();
            if (component instanceof javax.swing.JScrollPane)) {
                javax.swing.JScrollPane scrollPane = (javax.swing.JScrollPane) component;
                javax.swing.ScrollPaneConstants orientation = scrollPane.getOrientation();
                switch (orientation) {
                    case javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR:
                        scrollbar.setOrientation(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR));
                        break;
                    case javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR:
                        scrollbar.setOrientation(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR));
                        break;
                }
            }
        }, null);

        // Display the Scrollbar widget in a Java Swing application window.
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE));
        frame.getContentPane().add(scrollbar);
        frame.pack();
        frame.setVisible(true));

    }
}