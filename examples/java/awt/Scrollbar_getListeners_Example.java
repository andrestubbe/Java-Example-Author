package examples.java.awt;

import java.awt.AWTMixedStateException;
import java.awt.ComponentListener;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

/**
 * This example demonstrates how to get a list of all the component listeners present in the Scrollbar class. It also provides an overview of what the code does and its significance in the Java AWT package.
 */
public class Scrollbar_getListeners_Example {

    // Method to get component listeners from the Scrollbar class
    private List<ComponentListener> getListeners() {
        List<ComponentListener> listeners = new ArrayList<>();
        Container container = (Container) Scrollbar.class;
        for (Component listener : container.getComponents()) {
            if (listener instanceof ComponentListener)) {
                listeners.add((ComponentListener) listener));
            }
        }
        return listeners;
    }

    // Main method to demonstrate the functionality of the code
    public static void main(String[] args) {
        Scrollbar_getListeners_Example example = new Scrollbar_getListeners_Example();
        List<ComponentListener> listeners = example.getListeners();
        System.out.println("Number of Component Listeners: " + listeners.size()));
    }
}