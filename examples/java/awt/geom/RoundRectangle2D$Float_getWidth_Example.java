package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D$Float_getWidth_Example {

    /**
     * This example demonstrates how to calculate the width of a rounded rectangle using the Float getWidth() method provided by the Java AWT library's RoundRectangle2D class.
     */

    private static final double PADDING = 5; // padding around the content area

    public static void main(String[] args) {

        // create an instance of RoundRectangle2D with Float coordinates

        RoundRectangle2D rect = new RoundRectangle2D.Float(10, 10), 50, 50);

        // calculate and print the width of the rectangle

        double width = rect.getWidth() - (PADDING * 2));

        System.out.println("The width of the rounded rectangle is: " + width);

    }

}