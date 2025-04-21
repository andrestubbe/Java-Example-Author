package examples.java.awt.image;

import java.awt.Color;
import java.awt.image.ComponentColorModel;

public class ComponentColorModel_hashCode_Example {

    // Test if two ComponentColorModels are equal 
    // by checking their hash codes and component names.
    @Test
    public void equals_method_shouldWorkForTwoComponentColorModels() {
        // Define two ComponentColorModels with the same properties
        ComponentColorModel colorModel1 = new ComponentColorModel(new int[] {0, 1, 2}, true, Color.RGBtoHSB(1f, 0f, 0f, 100), Color.RGBtoHSB(0f, 1f, 0f, 100)));

        ComponentColorModel colorModel2 = new ComponentColorModel(new int[] {0, 1, 2}, true, Color.RGBtoHSB(1f, 0f, 0f, 100), Color.RGBtoHSB(0f, 1f, 0f, 100)));

        // Check if the two ComponentColorModels are equal by checking their hash codes and component names
        assertThat(colorModel1).isEqualTo(colorModel2);
    }
}