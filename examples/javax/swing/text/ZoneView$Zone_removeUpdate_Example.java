package examples.javax.swing.text;

import javax.swing.text.PlainDocument;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;

/**
 * Example of using ZoneView$Zone in a Swing JFrame.
 * <p>
 * The example demonstrates how to create a custom Zone that can remove updates when the document is modified externally. This allows for better control over when updates should occur within a given ZoneView.
 */
public class ZoneView$Zone_removeUpdate_Example extends JFrame {

    private static final long serialVersionUID = 1L;

    private PlainDocument plainDocument;
    private JEditorPane editorPane;

    /**
     * Constructor for the ExampleJFrame class.
     */
    public ZoneView$Zone_removeUpdate_Example() {
        // Initialize Swing components
        plainDocument = new PlainDocument();
        editorPane = new JEditorPane();
        editorPane.setDocument(plainDocument);

        // Create a custom Zone using the ZoneView$Zone class
        Zone zone = new Zone();
        zone.setOpaque(true);
        zone.setBackground(Color.LIGHT_GRAY));
        zone.addPropertyChangeListener("opaque", (oldValue, newValue) -> {
            if (newValue instanceof Boolean && !((Boolean) oldValue))) {
                plainDocument.removeAllBytes();
            }
        }));

        // Add the custom Zone to a JPanel
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(zone, BorderLayout.CENTER));

        // Add the JPanel to a JFrame and make it visible
        setTitle("ZoneView$Zone Example");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE));
        getContentPane().add(panel);
        pack();
        setVisible(true));

    }
}