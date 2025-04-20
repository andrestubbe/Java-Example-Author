package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * A Java class demonstrating the usage of the `equals()` method with Rectangle2D objects. This code is a runnable example that showcases how to use the equals() method for comparing two Rectangle2D objects.
 */
public class Rectangle2D_equals_Example {

    // Define two Rectangle2D objects
    private Rectangle2D rectangle1;
    private Rectangle2D rectangle2;

    /**
     * A constructor that initializes the two Rectangle2D objects, rectangle1 and rectangle2.
     */
    public Rectangle2D_equals_Example() {
        // Initialize rectangle1 with (50, 50), width=100, height=200
        this.rectangle1 = new Rectangle2D.Double(50, 50), 100, 200);

        // Initialize rectangle2 with the same x and y coordinates as rectangle1, but with different dimensions
        this.rectangle2 = new Rectangle2D.Double(50, 50), 150, 300);
    }

    /**
     * A method that compares two Rectangle2D objects using their equals() method implementation. This method returns true if the two Rectangle2D objects are equal in terms of their x and y coordinates and dimensions, otherwise it returns false.
     * @param rectangle1 The first Rectangle2D object to compare
     * @param rectangle2 The second Rectangle2D object to compare
     * @return boolean value indicating whether the two Rectangle2D objects are equal or not.
     */
    public boolean compareRectangles(Rectangle2D rectangle1, Rectangle2D rectangle2) {
        // Check if the two Rectangle2D objects are equal in terms of their x and y coordinates and dimensions by calling the equals() method implementation for the Rectangle2D class.
        return rectangle1.equals(rectangle2);
    }

    /**
     * A main method that demonstrates how to use the compareRectangles() method to compare two Rectangle2D objects and determine their equality.
     */
    public static void main(String[] args) {
        // Create an instance of the Rectangle2D_equals_Example class
        Rectangle2D_equals_Example example = new Rectangle2D_equals_Example();

        // Print out the results of comparing rectangle1 and rectangle2 using the compareRectangles() method
        System.out.println("Comparison Result: " + example.compareRectangles(example.rectangle1, example.rectangle2)));
    }
}