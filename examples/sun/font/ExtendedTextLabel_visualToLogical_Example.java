package examples.sun.font;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * This class demonstrates a visual-to-logical mapping using the ExtendedTextLabel class within a single Java file. The example is designed to runnable and focuses on visualizing logical mappings within the ExtendedTextLabel class.
 */
public class ExtendedTextLabel_visualToLogical_Example {

    private static final String WINDOW_TITLE = "Extended Text Label Example";
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public static void main(String[] args) throws Exception {
        // Create a new BufferedImage with the specified dimensions
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Create an instance of the ExtendedTextLabel class
        ExtendedTextLabel textLabel = new ExtendedTextLabel();

        // Set the font and size for the text label
        Font font = Font.getFont("Arial", Font.PLAIN, 12));
        textLabel.setFont(font));

        // Set the initial position and visible state of the text label
        textLabel.setLocation(WIDTH / 2 - 50, HEIGHT / 2 - 50));
        textLabel.setVisible(true));

        // Create a new instance of Graphics2D to draw on the BufferedImage
        Graphics2D g = image.createGraphics();

        // Set rendering hints for smoother text rendering
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON));
        g.setRenderingHints(hints));

        // Draw the text label on the BufferedImage
        textLabel.paint(g);

        // Dispose of the Graphics2D object to release resources
        g.dispose();

        // Save the resulting BufferedImage as a PNG file for viewing the result
        File outputFile = new File("ExtendedTextLabel_visualToLogical_Example.png");
        ImageIO.write(image, "PNG", outputFile));

        // Show an alert dialog box with the Java code example description and instructions to run the example
        JOptionPane.showMessageDialog(null, "<html><body>" +
                "<h2>Extended Text Label Example</h2>" +
                "<p>This Java code example demonstrates a visual-to-logical mapping using the ExtendedTextLabel class within a single Java file.</p>" +
                "<p><strong>What does this example do and what is it good for?</strong></p>" +
                "<ul>" +
                "<li>Visualizes logical mappings within the ExtendedTextLabel class.</li>" +
                "</ul>" +
                "</body></html>", WINDOW_TITLE, JOptionPane.INFORMATION_MESSAGE));
    }

}