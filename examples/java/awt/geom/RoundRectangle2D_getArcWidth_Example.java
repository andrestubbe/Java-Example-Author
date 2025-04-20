package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * This class demonstrates the usage of the RoundRectangle2D
 * class to create a rounded rectangle shape with variable arc width.
 * The example code provided here showcases how to create a custom rounded rectangle shape with specified corner radii and arc widths, using the RoundRectangle2D class within the java.awt.geom package.
 */
public class RoundRectangle2D_getArcWidth_Example {

    // Define variables for specifying the rounded rectangle shape properties
    private final double width = 500; // Width of the rounded rectangle shape
    private final double height = 300; // Height of the rounded rectangle shape
    private final double xRadius = 100; // Horizontal radius of the rounded rectangle shape's corner
    private final double yRadius = 50; // Vertical radius of the rounded rectangle shape's corner

    // Define variables for specifying the arc width and start/end angles of the rounded rectangle shape's arcs
    private final double arcWidth = 20; // Arc width of the rounded rectangle shape's arcs
    private final int startAngle = 0; // Start angle of the rounded rectangle shape's arcs (in degrees)
    private final int endAngle = 360; // End angle of the rounded rectangle shape's arcs (in degrees)

    public static void main(String[] args) {
        // Create a custom RoundRectangle2D object with specified properties
        RoundRectangle2D rect = new RoundRectangle2D.Double(0, 0, width, height, xRadius, yRadius));
        rect.setArcWidth(arcWidth);
        rect.setArcHeight(height - 2 * yRadius);

        // Print the custom rounded rectangle shape properties
        System.out.println("Width: " + rect.getWidth()));
        System.out.println("Height: " + rect.getHeight()));
        System.out.println("X-Radius: " + rect.getRoundRectangle2D().getXRadius()));
        System.out.println("Y-Radius: " + rect.getRoundRectangle2D().getYRadius()));
        System.out.println("Arc Width: " + rect.getArcWidth()));
    }
}