package examples.java.awt;

import java.awt.Scrollbar;

/**
 * This example demonstrates how to get the value of a Scrollbar component in Java AWT (Abstract Window Toolkit).
 *
 * @author <NAME>
 */
public class Scrollbar_getValue_Example {

    public static void main(String[] args) {

        // Create an instance of the Scrollbar class
        Scrollbar scrollbar = new Scrollbar();

        // Get the minimum value of the Scrollbar component
        int minValue = scrollbar.getMinimum();

        System.out.println("Minimum Value: " + minValue);

    }

}