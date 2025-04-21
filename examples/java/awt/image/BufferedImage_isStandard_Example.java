package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A class that demonstrates how to use the BufferedImage class to check if an image is standard or not. This example reads an image file and converts it into a BufferedImage object. Then, this program checks if the width of the image is equal to its height (which means it's a square). If the condition is met, the program writes "The image is standard." Otherwise, it writes "The image is not standard."
 * 
 * This example can be used as a learning tool for understanding how to work with BufferedImage objects in Java. It provides an example of how to use the BufferedImage class to check if an image is standard or not.
 */
public class BufferedImage_isStandard_Example {

    /**
     * This method reads an image file and converts it into a BufferedImage object. Then, this program checks if the width of the image is equal to its height (which means it's a square)). If the condition is met, the program writes "The image is standard." Otherwise, it writes "The image is not standard."
     * 
     * @param fileName The name of the image file to be read and converted into a BufferedImage object.
     * @return String This method returns a string that indicates whether or not the image is standard.
     * @throws Exception If there are any errors while reading the image file or performing any other operations on it.
     */
    public static String checkIfStandard(String fileName) throws Exception {

        // Read the image file and convert it into a BufferedImage object.
        BufferedImage image = ImageIO.read(new File(fileName)));

        // Check if the width of the image is equal to its height (which means it's a square)).
        boolean isStandard = image.getWidth() == image.getHeight();

        // Return a string that indicates whether or not the image is standard.
        return "The image is " + (isStandard ? "" : "not ") + "standard.";

    }

}