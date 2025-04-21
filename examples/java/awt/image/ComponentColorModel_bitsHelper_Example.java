package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ComponentColorModel;

/**
 * <p>A runnable Java code example using the `ComponentColorModel` class within a single Java file.</p>
 *
 * <p>This example creates a runnable Java program that uses the `ComponentColorModel` class to create an image with custom colors for each component. The output is a PNG image saved in the current directory.</p>
 */
public class ComponentColorModel_bitsHelper_Example {

    /**
     * <p>The entry point of the program.</p>
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        // Create a new instance of the ComponentColorModel class.
        ComponentColorModel colorModel = new ComponentColorModel();
        
        // Define the custom colors for each component.
        Color backgroundColor = new Color(50, 50, 50));
        Color borderColor = new Color(255, 255, 255));
        
        // Create a bits helper using the color model and defined colors.
        ComponentColorModel.BitsHelper bitsHelper = new ComponentColorModel.BitsHelper(colorModel, backgroundColor, borderColor));
        
        // Generate an image in PNG format using the bits helper.
        bitsHelper.save("output_image.png");
        
        System.out.println("Output image saved successfully at: " + System.getProperty("user.dir"))));
    }

}