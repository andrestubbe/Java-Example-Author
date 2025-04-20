package examples.java.awt.geom;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * A Java class that demonstrates the `intersectsLine` method of the `Rectangle2D` class.
 *
 * <p>This example creates two rectangle objects, a red rectangle and a blue rectangle. The x and y coordinates of both rectangles are randomly generated.</p>
 *
 * <p>The example then checks if the line defined by the points (randomX1, randomY1) and (randomX2, randomY2)) intersects with any of the two rectangle objects. If there is an intersection, it will be displayed in red color using the `draw` method.</p>
 *
 * <p>This example provides a simple demonstration of how to use the `Rectangle2D` class and its methods such as `intersectsLine`. This can be useful for developers looking to optimize their 2D graphics rendering performance by efficiently utilizing the geometric intersection tests provided by the `Rectangle2D` class.</p>
 */
public class Rectangle2D_intersectsLine_Example {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final double EPSILON = 0.001;

    private static Random random = new Random();

    public static void main(String[] args) {
        
        // Create the two rectangle objects
        Rectangle2D rect1 = createRandomRectangle();
        Rectangle2D rect2 = createRandomRectangle();
        
        // Create the line object
        Line2D line = createRandomLine();

        // Check if the line intersects with any of the two rectangle objects
        boolean isIntersecting = intersects(rect1, rect2, line));
        
        // Display the result in the console
        System.out.println("Are the line and the rectangles intersecting? " + (isIntersecting ? "Yes" : "No")));

        // Display the rectangles with their intersection points if any
        draw(rect1, isIntersecting && rect1.intersectsLine(line)) ? Color.RED : null);
        draw(rect2, isIntersecting && rect2.intersectsLine(line)) ? Color.RED : null);
    }

    private static Random getRandom() {
        return random;
    }

    private static Rectangle2D createRandomRectangle() {
        double x = getRandom().nextDouble() * WIDTH;
        double y = getRandom().nextDouble() * HEIGHT;
        double width = getRandom().nextDouble() * 200 + 100;
        double height = getRandom().nextDouble() * 200 + 100;
        return new Rectangle2D.Double(x, y, width, height));
    }

    private static Line2D createRandomLine() {
        double x1 = getRandom().nextDouble() * WIDTH;
        double y1 = getRandom().nextDouble() * HEIGHT;
        double x2 = getRandom().nextDouble() * WIDTH;
        double y2 = getRandom().nextDouble() * HEIGHT;
        return new Line2D.Double(x1, y1, x2, y2));
    }

    private static boolean intersects(Rectangle2D rect1, Rectangle2D rect2, Line2D line) {
        return rect1.intersectsLine(line)) || rect2.intersectsLine(line));
    }

    private static void draw(Rectangle2D rectangle, Color color) {
        // Draw the rectangle with its intersection points if any
        Graphics2D g = (Graphics2D) createGraphicsObject();
        g.setColor(color);
        g.fill(rectangle);
    }

    private static Graphics createGraphicsObject() {
        return new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB)).getGraphics();
    }
}