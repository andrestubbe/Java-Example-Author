package examples.java.awt.im;

import java.util.InputContext;

public class InputContext_getInputMethodControlObject_Example {

    /**
     * <p>Title: Get Input Method Control Object Example</p>
     * <p>Description: This Java code example demonstrates how to create a runnable Java code using the `InputContext` class.</p>
     * <p>This example focuses on creating an instance of the `InputContext` class, and obtaining the input method control object from it.</p>
     */

    public static void main(String[] args) {
        
        // Create an instance of InputContext class
        InputContext inputContext = new InputContext();
        
        // Get Input Method Control Object 
        Object inputMethodControlObject = inputContext.getInputMethodControlObject();
        
        // Print the result
        System.out.println("The input method control object is: " + inputMethodControlObject);

    }
}