package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * Example of using the Rectangle2D class to create a rectangle and perform various operations on it such as translating, scaling, and rotating.
 */
public class Rectangle2D_add_Example {

    // Method to create a rectangle with specified dimensions
    public static Rectangle2D createRectangle(double x, double y, double width, double height) {
        return new Rectangle2D.Double(x, y), width, height);
    }

    // Method to translate the rectangle by dx in the x-direction and dy in the y-direction
    public static void translateRectangle(Rectangle2D rectangle, double dx, double dy) {
        double x = rectangle.getX();
        double y = rectangle.getY();
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        rectangle.setFrame(x + dx, y + dy, width, height);
    }

    // Method to scale the rectangle by a factor of sx in the x-direction and sy in the y-direction
    public static void scaleRectangle(Rectangle2D rectangle, double sx, double sy) {
        double x = rectangle.getX();
        double y = rectangle.getY();
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        rectangle.setFrame(x, y, width * sx, height * sy));
    }

    // Method to rotate the rectangle by an angle of theta in degrees about a specified point (x, y)
    public static void rotateRectangle(Rectangle2D rectangle, double x, double y, double theta)) {
        double centerX = x + rectangle.getWidth() / 2;
        double centerY = y + rectangle.getHeight() / 2;

        // Translate the rectangle so that its center is at the specified point (x, y))
        Rectangle2D translatedRectangle = createRectangle(0, 0, rectangle.getWidth(), rectangle.getHeight()));
        translateRectangle(translatedRectangle, centerX - x, centerY - y));

        // Rotate the rectangle about the specified point (x, y))
        double radians = Math.toRadians(theta));
        double newCenterX = centerX + (rectangle.getWidth() / 2) * Math.cos(radians));
        double newCenterY = centerY + (rectangle.getHeight() / 2) * Math.sin(radians));

        // Translate the rectangle so that its center is at the rotated point (newCenterX, newCenterY))
        translateRectangle(translatedRectangle, newCenterX - x, newCenterY - y));

        // Update the original rectangle with the translated and rotated rectangle
        rectangle.setFrame(0, 0, translatedRectangle.getWidth(), translatedRectangle.getHeight()));
    }

    public static void main(String[] args) {
        // Create a rectangle with dimensions of 100x50 pixels
        Rectangle2D rectangle = createRectangle(10, 10, 100, 50));

        System.out.println("Original rectangle: " + rectangle);

        // Translate the rectangle by 20 pixels in the x-direction and 0 pixels in the y-direction
        translateRectangle(rectangle, 20, 0));

        System.out.println("Translated rectangle: " + rectangle);

        // Scale the rectangle by a factor of 1.5 in both directions
        scaleRectangle(rectangle, 1.5, 1.5));

        System.out.println("Scaled rectangle: " + rectangle);

        // Rotate the rectangle about the point (50, 25))
        rotateRectangle(rectangle, 50, 25, 45));

        System.out.println("Rotated rectangle: " + rectangle);
    }

}