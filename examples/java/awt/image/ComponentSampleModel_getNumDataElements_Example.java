package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_getNumDataElements_Example {

    /**
     * This example demonstrates the use of 
     * the `ComponentSampleModel` class within 
     * a single Java file. The code is designed to be runnable, and it creates an instance of the `ComponentSampleModel` class and calls its `getNumDataElements()` method.
     * 
     * This example is useful for understanding how to use the `ComponentSampleModel` class within a Java program. It can also serve as a starting point for more complex examples that involve more advanced usage of the `ComponentSampleModel` class.
     */

    public static void main(String[] args) {
        // Create an instance of ComponentSampleModel 
        ComponentSampleModel sampleModel = new ComponentSampleModel();

        // Call getNumDataElements() method on the object created from the class.
        int numOfDataElements = sampleModel.getNumDataElements();
        System.out.println("Number of Data Elements: " + numOfDataElements);
    }
}