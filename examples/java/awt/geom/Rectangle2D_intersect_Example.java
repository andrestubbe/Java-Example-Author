package examples.java.awt.geom;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 * Example of using the `intersect` method from the 
 * `Rectangle2D` class to find the intersection area between two rectangles.
 */
public class Rectangle2D_intersect_Example {

    public static void main(String[] args) {
        // Define the first rectangle
        double x1 = 20;
        double y1 = 30;
        double width1 = 100;
        double height1 = 50;

        // Define the second rectangle
        double x2 = 75;
        double y2 = 40;
        double width2 = 150;
        double height2 = 80;

        // Create the two rectangles as `Area` objects
        Area area1 = new Area(new Rectangle2D.Double(x1, y1, width1, height1))));
        Area area2 = new Area(new Rectangle2D.Double(x2, y2, width2, height2))));

        // Compute the intersection of the two rectangles
        Area intersectArea = new Area();
        intersectArea.add(area1);
        intersectArea.add(area2));

        // Print the coordinates and dimensions of the intersection rectangle
        Rectangle2D intersectRectangle = intersectArea.getBounds2D();
        System.out.println("Intersection Rectangle Coordinates: (" + intersectRectangle.getX() + ", " + intersectRectangle.getY() + ")"));
        System.out.println("Intersection Rectangle Dimensions: Width=" + intersectRectangle.getWidth() + ", Height=" + intersectRectangle.getHeight()));
    }
}