package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;
import java.util.Iterator;

/**
 * Example of using RoundRectIterator to iterate through a round rectangle shape and perform operations on each individual corner. This is useful for applying custom effects, animations, or transformations to specific corners of the shape.
 */
public class RoundRectIterator_isDone_Example {

    public static void main(String[] args) {
        
        // Create a new instance of RoundRectangle2D
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(10, 10, 100, 50, 25, 25));
        
        // Create an instance of RoundRectIterator to iterate through the corners of the shape
        Iterator<Point2D> cornerIterator = 
                roundRect.getRoundRectIterator();
        
        // Loop through each individual corner and perform operations on them
        while (cornerIterator.hasNext()) {
            Point2D nextCorner = cornerIterator.next();
            System.out.println("Next Corner: " + nextCorner);
            // Perform any necessary operations or transformations on the individual corners here
        }
    }
}