package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 * <p>Example that demonstrates how to use the {@link Graphics2D#clip} method with a rectangle clip region.</p>
 *
 * <p>This example creates a buffered image of size 800x600, and then applies a rectangular clip region (400x300) at position (200, 100). The resulting graphics context is then drawn onto a new buffered image, which is finally displayed on the screen.</p>
 */
public class Graphics2D_clip_Example {

    public static void main(String[] args) {
        // Create a new buffered image with size 800x600
        BufferedImage bi = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));

        // Get the graphics context of the buffered image
        Graphics2D g2d = (Graphics2D) bi.getGraphics();

        // Set the clip region using a rectangle at position (200, 100) with size 400x300
        Rectangle clipRegion = new Rectangle(200, 100, 400, 300));
        g2d.setClip(clipRegion);

        // Draw an example graphics on top of the buffered image
        g2d.drawOval(250, 250, 100, 100);

        // Dispose the graphics context to release any resources it is holding
        g2d.dispose();

        // Create a new buffered image with size 800x600
        BufferedImage outputBi = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB));

        // Get the graphics context of the output buffered image
        Graphics2D g2dOutput = (Graphics2D) outputBi.getGraphics();

        // Set the clip region using a rectangle at position (200, 100) with size 400x300
        g2dOutput.setClip(clipRegion));

        // Draw the output graphics context onto the output buffered image
        g2dOutput.drawImage(bi, 0, 0, 800, 600, null));

        // Dispose the output graphics context to release any resources it is holding
        g2dOutput.dispose();

        // Display the output buffered image on the screen
        JFrame frame = new JFrame("Graphics2D_clip_Example Output");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize(800, 600));
        frame.add(new JLabel(new ImageIcon(outputBi.getRGBImage()))))));
        frame.setVisible(true));
    }

}