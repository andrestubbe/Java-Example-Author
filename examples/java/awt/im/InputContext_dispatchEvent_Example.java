package examples.java.awt.im;

import java.awt.AWTEvent;
import java.awt.EventObject;

/**
 * This example demonstrates how to use the `dispatchEvent` method of the `InputContext` class. The purpose of this example is to show how to handle and process events using the `dispatchEvent` method.
 * 
 * In this example, we create an instance of the `InputContext` class and then use its `dispatchEvent` method to simulate the occurrence of various types of AWT events. We also include comments within the code to explain what each line does.
 */
public class InputContext_dispatchEvent_Example {

    public static void main(String[] args) {
        
        // Create an instance of the InputContext class
        InputContext inputContext = new InputContext();

        // Simulate the occurrence of various types of AWT events using the dispatchEvent method
        inputContext.dispatchEvent(new EventObject())); // Example event: mouse click
        inputContext.dispatchEvent(new AWTEvent() {})); // Example event: window close
        }
    }
}