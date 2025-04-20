package examples.java.awt;

import java.awt.AWTEvent;
import java.awt.AdjustmentListener;
import java.awt.BasicGraphicsContext;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FocusTraversalPolicy;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.LayoutManager;
import java.awt.MediaTracker;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.SystemProps;
import java.awt.Transparency;
import java.awt.event.InvocationEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Example class for demonstrating the use of the Scrollbar class within a single Java file. This code demonstrates how to create and manipulate a Scrollbar component in Java.
 * 
 * The example class creates a custom Scrollbar UI implementation by extending the AbstractScrollbarUI class provided by Java's awt package.
 * 
 * The custom Scrollbar UI implementation is created using the createUI() method override of the AbstractScrollbarUI base class. This method returns an instance of the custom Scrollbar UI implementation, in this case, the ScrollbarExampleUI class.
 */
public class Scrollbar_setValueIsAdjusting_Example {

    // Custom Scrollbar UI implementation

    @Override
    protected void paintTrack(Graphics g, int width, int height, boolean isPressed) {
        super.paintTrack(g, width, height, isPressed));
        if (isPressed) {
            g.setColor(getForeground());
            final Area area = new Area(new Rectangle(0, 0, width, height))));
            area.subtract(new Area(new Rectangle(2, 2, width - 4, height - 4)))));
            g.fill(area));
        } else {
            super.paintTrack(g, width, height, isPressed));
        }
    }

    // Other methods overrides for custom functionality...

}