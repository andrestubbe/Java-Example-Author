package examples.java.awt.image;

import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImageOp;

public class BufferedImageOp_getBounds2D_Example {

    // Declare an instance of the BufferedImageOp class
    private final BufferedImageOp op = new BufferedImageOp() {
        @Override
        public Area getBounds2D(BufferedImage src) {
            // Create an Ellipse2D object with center at (100, 100), and radii of 50 and 30 respectively
            Ellipse2D ellipse = new Ellipse2D.Double(100 - 50, 100 - 30 * Math.abs(Math.sin(1)))), 200 + 50 * Math.abs(Math.cos(1))), 200 - 30 * Math.abs(Math.sin(1))));

            // Create an Area object containing the Ellipse2D object
            Area area = new Area();
            area.add(ellipse);

            // Return the Area object representing the bounds of the Ellipse2D object
            return area;
        }
    };

    /**
	 * The main method which creates a BufferedImageOpExample object and calls its run() method to execute the example code
	 */
    public static void main(String[] args) {
        // Create an instance of the BufferedImageOp_getBounds2D_Example class
        BufferedImageOp_getBounds2D_Example example = new BufferedImageOp_getBounds2D_Example();

        // Call the run() method to execute the example code
        example.run();
    }

    /**
	 * The run() method which contains the main logic of the example code
	 */
    public void run() {
        // Create a BufferedImage object with a width and height of 400 pixels
        BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB));

        // Call the getBounds2D method on the op instance passing the created BufferedImage object as an argument
        Area area = op.getBounds2D(image));

        // Print the Area bounds to the console
        System.out.println("Area bounds: " + area.getBounds()));
    }
}