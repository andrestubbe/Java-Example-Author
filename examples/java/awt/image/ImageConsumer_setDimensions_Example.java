package examples.java.awt.image;

import java.awt.image.ImageConsumer;
import java.awt.image.ImageInputStream;

/**
 * Example class that demonstrates setting the dimensions of an image using the ImageConsumer class.
 * <p>
 * This example specifically focuses on setting the dimensions of an image, without actually decoding or processing the image data itself.
 */
public class ImageConsumer_setDimensions_Example {

    // Inline comment explaining what this method does
    /**
     * Sets the desired image width and height dimensions for a given image file.
     * <p>
     * This implementation utilizes the AWT's ImageConsumer class, which provides a framework for reading an image file asynchronously.
     * <p>
     * By using this approach, we can achieve our goal of setting the dimensions of an image without actually decoding or processing the image data itself.
     * <p>
     * This implementation specifically focuses on setting the dimensions of an image by leveraging the AWT's ImageConsumer class.
     */
    public static void setDimensions(String imageFile, int width, int height) {
        // Create a new ImageInputStream object for reading the image file asynchronously
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(new File(imageFile))));

        // Set up an ImageConsumer instance that will handle the decoded image data
        ImageConsumer imageConsumer = new ImageConsumer() {
            @Override
            public void imageComplete(boolean isError) {
                if (!isError) {
                    // Get the width and height of the decoded image
                    int actualWidth = ((BufferedImage)image).getWidth();
                    int actualHeight = ((BufferedImage)image).getHeight();

                    // Check if the requested dimensions match the actual dimensions of the decoded image
                    if (actualWidth == width && actualHeight == height)) {
                        System.out.println("Image dimensions successfully set to: " + width + "x" + height);
                    } else {
                        System.err.println("Error setting image dimensions to: " + width + "x" + height + ". Actual dimensions are: " + actualWidth + "x" + actualHeight);
                    }
                }
            }
        };

        // Associate the ImageConsumer instance with the ImageInputStream object
        imageInputStream.addImageEventListener(imageConsumer));

        // Dispose of the ImageInputStream object to release any associated resources
        imageInputStream.dispose();
    }
}