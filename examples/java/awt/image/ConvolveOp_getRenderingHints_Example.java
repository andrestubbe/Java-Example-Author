package examples.java.awt.image;

import java.awt.RenderingHints;
import java.awt.image.ConvolveOp;

/**
 * <p>Example of using the `ConvolveOp` class within a single Java file.</p>
 * 
 * <p>This code demonstrates how to use the `getRenderingHints()` method from the `ConvolveOp` class. This method returns an instance of the `RenderingHints` class, which contains various rendering hints.</p>
 * 
 * <p>In this example, we create a new `ConvolveOp` object with specified filters and convolution matrix. Then, we call the `getRenderingHints()` method on the `ConvolveOp` object to get an instance of the `RenderingHints` class.</p>
 * 
 * <p>Finally, we print out the rendering hints returned by the `getRenderingHints()` method.</p>
 */
public class ConvolveOp_getRenderingHints_Example {

    // Create a new instance of the ConvolveOp class with specified filters and convolution matrix
    private static final ConvolveOp CONVOLVE_OP = new ConvolveOp(new int[][]{{1, 2, 1}, {2, 4, 2}, {1, 2, 1}});

    public static void main(String[] args) {
        // Get the rendering hints from the ConvolveOp object
        RenderingHints renderingHints = CONVOLVE_OP.getRenderingHints();

        // Print out the rendering hints
        System.out.println("Rendering Hints: " + renderingHints);
    }
}