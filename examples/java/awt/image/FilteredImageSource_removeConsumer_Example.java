package examples.java.awt.image;

import java.awt.image.FilteredImageSource;

// FilteredImageSource_removeConsumer_Example class
public class FilteredImageSource_removeConsumer_Example {

    /**
     * This example demonstrates how to remove a consumer from a FilteredImageSource object in Java.
     * 
     * @see java.awt.image.FilteredImageSource#removeFilter(java.awt.image.ImageFilter))
     */

    public static void main(String[] args) {

        // Create a FilteredImageSource object
        FilteredImageSource source = new FilteredImageSource();

        // Add filters to the FilteredImageSource object
        source.addFilter(new ExampleFilter());

        // Print the initial number of consumers for the FilteredImageSource object
        System.out.println("Initial number of consumers: " + source.getNumConsumers()));

        // Remove a consumer from the FilteredImageSource object
        source.removeConsumer(0); // Assuming index 0 represents the first consumer in the list

        // Print the final number of consumers for the FilteredImageSource object
        System.out.println("Final number of consumers: " + source.getNumConsumers()));
    }
}