package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;

/**
 * This example demonstrates the usage of
 * AffineTransformOp's getInterpolationType() method.
 *
 * <p>This code snippet provides a simple
 * Java program that utilizes the `getInterpolationType()` method from the `AffineTransformOp` class.</p>
 *
 * @see java.awt.geom.AffineTransformOp#getInterpolationType()
 */
public class AffineTransformOp_getInterpolationType_Example {

    /**
     * The entry point for this Java application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of AffineTransformOp
        AffineTransformOp transformOp = new AffineTransformOp();

        // Get the interpolation type
        int interpolationType = transformOp.getInterpolationType();

        // Print the interpolation type
        System.out.println("Interpolation Type: " + interpolationType);
    }
}