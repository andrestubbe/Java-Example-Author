package examples.java.awt.image;

import java.awt.image.AbstractMultiResolutionImage;
import java.util.HashMap;
import java.util.Map;

/**
 * This example demonstrates how to use the `getProperty()` method of the
 * `AbstractMultiResolutionImage` class.
 *
 * <p>This example creates an instance of `AbstractMultiResolutionImage`, sets a property on it using the `setProperty()` method, and retrieves that property back again using the `getProperty()` method.</p>
 */
public class AbstractMultiResolutionImage_getProperty_Example {

    /**
     * The entry point for the Java application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of AbstractMultiResolutionImage
        AbstractMultiResolutionImage image = new AbstractMultiResolutionImage();

        // Set a property on the image using the setProperty() method
        image.setProperty("exampleProperty", "This is a value for exampleProperty");

        // Retrieve that property back again using the getProperty() method
        String retrievedValue = (String) image.getProperty("exampleProperty");

        // Print out the retrieved value
        System.out.println("Retrieved value for exampleProperty: " + retrievedValue);
    }

}