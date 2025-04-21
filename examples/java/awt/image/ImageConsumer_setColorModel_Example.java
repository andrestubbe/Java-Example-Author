package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

/**
 * This example demonstrates how to use the ImageConsumer class in Java AWT (Abstract Window Toolkit).
 * 
 * The purpose of this example is to demonstrate how to create an ImageConsumer object, set its ColorModel, and process image data using the ImageConsumer's methods: `setDimensions`, `setPixels`, and `errorOccurred`.
 */
public class ImageConsumer_setColorModel_Example implements ImageProducer {

    // Instance variables
    private ImageConsumer consumer;
    private int width;
    private int height;
    private Color[] colors;


    /**
     * Constructor for the ImageConsumer_setColorModel_Example class.
     */
    public ImageConsumer_setColorModel_Example() {
        // Initialize instance variables here
    }


    /**
     * This method is called by the ImageProducer object to request a new image be produced. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     * @param consumer The ImageConsumer object that will handle all subsequent requests until this object is reset or released.
     */
    @Override
    public void startProduction(ImageConsumer consumer) {
        this.consumer = consumer;

        // Request the image producer to set the ColorModel
        consumer.setColorModel(colorModel);
    }


    /**
     * This method is called by the ImageProducer object to request a new image be produced with specified dimensions. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     * @param width The width of the image to be produced in pixels.
     * @param height The height of the image to be produced in pixels.
     */
    @Override
    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;

        // Create an array for storing the colors
        colors = new Color[width * height];
    }


    /**
     * This method is called by the ImageProducer object to request a new image be produced with specified pixel values. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     * @param x The x-coordinate of the first pixel in pixels.
     * @param y The y-coordinate of the first pixel in pixels.
     * @param width The width of the image to be produced in pixels.
     * @param height The height of the image to be produced in pixels.
     * @param pixels An array of integers representing the RGB components of each pixel in the image. The length of this array must be equal to the product of the width and height of the image being produced.
     */
    @Override
    public void setPixels(int x, int y, int width, int height, int[] pixels) {
        // Loop through each pixel and store its RGB components in the colors array
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int index = (y + i) * width + x + j;
                colors[index] = new Color(pixels[index], pixels[index + 1], pixels[index + 2]));
            }
        }
    }


    /**
     * This method is called by the ImageProducer object to request an update of the image data. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     * @param width The width of the image to be produced in pixels.
     * @param height The height of the image to be produced in pixels.
     * @param pixels An array of integers representing the RGB components of each pixel in the image. The length of this array must be equal to the product of the width and height of the image being produced.
     */
    @Override
    public void flushPixels() {
        // Loop through each pixel in the colors array and set its RGB components using the Color class
        for (int i = 0; i < colors.length; i++) {
            Color color = new Color(colors[i].getRGB()));
            pixels[i] = color.getRed();
            pixels[i + 1] = color.getGreen();
            pixels[i + 2] = color.getBlue();
        }

        // Request the image producer to process the updated image data
        consumer.setPixels(x, y, width, height, pixels));
    }


    /**
     * This method is called by the ImageProducer object to request an update of the image data with a new set of dimensions. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     * @param width The width of the image to be produced in pixels.
     * @param height The height of the image to be produced in pixels.
     */
    @Override
    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;

        // Request the image producer to reset and release its resources
        consumer.reset();

        // Initialize a new ImageConsumer object
        consumer = new ImageConsumer() {
            // Implement any additional functionality here if needed
        };

        // Call the setDimensions method of the ImageConsumer object to request an update of the image dimensions
        consumer.setDimensions(width, height);
    }


    /**
     * This method is called by the ImageProducer object to indicate that an error occurred during the processing of image data. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     * @param message A string describing the error that occurred.
     */
    @Override
    public void errorOccurred(String message) {
        // Handle the error here if needed

        // Request the image producer to reset and release its resources
        consumer.reset();
    }


    /**
     * This method is called by the ImageProducer object to indicate that it has finished producing an image. The ImageConsumer object passed as an argument will handle all subsequent requests until this object is reset or released.
     */
    @Override
    public void imageComplete(boolean isOK) {
        // Handle the completion of the image here if needed

        // Request the image producer to reset and release its resources
        consumer.reset();
    }


    /**
     * This method returns a ColorModel object representing the color model used by this ImageConsumer object. The implementation of this method should create a new ColorModel object with the desired color space and components, and return it.
     * @return A ColorModel object representing the color model used by this ImageConsumer object.
     */
    private ColorModel colorModel;

    public ColorModel getColorModel() {
        if (colorModel == null) {
            // Create a new ColorModel object with the desired color space and components
            colorModel = new DirectColorModel(32, 0x000000FF, 0x0000FF00, 0x00FF0000));
        }

        return colorModel;
    }


    /**
     * This method sets the ColorModel object used by this ImageConsumer object. The implementation of this method should set the instance variable colorModel to the provided ColorModel object and perform any additional necessary initialization or configuration.
     * @param colorModel A ColorModel object representing the desired color model for this ImageConsumer object.
     */
    public void setColorModel(ColorModel colorModel) {
        this.colorModel = colorModel;

        // Perform any additional necessary initialization or configuration here if needed
    }
}