package examples.java.awt.image;

import java.awt.RenderingHints;
import java.awt.image.BufferedImageOp;

public class BufferedImageOp_getRenderingHints_Example {

    /**
     * This example demonstrates the use of the 
     * `BufferedImageOp` class within a single Java file.
     * The code is designed to be runnable and can be used as a starting point for further experimentation with the `BufferedImageOp` class.
     */

    public static void main(String[] args) {

        // Create an instance of the BufferedImageOp class
        BufferedImageOp imageOp = new BufferedImageOp();

        // Get rendering hints
        RenderingHints renderingHints = imageOp.getRenderingHints();

        // Print rendering hints
        System.out.println("Rendering Hints: " + renderingHints);

    }

}