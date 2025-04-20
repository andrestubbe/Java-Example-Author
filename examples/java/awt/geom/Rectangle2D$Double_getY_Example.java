package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A runnable Java code example using
 * the Rectangle2D.Double class within a single
 * Java file. The code is designed to demonstrate
 * the usage of the getY() method of the Rectangle2D.Double class.
 */
public class Rectangle2D$Double_getY_Example implements Runnable {

    @Override
    public void run() {
        // Create a new instance of Rectangle2D.Double
        Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 0, 100, 50));

        // Get the y-coordinate of the rectangle's top-left corner
        double yCoordinate = rectangle.getY();

        System.out.println("The y-coordinate of the rectangle's top-left corner is: " + yCoordinate);
    }
}