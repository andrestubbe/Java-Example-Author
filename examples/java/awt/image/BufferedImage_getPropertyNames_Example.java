package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

/**
 * Example of getting property names from a BufferedImage object.
 */
public class BufferedImage_getPropertyNames_Example {

    public static void main(String[] args) {
        // Create an example BufferedImage
        BufferedImage bufferedImage = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB));

        // Get the property names of the BufferedImage object
        Set<String> propertyNames = getPropertyNames(bufferedImage);

        // Print the result
        System.out.println("BufferedImage Property Names: " + propertyNames);
    }

    /**
     * Method to get property names from a given BufferedImage object.
     * <p>
     * This implementation iterates over all the properties of the BufferedImage object, retrieves their names and stores them in a Set for uniqueness.
     * </p>
     * @param bufferedImage The BufferedImage object from which property names need to be retrieved.
     * @return Set<String> A set containing the unique names of all the properties of the given BufferedImage object.
     */
    private static Set<String> getPropertyNames(BufferedImage bufferedImage) {
        Set<String> propertyNames = new HashSet<>();

        // Iterate over all the properties of the BufferedImage object
        for (Object property : bufferedImage.getProperties()) {
            // Retrieve the name of the property
            String propertyName = property.getClass().getSimpleName();

            // Add the property name to the set
            propertyNames.add(propertyName);
        }

        return propertyNames;
    }
}