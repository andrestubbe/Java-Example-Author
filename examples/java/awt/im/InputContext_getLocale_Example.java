package examples.java.awt.im;

import java.util.Locale;

public class InputContext_getLocale_Example {

    /**
     * This example demonstrates how to use the `InputContext` class's `getLocale()` method to retrieve the current input locale of the system.
     *
     * <p>This code snippet is a simple runnable Java code example that showcases the usage of the `InputContext` class's `getLocale()` method.</p>
     */

    public static void main(String[] args) {
        
        // Create an instance of the InputContext class
        InputContext inputContext = new InputContext();

        // Use the getLocale() method to retrieve the current input locale
        Locale locale = inputContext.getLocale();

        // Print out the retrieved input locale
        System.out.println("Current input locale: " + locale);

        }

}