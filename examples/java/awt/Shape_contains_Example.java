package examples.java.awt;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;

public class Shape_contains_Example {

    /**
     * Example demonstrating the use of the `contains` method in the `java.awt.Shape` interface.
     * 
     * This example creates a simple `BufferedImage`, then uses two different methods to check if a given point is within the shape's boundary. The results of these checks are then printed to the console.
     */

    public static void main(String[] args) {
        
        // Create a BufferedImage with 100x100 pixels
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB));
        
        // Get the Graphics2D object associated with the BufferedImage
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        g2d.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON)));
        
        // Define the Shape to be checked for containment of a given point
        Shape shape = new Area(new BasicStroke().create(new int[]{50, 50}, new int[]{20, 20}), new Area(new BasicStroke().create(new int[]{50, 50}, new int[]{10, 10}))));
        
        // Define the point to be checked for containment of the defined Shape
        int x = 60;
        int y = 60;
        
        // Check if the point is within the shape's boundary using the `contains` method
        boolean containsPoint = shape.contains(x, y));
        
        // Print the result of the check to the console
        System.out.println("Does the shape contain the point at (" + x + ", " + y + ") ? " + containsPoint);

    }

}