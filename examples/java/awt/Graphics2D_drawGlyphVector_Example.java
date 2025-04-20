package examples.java.awt;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderOptions;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;

public class Graphics2D_drawGlyphVector_Example {

    /**
     * This example demonstrates how to use the
     * `Graphics2D` class within a single Java file. The code focuses on creating a runnable Java code example using the `Graphics2D` class, specifically the `drawGlyphVector()` method.
     * 
     * @see <https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics2D.html#drawGlyphVector-java.awt.Font-float-float-java.awt.font.GlyphVector-">
     */

    public static void main(String[] args) {

        // Create a new BufferedImage with the specified dimensions
        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

        // Get the Graphics2D object associated with the BufferedImage
        Graphics2D g2d = (Graphics2D) image.getGraphics();

        // Set some rendering hints to improve the quality of text rendering
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON));

        // Get the Font object to be used for text rendering
        java.awt.Font font = new java.awt.Font("Serif", java.awt.Font.PLAIN, 12));

        // Set some properties of the Graphics2D object
        g2d.setRenderingHints(hints);
        g2d.setFont(font);
        g2d.setColor(java.awt.Color.BLACK));

        // Create a GlyphVector object representing the text to be rendered
        GlyphVector glyphVector = new java.awt.font.GlyphVector("Example", "This is an example of rendering text using the Graphics2D class."));

        // Set the properties of the GlyphVector object
        glyphVector.setFont(font);
        glyphVector.setColor(java.awt.Color.BLACK));

        // Draw the GlyphVector object on the BufferedImage
        g2d.drawGlyphVector(font, glyphVector));

        // Dispose of the Graphics2D object
        g2d.dispose();

        // Show the resulting image
        javax.swing.JFrame frame = new javax.swing.JFrame("Graphics2D Example") {
            public void paint(java.awt.Graphics g) {
                super.paint(g);
                java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
                g2d.drawImage(image, 0, 0, 800, 600, null));
            }
        };
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE));
        frame.pack();
        frame.setVisible(true));

    }

}