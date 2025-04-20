package examples.java.awt.geom;

import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.RectIterator;

/**
 * This example demonstrates the usage of the `RectIterator` class within a single Java file. The code creates an instance of the `RectIterator` class and iterates over the rectangles using the `next()` method.
 */
public class RectIterator_next_Example {

    public static void main(String[] args) {
        
        // Create a sample rectangle
        Rectangle rectangle = new Rectangle(10, 10, 100, 50));
        
        // Create an instance of the RectIterator class
        RectIterator rectIterator = new Area(rectangle).getPathIterator();

        // Iterate over the rectangles using the next() method
        while (rectIterator.isDone()) {
            double x1 = rectIterator.getBounds().x;
            double y1 = rectIterator.getBounds().y;
            double x2 = rectIterator.next().getBounds().x;
            double y2 = rectIterator.next().getBounds().y;

            System.out.println("Rectangle: (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")"));
        }
    }
}