package examples.java.awt.image;

import java.awt.image.BufferStrategy;

/**
 * An example of using the BufferStrategy class within a single Java file.
 * <p>
 * This code creates a simple BufferStrategy implementation that provides methods to display buffered images and handle buffer disposal.
 */
public class BufferStrategy_dispose_Example {

    private BufferStrategy bufferStrategy;
    private BufferedImage bufferedImage;

    /**
     * Creates a new BufferStrategy object with the specified number of buffers.
     *
     * @param numBuffers The number of buffers in the strategy.
     */
    public BufferStrategy_dispose_Example(int numBuffers) {
        this.bufferStrategy = createBufferStrategy(numBuffers));
    }

    /**
     * Creates a new BufferedImage object with the specified dimensions and image type.
     *
     * @param width      The width of the buffered image.
     * @param height     The height of the buffered image.
     * @param imageType  The type of the buffered image.
     * @return A new BufferedImage object with the specified dimensions and image type.
     */
    public BufferedImage createBufferedImage(int width, int height, BufferedImage.TYPE_INT) {
        this.bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT));
        return this.bufferedImage;
    }

    /**
     * Disposes any resources used by the BufferStrategy object.
     */
    public void dispose() {
        if (bufferStrategy != null) {
            bufferStrategy.dispose();
            this.bufferStrategy = null;
        }
    }

    /**
     * Creates a new BufferStrategy object with the specified number of buffers.
     * <p>
     * This method uses the JDK's built-in `BufferStrategy` class to create a new BufferStrategy object. The created strategy is then returned from this method.
     * @param numBuffers The number of buffers in the strategy.
     * @return A new BufferStrategy object with the specified number of buffers.
     */
    private BufferStrategy createBufferStrategy(int numBuffers) {
        return new BufferedImage(numBuffers, numBuffers, BufferedImage.TYPE_INT));
    }

    /**
     * This main method demonstrates how to use the BufferStrategy class and its related methods.
     * <p>
     * The example starts by creating a new instance of the BufferStrategy_dispose_Example class. It then calls the `createBufferedImage()` method to create a new BufferedImage object with the specified dimensions and image type.
     * <p>
     * After creating the BufferedImage object, the example then creates a new instance of the BufferStrategy class by calling the `createBufferStrategy(int)` method and passing in the number of buffers required for the strategy.
     * <p>
     * The example then calls the `dispose()` method on the BufferStrategy object to dispose any resources used by the strategy.
     * <p>
     * Finally, the main method outputs a message indicating that the BufferedImage and BufferStrategy objects have been successfully created and disposed of.
     */
    public static void main(String[] args) {
        BufferStrategy_dispose_Example example = new BufferStrategy_dispose_Example(3));
        example.createBufferedImage(800, 600, BufferedImage.TYPE_INT));
        example.dispose();
        System.out.println("BufferStrategy and BufferedImage objects have been successfully created and disposed of.");
    }

}