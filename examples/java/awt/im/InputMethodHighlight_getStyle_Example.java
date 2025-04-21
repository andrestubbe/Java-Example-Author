package examples.java.awt.im;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * This example demonstrates how to create a runnable Java code block using the {@code InputMethodHighlight} class within the single Java file. The code must be runnable and is formatted according to the given instructions. This example creates a simple animation of a cursor moving on the screen.
 */
public class InputMethodHighlight_getStyle_Example implements Runnable {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private BufferedImage image;
    private boolean running;

    public InputMethodHighlight_getStyle_Example() {
        this.image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));
        this.running = false;
    }

    @Override
    public void run() {
        this.running = true;
        while (this.running) {
            // Update the image with the cursor position
            int x = (int) (Math.random() * WIDTH));
            int y = (int) (Math.random() * HEIGHT));
            Graphics2D g2d = this.image.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON)));
            g2d.fillRect(x - 5, y - 5, 10, 10));
            g2d.dispose();

            // Show the image for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Clear the image from the screen
            this.image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));
        }
    }

    public static void main(String[] args) {
        InputMethodHighlight_getStyle_Example example = new InputMethodHighlight_getStyle_Example();
        Thread thread = new Thread(example);
        thread.start();
    }
}