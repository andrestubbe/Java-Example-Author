package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_equals_Example {

    /**
     * A Java class that demonstrates the use of the `RoundRectangle2D` class's equals method. 
     * This code creates two instances of `RoundRectangle2D`, one with specified parameters and another constructed from an existing instance. 
     * It then compares these two objects using the equals method inherited from the superclass `Area2D`. 
     * If the two objects are equal, it prints "The two objects are equal". Otherwise, it prints "The two objects are NOT equal".
     */

    public static void main(String[] args) {
        // Create the first RoundRectangle2D instance with specified parameters.
        RoundRectangle2D rect1 = new RoundRectangle2D.Double(10, 10), 300, 400);

        // Create the second RoundRectangle2D instance constructed from an existing instance of RoundRectangle2D.
        RoundRectangle2D rect2 = (RoundRectangle2D) rect1;

        // Compare these two objects using the equals method inherited from the superclass Area2D.
        if(rect1.equals(rect2))) {
            System.out.println("The two objects are equal");
        } else {
            System.out.println("The two objects are NOT equal");
        }
    }

}