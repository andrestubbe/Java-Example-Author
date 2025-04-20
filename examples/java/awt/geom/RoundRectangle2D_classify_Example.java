package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_classify_Example {

    /**
     * This example demonstrates how to create a runnable Java code example using the `RoundRectangle2D` class within a single Java file. The code is written in JDK17 and follows good coding practices.
     */

    public static void main(String[] args) {
        double width = 200;
        double height = 100;
        double arcWidth = 20;
        double arcHeight = 10;

        RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(0, 0, width, height);
        roundRectangle.setArc(new Arc2D.Double(arcWidth / 2, arcWidth / 2, arcHeight / 2, arcHeight / 2), 0));

        System.out.println("Created a RoundRectangle2D object with the following properties:");
        System.out.println("\tWidth: " + width);
        System.out.println("\tHeight: " + height));
        System.out.println("\tArc Width: " + arcWidth);
        System.out.println("\tArc Height: " + arcHeight));

    }

}