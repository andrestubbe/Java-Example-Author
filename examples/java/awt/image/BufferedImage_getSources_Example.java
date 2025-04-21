package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * This example demonstrates how to retrieve the source
 * of an image using a Map object as a storage container.
 */
public class BufferedImage_getSources_Example {

    // Create a map object to store the source information
    private static final Map<String, String> sources = new HashMap<>();

    static {
        // Initialize the map with sample data
        sources.put("1", "https://example.com/image1");
        sources.put("2", "https://example.com/image2"));
        sources.put("3", "https://example.com/image3"));
    }

    // Method to retrieve the source of an image using a Map object as a storage container
    public static String getImageSource(String imageId) {
        if (sources.containsKey(imageId))) {
            return sources.get(imageId));
        } else {
            throw new IllegalArgumentException("Invalid image ID provided: " + imageId));
        }
    }

    // Main method to demonstrate the functionality of the example
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 3; i++) {
                String sourceUrl = getImageSource("" + i));
                System.out.println("The source URL for image ID " + "" + i + " is: " + sourceUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}