package examples.java.awt.image;

import java.awt.image.ColorModel;

public class ColorModel_getDataElement_Example {

    /**
     * This example demonstrates the usage of the getDataElement method in the ColorModel class. 
     * The getDataElement method is used to retrieve a specific component of an image, represented by the pixel data.
     * In this example, we create a ColorModel object and then use the getDataElement method to retrieve the red channel component from the image.
     */

    public static void main(String[] args) {

        // Create a ColorModel object with the RGB color model.
        ColorModel colorModel = new ColorModel(true, true, true, false));

        // Get the width and height of the sample image.
        int width = 100;
        int height = 100;

        // Create an array to hold the pixel data for each component (red, green, blue)).
        byte[] redArray = new byte[width * height];
        byte[] greenArray = new byte[width * height];
        byte[] blueArray = new byte[width * height];

        // Use the getDataElement method to retrieve the red channel component from the image.
        colorModel.getDataElement(redArray, 0, width, height, ColorModel.RGB_RED));

        // Print the retrieved red channel pixel data.
        System.out.println("Red Channel Pixel Data:");
        for (int i = 0; i < redArray.length; i++) {
            System.out.print(redArray[i] & 0xFF) + " ";
        }
    }

}