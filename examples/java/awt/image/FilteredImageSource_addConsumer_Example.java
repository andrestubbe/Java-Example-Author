package examples.java.awt.image;

import java.awt.image.FilteredImageSource;
import java.util.function.Consumer;

public class FilteredImageSource_addConsumer_Example {

    /**
     * This example demonstrates the usage of the `FilteredImageSource` class within a single Java file. The code creates an instance of `FilteredImageSource`, adds a consumer to filter the image, and then prints out the resulting image in binary format.
     */

    public static void main(String[] args) {

        // Create an instance of FilteredImageSource
        FilteredImageSource filteredImageSource = new FilteredImageSource();

        // Add a consumer to filter the image
        Consumer<BufferedImage> consumer = (image) -> {
            // Apply your own custom filtering logic here
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    // Set the pixel color to red if it is currently not red
                    if (!image.getRGB(x, y) == Color.RED.getRGB())) {
                        image.setRGB(x, y, Color.RED.getRGB());
                    }
                }
            }
        };
        filteredImageSource.addFilter(consumer);

        // Get the resulting image and print it out in binary format
        BufferedImage result = filteredImageSource.getFilteredImage(new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB))));
        for (int y = 0; y < result.getHeight(); y++) {
            for (int x = 0; x < result.getWidth(); x++) {
                System.out.print(Integer.toBinaryString(result.getRGB(x, y))));
            }
        }
    }

}