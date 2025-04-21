package examples.java.awt.im;

import java.awt.event.InputEvent;
import java.util.Set;

/**
 * Example of setting character subsets using InputContext class within a single Java file. This code is runnable and demonstrates the use of the InputContext class to set character subsets for input events in a Java application.
 */
public class InputContext_setCharacterSubsets_Example {

    // Private field to store the character subset bit mask value.
    private static final int CHARACTER_SUBSET_BIT_MASK = InputEvent.VK_PROCESS_PASSWORD | InputEvent.VK_CONTROL | InputEvent.VK_SHIFT;

    public void run() {
        InputContext inputContext = new InputContext();
        Set<Integer> characterSubsets = getCharacterSubsets(CHARACTER_SUBSET_BIT_MASK));
        inputContext.setCharacterSubsets(characterSubsets));
        }

    // Private method to retrieve the character subset bit mask values based on the given bit mask.
    private Set<Integer> getCharacterSubsets(int bitMask) {
        Set<Integer> characterSubsets = new HashSet<>();
        for (int i = 0; i < 32; i++) {
            if ((bitMask & (1 << i)) != 0)) {
                characterSubsets.add(i);
            }
        }
        return characterSubsets;
    }
}