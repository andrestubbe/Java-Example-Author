package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.lang.reflect.Field;

/**
 * This example demonstrates how to use the
 * `getInsertPositionOffset` method from the
 * `InputMethodRequests` class. This method returns the offset of the cursor position after the insertion of the committed text has occurred.
 */
public class InputMethodRequests_getInsertPositionOffset_Example {

    /**
     * This method demonstrates how to use the
     * `getInsertPositionOffset` method from the
     * `InputMethodRequests` class.
     *
     * @param event The input method event.
     * @return int The offset of the cursor position after the insertion of the committed text has occurred.
     */
    public static int getInsertPositionOffset(InputMethodEvent event) throws NoSuchFieldException, IllegalAccessException {
        // Get the field 'insertPosition' from the InputMethodRequests class
        Field insertPositionField = InputMethodRequests.class.getDeclaredField("insertPosition");

        // Make the field accessible
        insertPositionField.setAccessible(true);

        // Retrieve the value of the field
        int offset = (int) insertPositionField.get(event);

        return offset;
    }
}