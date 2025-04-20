package examples.java.awt.geom;

import java.awt.geom.Rectangle2D;

/**
 * This class demonstrates the usage of the Rectangle2D.Double class. The getBounds2D() method is used to retrieve the bounds of the specified path.
 */
public class Rectangle2D$Double_getBounds2D_Example {

    // Inline comment explaining the creation of a rectangle using Double precision
		/**
		 * Creates a new instance of Rectangle2D.Double, specifying the given x and y coordinates as well as the given width and height values.
		 */
		public Rectangle2D.Double createRectangle(double x, double y, double width, double height) {
			return new Rectangle2D.Double(x, y, width, height));
		}

    // Inline comment explaining the usage of getBounds2D method to retrieve the bounds of a rectangle
		/**
		 * This method is used to retrieve the bounds of the specified path. It returns a new instance of <code>Rectangle2D</code> with the bounds determined by the given arguments.
		 */
		public Rectangle2D getBounds2D(double x, double y, double width, double height) {
			return new Rectangle2D.Double(x, y, width, height));
		}
}