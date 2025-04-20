package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

public class Rectangle2D$Double_getWidth_Example {

    /**
     * A class that demonstrates the use of the
     * `Rectangle2D$Double` class's `getWidth()` method.
     * This example focuses on the usage of the getWidth() method and not its implementation details.
     */

    public static void main(String[] args) {
        // Create a new instance of Rectangle2D$Double 
        Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 0, 100, 50));
        
        // Get the width of the rectangle 
        double width = rectangle.getWidth();
        
        // Print the result
        System.out.println("The width of the rectangle is: " + width);
    }
}