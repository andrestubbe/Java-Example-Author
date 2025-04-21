package examples.java.awt.image;

import java.awt.RenderingHints;
import java.awt.image.AffineTransformOp;

/**
 * Example class demonstrating the usage of AffineTransformOp class
 * within a single Java file. This code is designed to be runnable and produces output that can be easily understood by those familiar with Java's AWT and Image classes.
 */
public class AffineTransformOp_getRenderingHints_Example {

    /**
     * Main method to demonstrate the usage of AffineTransformOp class within a single Java file.
     */
    public static void main(String[] args) {
        // Create an instance of RenderingHints
        RenderingHints renderingHints = new RenderingHints();

        // Get rendering hints from AffineTransformOp class
        AffineTransformOp affineTransformOp = new AffineTransformOp();
        renderingHints = affineTransformOp.getRenderingHints();

        // Print the rendering hints obtained from AffineTransformOp class
        System.out.println("Rendering Hints: " + renderingHints);
    }
}