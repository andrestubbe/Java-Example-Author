package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;

public class AffineTransformOp_getTransform_Example {

    /**
     * This example demonstrates the usage of 
     * the `AffineTransformOp` class within a single Java file.
     * The code is written in such a way that it becomes visible in action.
     */

    public static void main(String[] args) {
        
        // Create an instance of AffineTransformOp
        AffineTransformOp affineTransformOp = new AffineTransformOp();

        // Get the transform object
        java.awt.geom.AffineTransform transform = affineTransformOp.getTransform();

        System.out.println("AffineTransformOp Example successful!");

    }

}