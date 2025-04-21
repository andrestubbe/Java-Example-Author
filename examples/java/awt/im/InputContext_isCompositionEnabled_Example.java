package examples.java.awt.im;

import java.util.concurrent.atomic.AtomicBoolean;

public class InputContext_isCompositionEnabled_Example {

    /**
     * <p>Title: InputContext_isCompositionEnabled_Example</p>
     * <p>Description: Example demonstrating the use of the InputContext class to check if composition is enabled.</p>
     * <p>Note: This example requires JDK17 or later.</p>
     */

    public static void main(String[] args) {
        
        InputContext inputContext = new InputContext();
        AtomicBoolean compositionEnabled = new AtomicBoolean(inputContext.isCompositionEnabled()));
        
        // Display the result of isCompositionEnabled() method
        System.out.println("Composition enabled: " + compositionEnabled.get()));
    }
}