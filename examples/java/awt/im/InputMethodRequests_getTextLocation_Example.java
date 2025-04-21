package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class InputMethodRequests_getTextLocation_Example {

    /**
     * This example demonstrates the usage of the `getTextLocation()` method provided by the `InputMethodRequests` class.
     * 
     * The `InputMethodRequests` class provides various methods to manipulate and retrieve information related to input methods in Java applications.
     *
     * In this specific example, we are demonstrating the usage of the `getTextLocation()` method within an InputMethodListener implementation.
     *
     * The `getTextLocation()` method returns a Point object representing the location where the text input caret is currently positioned.
     *
     * By implementing and registering an instance of our class as an InputMethodListener, we are able to intercept and process InputMethodEvents triggered within our Java application's user interface components.
     *
     * In our example code, we override the `eventOccurred(e)` method implementation provided by the superclass `AWTEventListener`.
     *
     * Within our overridden `eventOccurred(e)` method implementation, we perform the following steps:
     * 1. Check if the InputMethodEvent received is an instance of the InputMethodRequests class. If it is not, then we ignore the event and return immediately.
     * 2. If the InputMethodEvent received is indeed an instance of the InputMethodRequests class, then we proceed to call the `getTextLocation()` method on the received InputMethodRequests object. This will return a Point object representing the location of the text input caret in relation to the component hosting the input field within our Java application's user interface components.
     * 3. Finally, we print out the coordinates of the Point returned by the `getTextLocation()` method, formatted as a comma-separated pair of integers.
     */

    @Override
    public void eventOccurred(InputMethodEvent e) {
        if (!(e instanceof InputMethodRequests))) return;

        InputMethodRequests req = (InputMethodRequests) e.getSource();

        Point point = req.getTextLocation();

        System.out.println("Text input caret location: (" + point.x + ", " + point.y + "))");
    }
}