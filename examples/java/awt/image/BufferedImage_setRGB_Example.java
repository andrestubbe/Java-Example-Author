package examples.java.awt.image;

import java.awt.image.BufferedImage;

/**
 * <p>This program demonstrates how to set an RGB pixel color using the BufferedImage class.</p>
 * 
 * <p>The code creates a new BufferedImage with a width and height of 500 pixels, and an ARGB channel type.</p>
 * 
 * <p>Then, the code sets the RGB pixel color at coordinates (250, 250) to the specified red, green, and blue values.</p>
 * 
 * <p>Finally, the code prints out a message displaying the details of the set RGB pixel color operation.</p>
 */
public class BufferedImage_setRGB_Example {

    public static void main(String[] args) {
        
        // Create a new BufferedImage with 500x500 pixels and an ARGB channel type
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB));
        
        // Set the RGB pixel color at coordinates (250, 250) to red, green, and blue values of 255, 0, 0 respectively
        image.setRGB(249, 249, Color.RED.getRGB());
        image.setRGB(249, 249, Color.GREEN.getRGB()));
        image.setRGB(249, 249, Color.BLUE.getRGB()));

        // Print out a message displaying the details of the set RGB pixel color operation
        System.out.println("The BufferedImage has been updated with a set RGB pixel color operation.");
    }
}