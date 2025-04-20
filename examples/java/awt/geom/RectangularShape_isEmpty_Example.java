package examples.java.awt.geom;

import java.awt.RectangularShape;

/**
 * Example usage of {@link RectangularShape#isEmpty()} method.
 */
public class RectangularShape_isEmpty_Example {

    // Example 1: Check if a rectangle is empty
    public static void main(String[] args) {
        int x = 0, y = 0; // top-left corner coordinates
        int width = 10, height = 5; // rectangle dimensions

        RectangularShape rectangle = new RectangularShape() {
            @Override
            public int getWidth() {
                return width;
            }

            @Override
            public int getHeight() {
                return height;
            }

            @Override
            public boolean contains(int x, int y) {
                // Check if the given coordinates are inside the rectangle
                return (x >= this.x && x <= (this.x + this.width))
                    && (y >= this.y && y <= (this.y + this.height)));
            }

            @Override
            public boolean intersects(int x1, int y1, int x2, int y2) {
                // Check if the given rectangle intersects with the rectangle defined by the current object
                return (x1 >= this.x && x1 <= (this.x + this.width)))
                    && ((y1 >= this.y && y1 <= (this.y + this.height))))
                    || ((x2 < this.x)
                            && (x1 > (this.x + this.width)))));

            }

            @Override
            public boolean contains(int x, int y, int width, int height) {
                // Check if the given rectangle is inside the rectangle defined by the current object
                return this.contains((this.x + this.width) / 2, (this.y + this.height) / 2, width, height));
            }
        };

        rectangle.setFrame(x, y, x + width, y + height);

        // Check if the rectangle is empty
        boolean isEmpty = rectangle.isEmpty();
        System.out.println("Is the rectangle empty? " + isEmpty);
    }
}