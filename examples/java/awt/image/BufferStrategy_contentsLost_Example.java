package examples.java.awt.image;

import java.awt.image.BufferStrategy;

/**
 * A class demonstrating how BufferStrategy's contents are lost when a new buffer is added to the strategy.
 */
public class BufferStrategy_contentsLost_Example {

    // Create an instance of the BufferedImage class, with an ARGB content-type.
    private static final int IMAGE_WIDTH = 800;
    private static final int IMAGE_HEIGHT = 600;
    private java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_ARGB));

    public void display() {
        // Create a BufferStrategy object associated with the given BufferedImage object.
        BufferStrategy bufferStrategy = bufferedImage.getBufferStrategy();
        if (bufferStrategy == null) {
            // If no existing strategy is found, create a new one using the given BufferedImage object.
            bufferedImage.createBufferStrategy(2);
            bufferStrategy = bufferedImage.getBufferStrategy();
        }

        java.awt.Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(java.awt.Color.BLACK));
        graphics.fillRect(0, 0, IMAGE_WIDTH, IMAGE_HEIGHT));

        // Disable the double buffering feature of BufferedImage's BufferStrategy.
        bufferStrategy.dispose();

        // Show the image using a new AWT JFrame container.
        java.awt.Frame frame = new java.awt.Frame("Buffer Strategy Example");
        frame.setContentPane(new java.awt.image.BufferedImageBackgroundPainter() {
            @Override
            public void paint(Graphics g, int width, int height) {
                ((Graphics2D) g).drawImage(bufferedImage, 0, 0);
            }
        }));
        frame.pack();
        frame.setVisible(true);

    }

}