package examples.javax.swing.plaf.metal;

import javax.swing.*;
import java.awt.*;

/**
 * This example demonstrates how to customize
 * the MetalComboBoxButton by overriding its
 * paint method. In this example, we will
 * change the background color of the button and add a drop shadow effect using the Shaper class.
 */
public class MetalComboBoxButton_getComboIcon_Example {

    private static final int SHADOW_RADIUS = 4;
    private static final int INNER_SHADOW_OFFSET = 2;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set the graphics context to have a translucent pixel format
        if (!(g instanceof Graphics2D))) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g;

        // Get the current button state and bounds
        JButton button = getComboIcon(); // Use your custom ComboBox icon retrieval method
        Rectangle buttonBounds = button.getBounds();

        // Define the outer shadow color, radius, offset, and transparency
        Color outerShadowColor = new Color(0, 0, 128),
                outerShadowOffset = new Point(SHADOW_RADIUS, SHADOW_RADIUS)),
                outerShadowTransparency = (int) (buttonBounds.width * buttonBounds.height * 0.05));

        // Define the inner shadow color, radius, offset, and transparency
        Color innerShadowColor = new Color(0, 0, 128),
                innerShadowOffset = new Point(INNER_SHADOW_OFFSET, INNER_SHADOW_OFFSET)),
                innerShadowTransparency = (int) (buttonBounds.width * buttonBounds.height * 0.05));

        // Create a Shaper object to apply the drop shadow effect
        Shaper shaper = new Shaper(g2d),
                shaperTransparency = innerShadowTransparency; // Use the inner shadow transparency value

        // Set the shaper properties and start shaping the button with its inner and outer shadows
        shaper.setShapeTransparency(innerShadowTransparency));
        shaper.setOuterShadowColor(outerShadowColor),
                shaper.setOuterShadowRadius(SHADOW_RADIUS)),
                shaper.setOuterShadowOffset(outerShadowOffset)));
        shaper.paint((Graphics2D) g2d), shaperTransparency));

    }

    private JButton getComboIcon() {
        // Add your custom ComboBox icon retrieval method here
        return null;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setSize(400, 300));
        frame.add(new MetalComboBoxButton_getComboIcon_Example()));
        frame.setVisible(true));
    }

}