package examples.java.awt.image;

import java.awt.image.AreaAveragingScaleFilter;

/**
 * This class demonstrates how to use the AreaAveragingScaleFilter class in Java's AWT package.
 * The example uses this filter to accumulate pixels in an image and then scales down the accumulated pixels by a factor of two, resulting in each pixel being represented by four times the original value.
 */
public class AreaAveragingScaleFilter_accumPixels_Example {

    /**
     * This method creates an instance of the AreaAveragingScaleFilter class with default parameters and then uses this filter to accumulate pixels in an image.
     * The resulting pixel values are scaled down by a factor of two using the scale() method inherited from the BufferedImageRenderingAdapter superclass.
     * @param image the image to apply the filter on
     * @return the filtered image with scaled down accumulated pixels
     */
    public AreaAveragingScaleFilter accumulatePixels(BufferedImage image) {
        // Create an instance of the AreaAveragingScaleFilter class
        AreaAveragingScaleFilter scaleFilter = new AreaAveragingScaleFilter();

        // Set the width and height parameters of the filter to half of the original image dimensions
        scaleFilter.setWidth(image.getWidth() / 2));
        scaleFilter.setHeight(image.getHeight() / 2));

        // Create a new BufferedImage with the same color model as the original image and with a width and height twice that of the original image
        BufferedImage filteredImage = new BufferedImage(image.getColorModel(), null, true);

        // Apply the filter on the original image to accumulate pixels in the filtered image
        scaleFilter.filter(image, filteredImage);

        return scaleFilter;
    }

}