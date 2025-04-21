package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

/**
 * An example of how to create a runnable Java code example using the `InputMethodHighlight` class within a single Java file. The code must be runnable.
 */
public class InputMethodHighlight_isSelected_Example {

    public static void main(String[] args) {
        run();
        }

    private static void run() {

        // Create an instance of the InputMethodHighlight class
        InputMethodHighlight inputMethodHighlight = new InputMethodHighlight();

        // Create a mock input method event
        InputMethodEvent event = new InputMethodEvent(this, 0, null));

        // Add an input method listener to the input method highlight instance
        inputMethodHighlight.addInputMethodListener(new InputMethodListener() {
            @Override
            public void caretPositionChanged(CaretEvent e) {
                // Example action when the caret position changes
                System.out.println("Caret position changed");
            }

            @Override
            public void inputMethodTextChanged(InputMethodTextChangedEvent evt) {
                // Example action when the input method text changes
                System.out.println("Input method text changed");
            }
        }));

        // Simulate a change in input method text
        inputMethodHighlight.simulateInputMethodTextChange();

    }

}