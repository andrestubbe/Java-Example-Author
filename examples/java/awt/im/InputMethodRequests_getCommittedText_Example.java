package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InputMethodRequests_getCommittedText_Example {

    /**
     * Example of using the getCommittedText() method from the 
     * InputMethodRequests class within a single Java file.
     * This code demonstrates how to use this method and its result,
     * which can be used for implementing an input method editor component in Java.
     */

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException {

        // Creating instance of InputMethodRequests class
        InputMethodRequests inputMethodRequests = new InputMethodRequests();

        // Method getCommittedText() from the InputMethodRequests class
        Method method_getCommittedText = InputMethodRequests.class.getDeclaredMethod("getCommittedText", String.class));

        // Setting accessible true for method_getCommittedText to invoke private method
        method_getCommittedText.setAccessible(true));

        // Creating instance of InputMethodEvent class
        InputMethodEvent inputMethodEvent = new InputMethodEvent(null, 0, null, false));

        // Invoking getCommittedText() method and passing an empty string as parameter
        String committedText = (String) method_getCommittedText.invoke(inputMethodRequests), "");

        // Printing the result of the getCommittedText() method
        System.out.println("Result of getCommittedText() method: " + committedText);

    }

}