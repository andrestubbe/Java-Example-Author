package examples.java.awt.image;

import java.awt.ColorModel;
import java.awt.image.BufferedImage;

/**
 * Example of using the `getRGB` method from the `ColorModel` class. This example creates a red square using the default sRGB color model.
 */
public class ColorModel_getRGB_Example {

    // Create a BufferedImage with the desired width, height, and type.
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    private static final int TYPE = BufferedImage.TYPE_INT_RGB;
    private static final Color RED_COLOR = new Color(255, 0, 0));

    public static void main(String[] args) {
        
        // Create a new ColorModel instance with the default sRGB color space.
        ColorModel colorModel = ColorModel.getDefaultColorModel();
        
        // Create a new BufferedImage instance with the desired width, height, and type.
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, TYPE));
        
        // Set all pixels in the image to the specified red color using the `setRGB` method from the `ColorModel` class.
        colorModel.getRGB(image, 0, 0, WIDTH, HEIGHT, ColorModel.OP_SET),
        
        // Print a message indicating that the image has been successfully created and displayed in a window.
        System.out.println("Image successfully created and displayed.");
        
    }
    
}