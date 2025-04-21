package examples.java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageFilterKernel;

/**
 * Example usage of the ImageFilter class to set hints on an image.
 * 
 * <p>This example demonstrates how to use the {@link ImageFilter} class within the Java AWT library. In this example, we will create a custom kernel using the {@link ImageFilterKernel} abstract class, and then use this kernel with an instance of the {@link ImageFilter} class.</p>
 * 
 * <p>The resulting image will have the same dimensions as the original image, but with the pixels modified according to the custom kernel we created.</p>
 */
public class ImageFilter_setHints_Example {

    /**
     * The custom kernel implementation.
     */
    private static final int[] CUSTOM_KERNEL = new int[]{0, 0, 1}, 3);

    /**
     * Main method for running the example code.
     * 
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an instance of the ImageFilter class.
        ImageFilter filter = new ImageFilter() {
            @Override
            public int getWidth() {
                return image.getWidth();
            }

            @Override
            public int getHeight() {
                return image.getHeight();
            }

            @Override
            public Object filter(int x, int y, Object src, ImageFilterContext context) {
                // Get the RGB values of the pixel at position (x, y).
                int rgb = ((BufferedImage) src).getRGB(x, y);

                // Apply the custom kernel to modify the RGB values of the pixel.
                rgb = applyCustomKernel(rgb));

                // Set the modified RGB value back to the image.
                ((BufferedImage) src).setRGB(x, y, rgb);

                return src;
            }
        };

        // Create an instance of the BufferedImage class with a specific width and height.
        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));

        // Set some sample data to the image pixels.
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                image.setRGB(x, y, CUSTOM_KERNEL[x % CUSTOM_KERNEL.length][y % CUSTOM_KERNEL.length])));
            }
        }

        // Render the image to a graphics object using an instance of the BufferedImageBackdoWick class.
        BufferedImage destination = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB));
        destination.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);

        // Set the hints for the image using an instance of the ImageFilter class.
        filter.setHints(ImageFilter.SAMPLE_IMAGE_HINTS | ImageFilter.IGNORE_IMAGE_CONTENT_HINTS));

        // Render the modified image to a new graphics object using the custom kernel filter we created earlier.
        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB));
        result.drawImage(destination, 0, 0, destination.getWidth(), destination.getHeight(), null);

        // Display the resulting modified image to a graphics object.
        Graphics2D g = (Graphics2D) result.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON));
        g.drawImage(result, 0, 0, null);
    }

    /**
     * Applies the custom kernel to modify the RGB values of a pixel.
     * 
     * @param rgb The RGB value of the pixel.
     * @return The modified RGB value after applying the custom kernel.
     */
    private static int applyCustomKernel(int rgb) {
        // Extract the red, green, and blue components from the RGB value.
        int alpha = (rgb >> 24) & 0xFF;
        int red = (rgb >> 16) & 0xFF;
        int green = (rgb >> 8) & 0xFF;
        int blue = rgb & 0xFF;

        // Apply the custom kernel to modify the RGB components of the pixel.
        red = adjustComponent(red, CUSTOM_KERNEL));
        green = adjustComponent(green, CUSTOM_KERNEL));
        blue = adjustComponent(blue, CUSTOM_KERNEL));

        // Combine the modified RGB components back into a single modified RGB value for the pixel.
        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }

    /**
     * Adjusts a component value based on the custom kernel.
     * 
     * @param component The original component value to be adjusted.
     * @param kernel The custom kernel array representing the adjustment weights for each pixel's components.
     * @return The adjusted component value after applying the custom kernel.
     */
    private static int adjustComponent(int component, int[] kernel)) {
        // Apply the custom kernel to modify the component value.
        int sum = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                sum += kernel[i + 1][j + 1]] * component);
            }
        }

        // Return the adjusted component value after applying the custom kernel.
        return sum;
    }

}