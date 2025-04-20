package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;

/**
 * A class example that demonstrates how to use the
 * RoundRectangle2D.Double class within a single Java file. The code is designed to be runnable and serves as an example of how to utilize specific methods and properties of the Double class in the geom package.
 */
public class RoundRectangle2D$Double_getWidth_Example {

    /**
     * Constructs a new instance of the Example class with a specified width.
     *
     * @param width The specified width for the example object.
     */
    public RoundRectangle2D$Double_getWidth_Example(double width) {
        this.width = width;
        return this;
    }

    /**
     * Returns the width of the example object.
     *
     * @return The width of the example object.
     */
    public double getWidth() {
        // In this example, we simply return a constant value for demonstration purposes. In a real-world scenario, you would likely use a different approach to obtain the desired width based on your specific requirements and use case.
        return 100.0;
    }

    /**
     * The entry point of the Example class.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        RoundRectangle2D.Double roundRectangle = new RoundRectangle2D.Double(50, 50, 200, 100));
        System.out.println("Width: " + roundRectangle.getWidth()));
    }
}