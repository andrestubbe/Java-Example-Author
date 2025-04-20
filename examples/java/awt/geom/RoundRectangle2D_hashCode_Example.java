package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A runnable Java code example using the `RoundRectangle2D` class within a single Java file. The code must be runnable. This example demonstrates how to calculate the hash code for an instance of the `RoundRectangle2D` class.
 */
public class RoundRectangle2D_hashCode_Example {

    private final RoundRectangle2D roundRectangle;

    public RoundRectangle2D_hashCode_Example(double x, double y, double width, double height, double arcWidth, double arcHeight) {
        this.roundRectangle = new RoundRectangle2D.Double(x, y, width, height, arcWidth, arcHeight));
    }

    @Override
    public int hashCode() {
        return roundRectangle.hashCode();
    }

}