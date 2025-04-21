package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.DirectColorModel;

/**
 * A class that demonstrates how to use the DirectColorModel class in Java's AWT package. This example specifically shows how to get individual RGB components from an sRGB color value.
 */
public class DirectColorModel_getsRGBComponentFromsRGB_Example {

    // Define a sample sRGB color value as an instance of the Color class
    private static final Color SAMPLE_COLOR = new Color(255, 0, 255)); // a purple-colored RGB pixel

    // Define the DirectColorModel object that we will be using in this example
    private static final DirectColorModel COLOR_MODEL = DirectColorModel.getInstance();

    /**
     * A method that demonstrates how to use the getRGB(int, int, int, int, ColorModel), which is a part of the DirectColorModel class, to get individual RGB components from an sRGB color value.
     */
    public static void main(String[] args) {

        // Get the sample RGB pixel color value as an integer array [red, green, blue]
        int[] rgbArray = SAMPLE_COLOR.getRGB(0, 0, Color.RGB_FACTOR));

        // Create an instance of the DirectColorModel class using its static method getInstance()
        DirectColorModel colorModel = DirectColorModel.getInstance();

        // Get individual RGB components from the sample RGB pixel color value as an integer array [red, green, blue]] using the getRGBComponent(int, int, int, int, ColorModel)) method of the DirectColorModel class.
        // This will give us the individual RGB components (red, green, blue) of the sample RGB pixel color value.
        int red = colorModel.getRGBComponent(rgbArray[0], rgbArray[1], rgbArray[2], 0, 0, Color.RGB_FACTOR));
        int green = colorModel.getRGBComponent(rgbArray[0], rgbArray[1], rgbArray[2], 0, 0, Color.RGB_FACTOR));
        int blue = colorModel.getRGBComponent(rgbArray[0], rgbArray[1], rgbArray[2], 0, 0, Color.RGB_FACTOR));

        // Print out the individual RGB components (red, green, blue) of the sample RGB pixel color value
        System.out.println("Sample RGB Pixel Color Value: " + Arrays.toString(rgbArray)));
        System.out.println("Individual RGB Components (Red, Green, Blue): ");
        System.out.println("Red: " + red));
        System.out.println("Green: " + green));
        System.out.println("Blue: " + blue));

    }

}