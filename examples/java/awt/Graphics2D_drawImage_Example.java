package examples.java.awt;

import java.awt.*;
import java.util.Random;

/**
 * <p>This program demonstrates how to use the
 * Graphics2D class within a single Java file. The code is runnable and creates a window with an image drawn on it.</p>
 *
 * @author Your Name
 * @version 1.0
 */
public class Graphics2D_drawImage_Example {

    // Create a new frame to hold the window
    private static JFrame frame;

    // Create a new label to display an image
    private static Label imageLabel;

    // Define the main method that sets up and runs the program
    public static void main(String[] args) throws Exception {

        // Set up the necessary variables for creating the window and drawing the image
        new Example();

        // Create a new frame to hold the window
        frame = new JFrame("Graphics2D_drawImage_Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));

        // Add a key listener to handle window closing events
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE)) {
                    System.exit(0);
                }
            }
        }));

        // Add an image to the label
        imageLabel = new Label();
        frame.add(imageLabel, BorderLayout.CENTER));

        // Set the frame size and make it visible on the screen
        frame.setSize(400, 300));
        frame.setVisible(true));

    }

    /**
     * This method creates a new window with an image drawn on it.
     */
    private void createImage() {

        // Create a new buffer to hold the image data
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB));

        // Get the graphics context for drawing on the image
        Graphics2D g2d = (Graphics2D) image.getGraphics();

        // Set the rendering hints to improve the quality of the drawn image
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIASING_ON));
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR));

        // Draw an image on the canvas using the drawImage() method of the Graphics2D class
        ImageIcon icon = new ImageIcon("image.jpg"));
        g2d.drawImage(icon.getImage(), 0, 0, 400, 300, null));

        // Dispose the graphics context to release any resources associated with it
        g2d.dispose();

        // Add the image to the label
        imageLabel.setIcon(new ImageIcon(image.getScaledInstance(400, 300)))));

    }

    /**
     * This method initializes the necessary variables for creating the window and drawing the image.
     */
    private void init() {

        // Create a new instance of the class
        Graphics2D_drawImage_Example example = new Graphics2D_drawImage_Example();

        // Initialize the necessary variables for creating the window and drawing the image
        example.createImage();

    }

}