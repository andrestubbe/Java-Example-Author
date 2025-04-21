package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.io.IOException;

/**
 * This example demonstrates how to create a custom Input Method Highlight that updates when the user types in an Text Component (e.g. JEditorPane, JTextArea etc.) within a single Java file. The code is designed to be used with JDK17 or later.
 *
 * <p>The example demonstrates two scenarios:</p>
 *
 * <ul>
 *   <li><b>Scenario 1: Simple Input Method Highlight</b></li>
 * </ul>
 *
 * <p>In this scenario, the custom InputMethodHighlight class is used to highlight the input method in action. This allows users to easily identify and track the input method they are currently using.</p>
 *
 * <ul>
 *   <li><b>Scenario 2: Customized Input Method Highlight</b></li>
 * </ul>
 *
 * <p>In this scenario, the custom class extends the Swing's JTextComponent and overrides some of its important methods to provide a customized input method highlight.</p>
 */
public class InputMethodHighlight_getState_Example {

    // Customized Input Method Highlight
    private static final int HIGHLIGHT_THICKNESS = 2; // Thickness of the highlight (in pixels)
    private static final Color HIGHLIGHT_COLOR = new Color(0, 255, 0)); // Color of the highlight (Green)

    // Customized Input Method Highlight Component
    private JTextComponent textComponent;

    // Constructor
    public InputMethodHighlight_getState_Example(JTextComponent textComponent) {
        this.textComponent = textComponent;
    }

    // Get the current state of the input method highlight component
    public int getState() {
        // Get the current input method events associated with the text component
        InputMethodEvent[] imEvents = textComponent.getInputMethodListeners();

        int x = -1, y = -1; // Default values for the location of the highlight

        // Iterate over each input method event and check if it is the current input method event associated with the text component
        for (int i = 0; i < imEvents.length; i++) {
            InputMethodEvent event = imEvents[i];

            if (event.getInputMethodContext() == textComponent) {
                // Get the location of the highlight in pixels
                x = Math.max(0, event.getCaretPosition() - HIGHLIGHT_THICKNESS / 2));
                y = Math.min(textComponent.getHeight(), event.getDotLocation()));

                // Draw the highlight at the specified location
                if (x >= 0 && y >= 0)) {
                    Graphics2D g2d = (Graphics2D) textComponent.getGraphics();
                    g2d.setColor(HIGHLIGHT_COLOR));
                    g2d.fillRect((int) x), ((int) y + HIGHLIGHT_THICKNESS)));
                    g2d.dispose();
                }

                // Break the loop as we have found a matching input method event
                break;
            }
        }
    }
}