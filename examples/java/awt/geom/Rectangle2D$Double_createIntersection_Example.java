package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_createIntersection_Example {

    /**
     * This example demonstrates how to create an intersection between two rectangles using the `Double` class within the `Rectangle2D` class.
     * 
     * This code is designed to demonstrate the usage of the `createIntersection` method from the `Double` class in the `Rectangle2D` class.
     * 
     * The resulting intersection between two rectangles will be a new rectangle that encloses the overlapping region between the two rectangles.
     */

    public static void main(String[] args) {
        // Create two rectangles with different dimensions and positions
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 50, 30));
        Rectangle2D rect2 = new Rectangle2D.Double(25, 15, 40, 20));

        // Compute the intersection between the two rectangles using the createIntersection method from the Double class
        Rectangle2D intersection = new Rectangle2D.Double();
        intersection = rectangle2d_double_createintersection(rect1, rect2));

        // Print the resulting intersection rectangle
        System.out.println("The resulting intersection between the two rectangles is a new rectangle with the following properties:");
        System.out.println("- x: " + intersection.getX()));
        System.out.println("- y: " + intersection.getY()));
        System.out.println("- width: " + intersection.getWidth()));
        System.out.println("- height: " + intersection.getHeight()));
    }

    /**
     * This method creates an intersection between two rectangles using the `Double` class within the `Rectangle2D` class.
     * 
     * @param rect1 The first rectangle to intersect with.
     * @param rect2 The second rectangle to intersect with.
     * 
     * @return A new rectangle that encloses the overlapping region between the two input rectangles.
     */
    private static Rectangle2D.Double createIntersection(Rectangle2D.Double rect1, Rectangle2D.Double rect2) {
        // Calculate the intersection rectangle by taking the minimum of the x and y coordinates of the two input rectangles, as well as the width and height of the smaller rectangle.
        double x = Math.min(rect1.getX(), rect2.getX()));
        double y = Math.min(rect1.getY(), rect2.getY()));
        double width = Math.min(rect1.getWidth(), rect2.getWidth()));
        double height = Math.min(rect1.getHeight(), rect2.getHeight()));

        // Create a new rectangle object with the calculated coordinates and dimensions
        Rectangle2D.Double intersection = new Rectangle2D.Double(x, y, width, height));

        return intersection;
    }
}