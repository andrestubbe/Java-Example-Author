package examples.java.awt.im.spi;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.Icon;
import org.jdesktop.resources.ResourceBundle;
import org.jdesktop.swingx.IconUtils;

/**
 * Example InputMethodDescriptor implementation for the getInputMethodIcon method.
 */
public class InputMethodDescriptor_getInputMethodIcon_Example implements InputMethodDescriptor {

    /**
     * Returns an Icon object representing the input method icon. This implementation provides a simple example of creating an Icon object from a BufferedImage object. The BufferedImage object is created programmatically using the createBufferedImage() method, which creates a BufferedImage object with a specific width and height. The getInputMethodIcon() method then uses the createBufferedImage() method to create a BufferedImage object that contains an icon image.
     * @return Icon An Icon object representing the input method icon.
     */
    @Override
    public Icon getInputMethodIcon(ResourceBundle rb) {
        // Create a BufferedImage object with a specific width and height.
        BufferedImage iconImage = createBufferedImage();

        // Use an ImageIcon to create an Icon object from the BufferedImage object.
        return new ImageIcon(iconImage);
    }

    /**
     * Creates a BufferedImage object with a specific width and height. This implementation creates a BufferedImage object with a width of 16 pixels and a height of 12 pixels. The createBufferedImage() method then uses the BufferedImage constructor that accepts an integer argument for the transparency filter to create a BufferedImage object that contains an icon image with the specified dimensions.
     * @return BufferedImage A BufferedImage object containing an icon image with the specified dimensions.
     */
    private BufferedImage createBufferedImage() {
        // Create a new BufferedImage object with the specified width and height.
        int width = 16;
        int height = 12;
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
    }

}