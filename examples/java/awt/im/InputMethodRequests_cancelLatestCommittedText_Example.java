package examples.java.awt.im;

import java.awt.event.InputMethodEvent;
import java.util.Locale;

/**
 * An example of using the `InputMethodRequests` class within a single Java file. The code demonstrates how to cancel the latest committed text in an input method session.
 */
public class InputMethodRequests_cancelLatestCommittedText_Example {

    /**
     * Cancels the latest committed text in an input method session.
     * @param e An input method event.
     */
    public void cancelInputMethodEvent(InputMethodEvent e) {
        // Get the current locale from the input method request
        Locale currentLocale = InputMethodRequests.getCurrentInputMethodLocale();

        // Cancel the latest committed text in an input method session
        e.cancel();

        System.out.println("Latest committed text cancelled for input method session with locale: " + currentLocale);
    }

}