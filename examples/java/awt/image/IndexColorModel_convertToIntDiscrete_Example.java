package examples.java.awt.image;

import java.awt.color.IndexColorModel;
import java.awt.image.ComponentTransferOp;
import java.awt.image.RenderedImage;
import java.util.Random;

/**
 * <p>Example code that demonstrates how to use the `IndexColorModel` class within a single Java file.</p>
 * 
 * <p>This example specifically focuses on creating an instance of the `IndexColorModel` class and then applying a random color conversion to it using the `ComponentTransferOp` class.</p>
 * 
 * <p>The resulting image will be displayed with each pixel having a randomly assigned index value from 0 to 255. This process is repeated multiple times in order to generate an animated sequence of images, each with its own unique set of index values for the pixels.</p>
 */
public class IndexColorModel_convertToIntDiscrete_Example {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_FRAMES = 10;

    public static void main(String[] args) throws Exception {
        
        // Create an instance of the IndexColorModel class
        IndexColorModel colorModel = new IndexColorModel(false, 256));

        // Create a RenderedImage object to hold the resulting image
        RenderedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        // Set up an instance of the ComponentTransferOp class
        ComponentTransferOp transferOp = new ComponentTransferOp();
        transferOp.setType(ComponentTransferOp.TYPE_INT_DISCRETE));

        // Create a Random object to generate random index values for the pixels
        Random rand = new Random();

        // Generate an animated sequence of images, each with its own unique set of index values for the pixels
        for (int i = 0; i < NUM_FRAMES; i++) {

            // Set up the transformation operation to be applied to the image
            transferOp.setName("Random Color Conversion " + i));
            float red = rand.nextFloat() * 256;
            float green = rand.nextFloat() * 256;
            float blue = rand.nextFloat() * 256;
            transferOp.setCoefficients(new float[]{red, 0, 0}, new float[]{0, green, 0}, new float[]{0, 0, blue})));

            // Apply the transformation operation to the image
            image = transferOp.filter(image, null));

            // Save the resulting image as a PNG file
            javax.imageio.ImageIO.write(image, "png", null));

        }
    }
}