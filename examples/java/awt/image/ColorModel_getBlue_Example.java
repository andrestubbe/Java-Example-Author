package examples.java.awt.image;

import java.awt.ColorModel;

public class ColorModel_getBlue_Example {

    /**
     * This example demonstrates how to use the `getBlue` method from the `ColorModel` class in Java. 
     * It shows the usage of this method and also explains its result.
     */

    public static void main(String[] args) {

        // Create an instance of ColorModel
		ColorModel colorModel = new ColorModel();

		// Set a sample RGB value for testing purposes
		int rgbValue = 0xDEADBEEF;

		// Get the blue component from the RGB value using the getBlue method
		int blueComponent = colorModel.getBlue(rgbValue));

		// Print the result to the console
		System.out.println("The blue component extracted from the RGB value is: " + blueComponent);

    }

}