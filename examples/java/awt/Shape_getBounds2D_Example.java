package examples.java.awt;

import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * A Java class demonstrating the use of the Shape interface in conjunction with various AWT geometric shapes such as Rectangles, Ellipses, and Paths. This example also demonstrates how to create a new Area object from an existing Shape object using the Area.add(Shape) method. Additionally, this example shows how to retrieve the bounds of a Shape object's containing shape (the "getBounds2D" method returns a Rectangle2D object representing the bounds of the AWT geometric shapes used in this example).
 * 
 * This Java class demonstrates creating a Shape object from various AWT geometric shapes such as Rectangles, Ellipses, and Paths. Additionally, this Java class shows how to retrieve the bounds of a Shape object's containing shape (the "getBounds2D" method returns a Rectangle2D object representing the bounds of the AWT geometric shapes used in this example).
 * 
 * @author <NAME> (<EMAIL>)
 */
public class Shape_getBounds2D_Example {

    // Create an Ellipse2D object with center at (250, 250) and radii of 50 pixels and 100 pixels respectively.
    private static final Shape ELLIPSE = new Ellipse2D.Double(250 - 50, 250 - 100, 200, 200));

    // Create a Rectangle2D object with upper-left corner at (50, 75), width of 150 pixels, and height of 25 pixels.
    private static final Shape RECTANGLE = new Rectangle2D.Double(50, 75, 150, 25));

    /**
     * The main method for the Shape_getBounds2D_Example class. This method creates a Shape object from various AWT geometric shapes such as Rectangles, Ellipses, and Paths. Additionally, this method shows how to retrieve the bounds of a Shape object's containing shape (the "getBounds2D" method returns a Rectangle2D object representing the bounds of the AWT geometric shapes used in this example).
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {

        // Create an Area object with the initial shape set to null.
        Area area = new Area();

        // Add the Ellipse2D object to the Area object using the Area.add(Shape)) method.
        area.add(ELLIPSE);

        // Retrieve the bounds of the Shape object's containing shape (the "getBounds2D" method returns a Rectangle2D object representing the bounds of the AWT geometric shapes used in this example).
        Rectangle2D bounds = area.getBounds2D();

        // Print out the retrieved bounds of the Shape object's containing shape.
        System.out.println("Retrieved Bounds: [" + bounds.getMinX() + ", " + bounds.getMinY() + "] to [" + bounds.getMaxX() + ", " + bounds.getMaxY() + "])");

    }

}