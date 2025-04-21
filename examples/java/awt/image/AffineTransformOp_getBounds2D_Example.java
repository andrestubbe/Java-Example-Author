package examples.java.awt.image;

import java.awt.geom.AffineTransformOp;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class AffineTransformOp_getBounds2D_Example {

    /**
     * This example demonstrates the usage of 
     * the `AffineTransformOp` class within
     * a single Java file. The code is designed to be runnable and serves as an illustration of various functionalities related to the `AffineTransformOp` class.
     *
     * @since 1.0.0
     */

    public static void main(String[] args) {
        
        // Create an instance of AffineTransformOp
        AffineTransformOp op = new AffineTransformOp();
        
        // Define a Rectangle2D object for the source image
        Rectangle2D src = new Rectangle2D.Double(10, 10, 100, 100);
        
        // Define an Ellipse2D object for the destination image
        Ellipse2D dest = new Ellipse2D.Double(50, 50, 200, 200));

        // Apply an affine transform to the source rectangle
        Area srcArea = new Area(src);
        AffineTransformOp op = new AffineTransformOp();
        op.setToIdentity();
        op.transform(srcArea, dest.getBounds2D()));
        
        // Print the resulting destination image bounds
        System.out.println("Destination Image Bounds: " + dest.getBounds2D()));
    }

}