package examples.java.awt.geom;

import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;

/**
 * An example of using the `Rectangle2D` class
 * within a single Java file. The code
 * must be runnable.
 * 
 * This code creates a rectangle with its origin at (50, 50) and dimensions of 100x100 pixels. It then uses the `PathIterator` class to iterate over the path defined by the rectangle's shape and outline.
 */
public class Rectangle2D_getPathIterator_Example {

    public static void main(String[] args) {
        // Create a new rectangle with its origin at (50, 50) and dimensions of 100x100 pixels
        Rectangle2D rectangle = new Rectangle2D.Double(50, 50, 100, 100));

        // Use the PathIterator class to iterate over the path defined by the rectangle's shape and outline
        PathIterator iterator = rectangle.getPathIterator(null);
        while (iterator.isDone()) {
            double[] segment = new double[6];
            int type = iterator.currentSegment(segment);
            switch (type) {
                case PathIterator.SEG_MOVETO:
                    System.out.println("Move to: " + Arrays.toString(segment)));
                    break;
                case PathIterator.SEG_LINETO:
                    System.out.println("Line to: " + Arrays.toString(segment))));
                    break;
            }
            iterator.next();
        }
    }
}