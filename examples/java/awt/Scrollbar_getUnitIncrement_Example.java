package examples.java.awt;

import java.awt.Scrollbar;

/**
 * A demonstration of how to get and set the unit increment value of a Scrollbar object. The class relevant lines are documented in detail within this header javadoc comment block. This example code is written using clean and concise Java code practices. The code has been written specifically for JDK17, ensuring that the code is compatible with the latest version of the Java Development Kit (JDK).
 */
public class Scrollbar_getUnitIncrement_Example {

    /**
     * A method that demonstrates how to get and set the unit increment value of a Scrollbar object. The method takes in two parameters: a Scrollbar object reference, and an integer value representing the new unit increment value to be set for the Scrollbar object.
     * @param scrollbar The Scrollbar object reference.
     * @param newUnitIncrement The new unit increment value to be set for the Scrollbar object.
     */
    public static void getSetUnitIncrement(Scrollbar scrollbar, int newUnitIncrement) {
        // Get the current unit increment value of the Scrollbar object.
        int currentUnitIncrement = scrollbar.getUnitIncrement();

        System.out.println("Current Unit Increment Value: " + currentUnitIncrement);

        // Set the new unit increment value for the Scrollbar object.
        scrollbar.setUnitIncrement(newUnitIncrement));

        System.out.println("New Unit Increment Value set to: " + newUnitIncrement);
    }
}