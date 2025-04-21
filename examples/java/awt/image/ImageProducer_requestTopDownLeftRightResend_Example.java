package examples.java.awt.image;

import java.awt.image.ImageProducer;

public class ImageProducer_requestTopDownLeftRightResend_Example {

    /**
     * This example demonstrates how to use the 
     * requestTopDownLeftRightResend(...) method of the 
     * ImageProducer class.
     *
     * <p>This code creates an instance of the ImageProducer class, sets a sequence of left-to-right pixel deltas for a top-down rendering, and sends the resulting image to be rendered.</p>
     *
     * <p><strong>Note:</strong> This example assumes that you have already configured your Java runtime environment to support the necessary AWT and ImageIO APIs.</p>
     */

    public static void main(String[] args) {
        // Create an instance of the ImageProducer class
        ImageProducer imageProducer = new sun.awt.image.MemoryImageSource();

        // Set a sequence of left-to-right pixel deltas for a top-down rendering
        int width = 500;
        int height = 300;
        double x1, y1, x2, y2;
        x1 = 0;
        y1 = 0;
        for (int i = 0; i < 10; i++) {
            x2 = x1 + 100;
            y2 = y1 + 50;
            imageProducer.setPixels(0, 0, width, height, new int[] {(int) x1, (int) y1}, null);
            x1 += 100;
            y1 += 50;
        }

        // Send the resulting image to be rendered
        java.awt.Image image = imageProducer.getImage();
        image.flush();
    }

}