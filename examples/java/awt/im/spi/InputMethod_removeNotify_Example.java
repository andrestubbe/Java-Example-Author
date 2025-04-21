package examples.java.awt.im.spi;

import java.awt.EventQueue;
import java.lang.reflect.Field;
import java.util.Map;

public class InputMethod_removeNotify_Example {

    /**
     * This example demonstrates the use of the `removeNotify` method within the `InputMethod` class. The purpose of this example is to showcase the usage of the `removeNotify` method in order to handle events related to the removal of a component from its parent container.
     *
     * @see java.awt.event.ComponentListener#componentRemoved(java.awt.event.ComponentEvent))
     */

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create a new instance of the InputMethod class
        InputMethod inputMethod = new InputMethod();

        // Print out the original component count
        System.out.println("Original Component Count: " + inputMethod.getComponentCount());

        // Get the map that stores the installed input methods
        Field field = InputMethodContext.class.getDeclaredField("installedInputMethods");
        field.setAccessible(true);

        // Clear out all of the currently registered input methods
        ((Map<?, ?>) field.get(null)).clear();

        // Print out the updated component count
        System.out.println("Updated Component Count: " + inputMethod.getComponentCount()));

        // Wait for a short period of time before exiting the program
        try {
            Thread.sleep(2000));
        } catch (InterruptedException e) {
            e.printStackTrace());
        }

        System.exit(0);
    }
}