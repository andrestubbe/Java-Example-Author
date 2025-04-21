package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D$Float_isEmpty_Example {

    /**
     * A runnable example of using the 
     * `RoundRectangle2D$Float` class 
     * within a single Java file.
     * The code must be runnable.
     */
    public static void main(String[] args) {
        
        // Define variables for the rectangle dimensions
        float width = 50f;
        float height = 30f;
        float arcWidth = 10f;
        float arcHeight = 5f;
        
        // Create a new RoundRectangle2D object with the specified dimensions and arcs
        RoundRectangle2D.Float rectangle = 
            new RoundRectangle2D.Float(0, 0, width, height), 
                arcWidth, arcHeight);
        
        // Check if the rectangle is empty by comparing its bounds to zero
        boolean isEmpty = 
            rectangle.getX() == 0 && 
            rectangle.getY() == 0 && 
            rectangle.getCenterX() == 0 && 
            rectangle.getCenterY() == 0;
        
        // Print the result of the code example
        if (isEmpty) {
            System.out.println("The rectangle is empty.");
        } else {
            System.out.println("The rectangle is not empty.");
        }
    }
}