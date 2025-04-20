package examples.java.awt.geom;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Rectangle2D_union_Example {

    /**
     * This example demonstrates how to calculate the union of two rectangles using the `Rectangle2D` class and its method: `getUnion(Rectangle2D r1, Rectangle2D r2)`.
     * It calculates the resulting rectangle that is the union of two given rectangles.
     */

    public static void main(String[] args) {

        // Create first rectangle
        Rectangle2D rectangle1 = new Rectangle2D.Double(10, 10, 100, 50));

        // Create second rectangle
        Rectangle2D rectangle2 = new Rectangle2D.Double(30, 30, 70, 70));

        // Calculate union of two rectangles
        Rectangle2D unionOfRectangles = Area.getUnion(rectangle1, rectangle2));

        // Print resulting rectangle that is the union of two given rectangles
        System.out.println("Resulting rectangle that is the union of two given rectangles: " + unionOfRectangles);

    }

}