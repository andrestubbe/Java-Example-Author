package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_getOffset_Example {

    /**
     * Example of the `getOffset` method in the 
     * `ComponentSampleModel` class. This example 
     * demonstrates how to use this method and understand 
     * its functionality.
     */

    public static void main(String[] args) {

        // Create an instance of ComponentSampleModel
        ComponentSampleModel sampleModel = new ComponentSampleModel();

        // Get the offset using the getOffset method
        int offset = sampleModel.getOffset();

        // Print out the result of the getOffset method
        System.out.println("The offset is: " + offset);

    }

}