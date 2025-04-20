package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A class that demonstrates how to correctly override the `hashCode()` method in Java, specifically using the `Rectangle2D` class within a single Java file. This code is designed to be runnable and demonstrate the correct implementation of the `hashCode()` method for the `Rectangle2D` class.
 */
public class Rectangle2D_hashCode_Example {

    private final Rectangle2D rectangle;

    public Rectangle2D_hashCode_Example(double x, double y, double width, double height) {
        this.rectangle = new Rectangle2D.Double(x, y, width, height));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.doubleToLongBits(this.rectangle.getX()));
        result = prime * result + Double.doubleToLongBits(this.rectangle.getY()));
        result = prime * result + Double.doubleToLongBits(this.rectangle.getWidth()));
        result = prime * result + Double.doubleToLongBits(this.rectangle.getHeight()));
        return result;
    }

    // Other methods and code can be added here as needed
}