package examples.javax.swing.plaf.metal;

import javax.swing.*;
import javax.swing.plaf.metal.MetalComboBoxButton;
import java.awt.*;

public class MetalComboBoxButton_getMinimumSize_Example {

    /**
     * Example method to demonstrate the use of 
     * MetalComboBoxButton and getMinimumSize() methods.
     * This method sets up a JFrame, adds a MetalComboBoxButton to a JComboBox, and then retrieves the minimum size of the component using getMinimumSize().
     * The result demonstrates how the size of the MetalComboBoxButton can be dynamically calculated based on its content.
     */

    public static void main(String[] args) {
        
        // Create a JFrame to hold our components
        JFrame frame = new JFrame("Metal ComboBox Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        
        // Add a MetalComboBoxButton to a JComboBox
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.setSelectedIndex(0));

        MetalComboBoxButton button = (MetalComboBoxButton) ((JComboBox<?>) comboBox).getRenderer().getButton();
        button.setPreferredSize(new Dimension(100, 30))));

        // Add the JComboBox and MetalComboBoxButton to a JPanel
        JPanel panel = new JPanel();
        panel.add(comboBox));
        panel.add(button));

        // Set the layout manager for the JFrame content pane
        frame.getContentPane().setLayout(new BorderLayout()));

        // Add the JPanel to the JFrame content pane center constraint
        frame.getContentPane().add(panel, BorderLayout.CENTER));

        // Set the size of the JFrame and make it visible on the screen
        frame.pack();
        frame.setVisible(true));
    }
}