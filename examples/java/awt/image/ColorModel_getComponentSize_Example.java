package examples.java.awt.image;

import java.awt.color.ColorModel;

/**
 * This example demonstrates how to use the getComponentSize() method of the ColorModel class.
 * <p>
 * The getComponentSize() method is used to determine the size of each color component in a specific color model.
 * <p>
 * In this example, we will use the RGB color model provided by the ColorModel class.
 */
public class ColorModel_getComponentSize_Example {

    /**
     * Main method that demonstrates how to use the getComponentSize() method of the ColorModel class.
     * <p>
     * In this example, we will create an RGB color model and then determine the size of each color component in this specific color model.
     */
    public static void main(String[] args) {

        // Create an instance of the ColorModel class with the RGB color model specification.
        ColorModel rgbColorModel = new ColorModel(ColorModel.RGB, false, false, false));

        // Get the size of each color component in this specific color model.
        int redSize = rgbColorModel.getComponentSize(ColorModel.RED_INDEX));
        int greenSize = rgbColorModel.getComponentSize(ColorModel.GREEN_INDEX));
        int blueSize = rgbColorModel.getComponentSize(ColorModel.BLUE_INDEX));

        // Print the size of each color component in this specific color model.
        System.out.println("Size of Red Component: " + redSize + " bits"));
        System.out.println("Size of Green Component: " + greenSize + " bits"));
        System.out.println("Size of Blue Component: " + blueSize + " bits"));

    }

}