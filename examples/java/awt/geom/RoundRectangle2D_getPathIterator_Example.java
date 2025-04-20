package examples.java.awt.geom;

import java.awt.geom.RoundRectangle2D;
import java.util.Iterator;

/**
 * A Java class that demonstrates the usage of
 * `getPathIterator()` method within a single Java file. This code creates a runnable example using the RoundRectangle2D class and shows its result in comments.
 */
public class RoundRectangle2D_getPathIterator_Example {

    // Define a method that draws a filled rectangle with rounded corners using the RoundRectangle2D class.
    public static void drawRoundRectangle(double x, double y, double width, double height, double arcWidth) {
        // Create an instance of RoundRectangle2D class.
        RoundRectangle2D roundRectangle = new RoundRectangle2D(x, y, width, height), arcWidth);

        // Get the path iterator for this shape to iterate over the outline of the shape.
        Iterator<double[]> iterator = roundRectangle.getPathIterator(null));

        // Iterate over the outline of the rectangle and draw each segment using a graphics context.
        while (iterator.hasNext()) {
            double[] point = iterator.next();
            System.out.println("Drawing segment at (" + point[0] + ", " + point[1] + ")"));

            // Draw the segment at the current point obtained from the path iterator.
            // You can use a graphics context to draw on a component such as a JPanel or a Canvas.
        }
    }

    public static void main(String[] args) {
        // Set the size of the canvas using the JFrame class.
        JFrame frame = new JFrame("Java AWT Geom RoundRectangle2D Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize(800, 600));

        // Create a graphics context for the canvas using the createGraphics() method of the JPanel class.
        Graphics2D g = (Graphics2D) frame.getContentPane().createGraphics();

        // Set the rendering hints for smooth drawing and better performance on higher resolution displays.
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON));
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIASING_OFF)));

        // Set the background color of the canvas to white using the setBackground() method of the JPanel class.
        frame.getContentPane().setBackground(Color.WHITE));

        // Define a method that draws a filled rectangle with rounded corners using the RoundRectangle2D class.
        drawRoundRectangle(100, 100, 200, 150, 10));

        // Show the canvas in a new window using the setVisible() method of the JFrame class.
        frame.setVisible(true));
    }
}