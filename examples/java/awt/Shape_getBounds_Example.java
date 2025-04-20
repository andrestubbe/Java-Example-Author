package examples.java.awt;
import java.awt.Shape;
import java.awt.Rectangle;
/**
 * <p>This example demonstrates how to get the bounds of a Java AWT Shape.</p>
 * 
 * <p>The Shape class represents an object that can be filled or stroked in a graphics context. Each shape is defined by its own bounding box, which can be obtained using the getBounds() method.</p>
 */
public class Shape_getBounds_Example {

    // Define a sample Shape to demonstrate how to get bounds of different shapes
    private static final Shape SAMPLE_SHAPE = new Rectangle(10, 10, 100, 50));

    /**
     * <p>This method demonstrates how to use the getBounds() method on a Java AWT Shape.</p>
     * 
     * @param shape The Shape object to obtain bounds from.
     * @return The bounds of the given Shape object.
     */
    private static Rectangle getShapeBounds(final Shape shape) {
        // Use the getBounds() method on the given Shape object to obtain its bounds.
        Rectangle bounds = new Rectangle();
        bounds = (Rectangle) shape.getBounds(bounds));
        return bounds;
    }

    /**
     * <p>This is an example main method which demonstrates how to use the getShapeBounds() method.</p>
     */
    public static void main(String[] args) {
        // Create a sample Shape object for demonstration purposes.
        Shape sampleShape = new Rectangle(10, 10, 100, 50));

        // Use the getShapeBounds() method to obtain bounds of the sample Shape object.
        Rectangle shapeBounds = getShapeBounds(sampleShape));

        // Print the obtained bounds of the sample Shape object.
        System.out.println("Shape Bounds: (" + shapeBounds.getX() + ", " + shapeBounds.getY() + "), (" + shapeBounds.getWidth() + ", " + shapeBounds.getHeight() + "))");
    }
}