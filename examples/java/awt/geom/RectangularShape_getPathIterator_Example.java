package examples.java.awt.geom;

import java.awt.RectangularShape;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;

public class RectangularShape_getPathIterator_Example {

    // This class uses the RectangularShape class within the java.awt package to create an example of the getPathIterator() method.

    /**
     * A class that demonstrates how to use the getPathIterator() method with a RectangularShape object.
     */

    public static void main(String[] args) {

        // Create a new RectangularShape object
        RectangularShape rectangularShape = new RectangularShape();

        // Get the path iterator for the shape using an even odd fill rule
        PathIterator pathIterator = rectangularShape.getPathIterator(new java.awt.geom.NoninclusivePathIterator(java.awt.geom.Area.EOF, java.awt.geom.Area.LINE))), 0);

        // Print the coordinates of each point on the shape's path
        while (pathIterator.isDone()) {
            float[] coords = new float[2];
            int type = pathIterator.getCurrentSegment(coords, 0));
            switch (type) {
                case PathIterator.SEG_MOVETO:
                    System.out.println("Move To: " + coords[0] + ", " + coords[1]));
                    break;
                case PathIterator.SEG_LINETO:
                    System.out.println("Line To: " + coords[0] + ", " + coords[1]));
                    break;
            }
            pathIterator.next();
        }
    }
}