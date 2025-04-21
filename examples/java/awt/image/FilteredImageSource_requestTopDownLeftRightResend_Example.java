package examples.java.awt.image;

import java.awt.image.FilteredImageSource;

/**
 * This class provides an example of how to use the FilteredImageSource class in Java. The purpose of this example is to demonstrate how to create a custom filter and apply it to an image using the FilteredImageSource class. This example specifically focuses on creating a top-down, left-right, resend filter for filtering an image source.
 *
 * @see java.awt.image.FilteredImageSource#createFilter(int, int, int, int))
 */
public class FilteredImageSource_requestTopDownLeftRightResend_Example {

    /**
     * This method creates a custom filter that implements the top-down, left-right, resend filter algorithm. The created filter is then applied to an image source using the FilteredImageSource class.
     *
     * @param width      the width of the image source
     * @param height     the height of the image source
     * @param x            the x coordinate where the filter should start
     * @param y            the y coordinate where the filter should start
     * @return the created custom filter that implements the specified filter algorithm.
     */
    public static java.awt.image.ImageFilter createCustomFilter(int width, int height, int x, int y) {

        // Create a new instance of the BufferedImageFilter class
        java.awt.image.BufferedImageFilter customFilter = new FilteredImageSource_requestTopDownLeftRightResend_Example();

        // Set the filter properties (such as width, height, x, y))
        customFilter.setFilterProperties(width, height, x, y));

        return customFilter;
    }
}