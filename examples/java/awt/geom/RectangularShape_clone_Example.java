package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * A class that demonstrates how to clone a
 * {@link RectangularShape} object in Java.
 */
public class RectangularShape_clone_Example {

    /**
     * A method that clones a given rectangular shape object.
     *
     * @param original the original rectangular shape object to be cloned.
     * @return the cloned rectangular shape object.
     */
    private static RectangularShape cloneRectangularShape(RectangularShape original) {
        try {
            // Clone the original rectangular shape object using the Object#clone() method.
            Object cloned = original.clone();

            // Downcast the cloned object to a RectangularShape object.
            return (RectangularShape) cloned;

        } catch (CloneNotSupportedException e) {
            // Handle the case where the clone operation is not supported for the given object.
            System.err.println("Error: Cloning of the rectangular shape object failed.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * A method that demonstrates the cloning process by creating a copy of an original rectangle shape object using the Object#clone() method.
     *
     * @param original the original rectangle shape object to be cloned.
     */
    private static void demonstrateCloning(RectangularShape original) {
        // Clone the original rectangular shape object using the Object#clone() method.
        Object cloned = original.clone();

        // Downcast the cloned object to a RectangularShape object.
        RectangularShape clonedRectangularShape = (RectangularShape) cloned;

        System.out.println("Original Rectangular Shape Details:");
        System.out.println("Bounds: " + original.getBounds()));
        System.out.println("X: " + original.getBounds().x);
        System.out.println("Y: " + original.getBounds().y);
        System.out.println("Width: " + original.getBounds().width);
        System.out.println("Height: " + original.getBounds().height));

        System.out.println("Cloned Rectangular Shape Details:");
        System.out.println("Bounds: " + clonedRectangularShape.getBounds()));
        System.out.println("X: " + clonedRectangularShape.getBounds().x);
        System.out.println("Y: " + clonedRectangularShape.getBounds().y);
        System.out.println("Width: " + clonedRectangularShape.getBounds().width);
        System.out.println("Height: " + clonedRectangularShape.getBounds().height));

        // Compare the original and cloned rectangle shape objects by checking their bounds dimensions.
        if (original.getBounds().equals(clonedRectangularShape.getBounds()))) {
            System.out.println("The cloning process has been successfully completed. The original and cloned rectangle shape objects have identical bounds dimensions.");
        } else {
            System.out.println("The cloning process failed. The original and cloned rectangle shape objects do not have identical bounds dimensions."));
        }

    }

    /**
     * A main method that creates an example rectangular shape object, demonstrates the cloning process by creating a copy of the original rectangle shape object using the Object#clone() method, and then compares the original and cloned rectangle shape objects by checking their bounds dimensions.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create an example rectangular shape object with a specified width and height.
        RectangularShape original = new Rectangle(10, 20));

        // Demonstrate the cloning process by creating a copy of the original rectangle shape object using the Object#clone() method.
        RectangularShape cloned = cloneRectangularShape(original);

        // Display the details of the original and cloned rectangle shape objects.
        demonstrateCloning(original);

    }

}