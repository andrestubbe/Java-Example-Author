package examples.java.awt.image;

import java.awt.image.ImageConsumer;
import java.awt.image.ImageInputSeeker;
import java.io.InputStream;

/**
 * This class demonstrates the usage of the ImageConsumer
 * class within a single Java file. The code is designed to be runnable and it creates an example that sets pixels using an input stream.
 */
public class ImageConsumer_setPixels_Example implements ImageInputSeeker {

    // Declare variables
    private ImageConsumer imageConsumer;
    private int width;
    private int height;
    private InputStream inputStream;


    /**
     * Constructor for the example. It initializes the 
     * necessary objects and sets up the input stream 
     * from which the pixels will be retrieved.
     */
    public ImageConsumer_setPixels_Example(int width, int height, InputStream inputStream) {
        this.width = width;
        this.height = height;
        this.imageConsumer = new ImageConsumer() {
            @Override
            public void imageComplete(boolean isFinal) {
                // Handle final completion of the image
            }

            @Override
            public void setImageDimension(int imageWidth, int imageHeight) {
                // Set the image dimensions
            }

            @Override
            public void setImageProgress(float percentage) {
                // Set the image progress
            }
        };
        this.inputStream = inputStream;
    }

    /**
     * This method sets pixels in the image using 
     * an input stream from which the pixels will be retrieved.
     */
    @Override
    public void seek(long pos) {
        try {
            // Set the position of the input stream
            inputStream.seek(pos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method retrieves pixels from an image 
     * and sets them in the consumer passed as a parameter.
     */
    public void setPixels(ImageConsumer imageConsumer) {
        // Set the consumer for setting pixels
        imageConsumer = this.imageConsumer;
        
        // Create a buffer to hold the pixel data retrieved from the input stream
        byte[] buffer = new byte[width * height * 4];
        try {
            // Read bytes into the buffer and then convert them to pixels using the ImageConsumer's methods
            inputStream.read(buffer);
            int startIndex = 0;
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    // Convert bytes to pixels and set them in the consumer
                    imageConsumer.setPixels(row, col, getRGBFromBytes(buffer, startIndex), 1);
                    startIndex += 4;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method retrieves the RGB values from a byte array that represents pixels. 
     * @param bytes The byte array containing pixel data.
     * @param startIndex The starting index within the byte array to retrieve the pixel data.
     * @return An integer value representing the RGB values retrieved from the byte array.
     */
    private int getRGBFromBytes(byte[] bytes, int startIndex) {
        int red = bytes[startIndex] & 0xFF;
        int green = bytes[startIndex + 1] & 0xFF;
        int blue = bytes[startIndex + 2] & 0xFF;
        return (red << 16) | (green << 8) | blue;
    }
}