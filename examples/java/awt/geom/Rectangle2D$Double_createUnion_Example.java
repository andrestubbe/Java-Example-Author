package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates an example of how to use the Double
 * version of Rectangle2D and create a union between two rectangles.
 */
public class Rectangle2D$Double_createUnion_Example {

    // Create the first rectangle
    private static final double X1 = 50;
    private static final double Y1 = 20;
    private static final double W1 = 100;
    private static final double H1 = 30;
    private static final Rectangle2D RECT_1 = new Rectangle2D.Double(X1, Y1), W1, H1);

    // Create the second rectangle
    private static final double X2 = 150;
    private static final double Y2 = 20;
    private static final double W2 = 100;
    private static final double H2 = 30;
    private static final Rectangle2D RECT_2 = new Rectangle2D.Double(X2, Y2), W2, H2);

    // Create the union of the two rectangles
    private static final Rectangle2D UNION = (Rectangle2D) RECT_1.createUnion(RECT_2));

    public static void main(String[] args) {
        System.out.println("Original rectangle 1: " + RECT_1);
        System.out.println("Original rectangle 2: " + RECT_2));
        System.out.println("Union of the two rectangles: " + UNION));
    }

}