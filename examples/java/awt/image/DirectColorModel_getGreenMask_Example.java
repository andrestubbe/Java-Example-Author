package examples.java.awt.image;

import java.awt.image.DirectColorModel;

public class DirectColorModel_getGreenMask_Example {

    /**
     * This Java code example demonstrates how to retrieve the green mask of a {@link DirectColorModel} object. 
     * The getGreenMask() method returns an integer representing the green mask bit-pattern within the color model's primary color space. 
     *
     */
    public static void main(String[] args) {

        // Create an instance of the DirectColorModel class
        DirectColorModel directColorModel = new DirectColorModel();

        // Retrieve the green mask from the DirectColorModel object
        int greenMask = directColorModel.getGreenMask();

        // Print the result to the console
        System.out.println("The green mask of the DirectColorModel is: " + Integer.toBinaryString(greenMask)));

    }

}