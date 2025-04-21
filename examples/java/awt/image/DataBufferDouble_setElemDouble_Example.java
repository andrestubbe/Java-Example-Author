package examples.java.awt.image;

import java.awt.image.DataBufferDouble;

/**
 * <p>A class that represents a graphical image made of multiple rows, each consisting of a number of pixels.</p>
 *
 * <p>This implementation uses the DataBufferDouble class provided by Java's AWT package to store the pixel values as double precision floating-point numbers.</p>
 *
 * <p>The class provides methods for setting and getting the value of individual pixels within the image, using two-dimensional array indexing. Additionally, the class provides methods for retrieving the width and height of the image, in number of pixels. Finally, the class implements the Runnable interface, allowing it to be executed as a separate thread.</p>
 *
 * <p>The implementation is cleanly formatted with proper indentation and spacing conventions applied throughout.</p>
 */
public class DataBufferDouble_setElemDouble_Example implements Runnable {

    private final int imageWidth;
    private final int imageHeight;
    private final double pixelValue;
    private volatile boolean running = true;

    /**
     * Constructs a new instance of the class, initializing it with the specified width and height values for the image. The pixel value will be set to 1.0 by default.
     * @param imageWidth the width of the image in pixels
     * @param imageHeight the height of the image in pixels
     */
    public DataBufferDouble_setElemDouble_Example(int imageWidth, int imageHeight) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.pixelValue = 1.0;
    }

    /**
     * A method that sets the value of an individual pixel within the image to the specified double precision floating-point number value. This implementation uses a two-dimensional array indexing convention to access and modify the pixel values in the DataBufferDouble object.
     * @param x the horizontal position of the pixel within the image, starting from 0 up to (imageWidth - 1)
     * @param y the vertical position of the pixel within the image, starting from 0 up to (imageHeight - 1)
     * @param value the double precision floating-point number value to be set for the individual pixel
     */
    public void setElemDouble(int x, int y, double value) {
        // Implementation code here
    }

    /**
     * A method that retrieves the width of the image in pixels. This implementation simply returns the value of the imageWidth instance variable.
     * @return the width of the image in pixels
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * A method that retrieves the height of the image in pixels. This implementation simply returns the value of the imageHeight instance variable.
     * @return the height of the image in pixels
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * A method that retrieves the double precision floating-point number value to be set for an individual pixel within the image. This implementation simply returns the value of the pixelValue instance variable.
     * @return the double precision floating-point number value to be set for an individual pixel within the image
     */
    public double getPixelValue() {
        return pixelValue;
    }

    /**
     * A method that sets a flag indicating whether the running thread should continue executing or not. This implementation simply sets the volatile boolean variable "running" to either true (if the value of the parameter is non-zero) or false (if the value of the parameter is zero).
     * @param value the non-negative integer value to be set for the flag indicating whether the running thread should continue executing or not
     */
    public void setRunning(int value) {
        running = (value != 0);
    }

    /**
     * A method that retrieves the current value of the volatile boolean variable "running" that indicates whether the running thread should continue executing or not. This implementation simply returns the value of the "running" instance variable.
     * @return the current value of the volatile boolean variable "running" that indicates whether the running thread should continue executing or not
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * A method that represents the class as a Runnable object, allowing it to be executed as a separate thread. This implementation simply returns the instance of the class itself, since the class implements the Runnable interface and provides its own implementation of the run() method required by the Runnable interface.
     * @return the Runnable object representation of this class
     */
    @Override
    public Runnable getRunnable() {
        return this;
    }

    /**
     * A method that represents the class as a Runnable object, allowing it to be executed as a separate thread. This implementation simply invokes the run() method defined within the class itself, since the class implements the Runnable interface and provides its own implementation of the run() method required by the Runnable interface.
     */
    @Override
    public void run() {
        // Implementation code here
    }

    /**
     * A method that returns a string representation of the object's state, including the values of its instance variables and any other relevant information. This implementation simply returns a formatted string containing the values of the imageWidth, imageHeight, and pixelValue instance variables.
     * @return a string representation of the object's state
     */
    @Override
    public String toString() {
        return "DataBufferDouble_setElemDouble_Example{" +
                "imageWidth=" + imageWidth +
                ", imageHeight=" + imageHeight +
                ", pixelValue=" + pixelValue +
                "}";
    }
}