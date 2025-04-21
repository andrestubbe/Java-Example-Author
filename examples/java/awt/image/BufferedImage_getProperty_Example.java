package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.Properties;

/**
 * This example demonstrates how to retrieve a specific property from a BufferedImage object. The getProperty() method allows you to retrieve a specific property, such as the image width or height. In this example, we will demonstrate how to retrieve the "user-defined" property that we have set for our BufferedImage object.
 *
 * @see java.awt.image.BufferedImage#getProperties()
 */
public class BufferedImage_getProperty_Example {

    public static final String IMAGE_PROPERTY = "image-property";

    public static void main(String[] args) {
        // Create a new BufferedImage object with the specified width and height.
        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));

        // Set the "user-defined" property for our BufferedImage object.
        image.getProperties().setProperty(IMAGE_PROPERTY, "Example Property Value"));

        // Retrieve the value of the "user-defined" property that we have set for our BufferedImage object.
        String imagePropertyValue = image.getProperties().getProperty(IMAGE_PROPERTY));

        // Print the retrieved property value to the console.
        System.out.println("Retrieved Image Property Value: " + imagePropertyValue));
    }
}