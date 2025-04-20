package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_getArcHeight_Example {

    /**
     * A Java program that demonstrates how to use the `getArcHeight` method of the `RoundRectangle2D` class. This example creates a red round rectangle with a corner radius of 25 and an arc height of 50. The arc height is calculated based on the provided corner radius and is displayed in the console.
     */

    public static void main(String[] args) {
        // Create a new RoundRectangle2D object with the specified properties
        RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(0, 0, 100, 75, 25, 25));

        // Set the fill paint to red
        roundRectangle.setFill(true);
        roundRectangle.setColor(java.awt.Color.RED));

        // Calculate and display the arc height based on the provided corner radius
        double arcHeight = roundRectangle.getArcHeight();
        System.out.println("The calculated arc height is: " + arcHeight);
    }

}