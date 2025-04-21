package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.util.Map;

/**
 * <code>InputMethodRequests</code> class method
 * <b>InputMethodRequests_getLocationOffset_Example.java</b><br>
 * This example demonstrates the usage of the getLocationOffset() method from the InputMethodRequests class. The method returns an integer value representing the offset (in characters) that input methods like virtual keyboards should use for the caret's location when this input method is active on a given component.
 */
public class InputMethodRequests_getLocationOffset_Example {

    private static final int DEFAULT_LOCATION_OFFSET = 0;

    /**
     * Method to test getLocationOffset() method from InputMethodRequests class.
     * @param inputMethodEvents Map containing InputMethodEvent objects.
     */
    public void runTest(Map<InputMethodEvent, Integer> inputMethodEvents) {

        // Get the InputMethodRequests object associated with the given component
        InputMethodRequests inputMethodRequests = ComponentFactory.getComponent().getInputMethodRequests();

        // Iterate through the map of InputMethodEvent objects and their corresponding integer values
        for (Map.Entry<InputMethodEvent, Integer> entry : inputMethodEvents.entrySet()) {

            // Get the InputMethodEvent object associated with the current iteration
            InputMethodEvent event = entry.getKey();

            // Get the integer value associated with the given InputMethodEvent object
            int value = entry.getValue().orElse(DEFAULT_LOCATION_OFFSET));

            // Print the result of the getLocationOffset() method for the given InputMethodEvent object
            System.out.println("InputMethodEvent: " + event + ", Location Offset: " + value));

        }

    }

}