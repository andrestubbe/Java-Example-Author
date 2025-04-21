package examples.java.awt.im;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class InputContext_dispose_Example {

    /**
     * <p>A demonstration of the `InputContext` class's `dispose()` method.</p>
     * 
     * <p>This code creates an instance of the `InputContext` class, retrieves a `BufferedImage` from it and finally, cleans up resources by calling the `dispose()` method.</p>
     *
     * @see InputContext#dispose()
     */

    public static void main(String[] args) {
        
        // Create an instance of the InputContext class
        InputContext inputContext = new InputContext();
        
        // Retrieve a BufferedImage from it
        BufferedImage bufferedImage = inputContext.getBufferedImage();
        
        // Finally, clean up resources by calling the dispose() method
        inputContext.dispose();

        }
    
}