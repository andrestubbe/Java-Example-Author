package examples.java.awt.image;

import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;

/**
 * This example demonstrates how to use the `AffineTransformOp` class to transform a point using an affine transformation matrix.
 */
public class AffineTransformOp_getPoint2D_Example {

    public static void main(String[] args) {
        // Create an instance of Point2D representing a source point
        Point2D srcPt = new Point2D.Double(50, 50);

        // Create an instance of AffineTransformOp to perform the transformation
        AffineTransformOp affineTransformOp = new AffineTransformOp();

        // Set the transformation matrix using AffineTransformOp's setToXform method
        affineTransformOp.setToXform(1.5, 2.0, 0.0, 0.0));

        // Perform the transformation on the source point using AffineTransformOp's transform method
        Point2D transformedPt = affineTransformOp.transform(srcPt);

        // Print the original and transformed points
        System.out.println("Original Point: (" + srcPt.getX() + ", " + srcPt.getY() + ")"));
        System.out.println("Transformed Point: (" + transformedPt.getX() + ", " + transformedPt.getY() + ")"));
    }

}