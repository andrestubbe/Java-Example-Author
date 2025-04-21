package examples.java.awt.image;

import java.awt.image.FilteredImageSource;

public class FilteredImageSource_isConsumer_Example {

    /**
     * This example demonstrates how to use the `FilteredImageSource` class in Java's AWT package. The purpose of this code is to demonstrate how to utilize the `isConsumer()` method provided by the `FilteredImageSource` class.
     *
     * @see java.awt.image.FilteredImageSource#isConsumer()
     */

    public static void main(String[] args) {
        // Create an instance of FilteredImageSource
        FilteredImageSource filteredImageSource = new FilteredImageSource();

        // Call isConsumer method
        boolean result = filteredImageSource.isConsumer();

        // Print out the result
        System.out.println("The result of calling the isConsumer() method on an instance of FilteredImageSource is: " + result);
    }

}