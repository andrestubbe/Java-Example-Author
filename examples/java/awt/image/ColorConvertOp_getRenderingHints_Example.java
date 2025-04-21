package examples.java.awt.image;

import java.awt.RenderingHints;
import java.awt.image.ColorConvertOp;

public class ColorConvertOp_getRenderingHints_Example {

    /**
     * This example demonstrates how to use the
     * ColorConvertOp class within a single Java file.
     *
     * The code creates an instance of the ColorConvertOp class, sets rendering hints for the op instance, and then returns the rendering hints.
     */

    public static RenderingHints getRenderingHints() {
        // Create an instance of the ColorConvertOp class
        ColorConvertOp colorConvertOp = new ColorConvertOp();

        // Set rendering hints for the op instance
        colorConvertOp.setRenderingHint(RenderingHints.KEY_FILTERING, RenderingHints.VALUE_FILTER_FAST));
        colorConvertOp.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR));

        // Return the rendering hints for the op instance
        return colorConvertOp.getRenderingHints();
    }
}