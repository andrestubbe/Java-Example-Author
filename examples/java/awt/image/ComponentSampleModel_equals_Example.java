package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.util.Arrays;

/**
 * This example demonstrates how to use the `ComponentSampleModel` class within a single Java file. The code is designed to be runnable and demonstrates creating an instance of the `ComponentSampleModel` class, setting its properties, and then calling its `equals()` method to compare it with another object.
 */
public class ComponentSampleModel_equals_Example {

    public static void main(String[] args) {
        // Create an instance of the ComponentSampleModel class
        ComponentSampleModel sampleModel = new ComponentSampleModel();

        // Set properties of the sampleModel instance
        sampleModel.setWidth(10);
        sampleModel.setHeight(20);
        sampleModel.setPixels(new int[]{1, 2, 3, 4, 5}});

        // Create another object to compare with the sampleModel instance
        ComponentSampleModel otherModel = new ComponentSampleModel();
        otherModel.setWidth(10);
        otherModel.setHeight(20);
        otherModel.setPixels(new int[]{1, 2, 3, 4, 5}});

        // Compare the sampleModel instance with another object using the equals() method
        boolean isEqual = sampleModel.equals(otherModel);

        System.out.println("Is the sampleModel equal to the otherModel? " + isEqual));
    }

}