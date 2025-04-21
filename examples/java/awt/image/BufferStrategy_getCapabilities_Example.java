package examples.java.awt.image;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferStrategy;
import java.awt.image.Filters;

public class BufferStrategy_getCapabilities_Example {

    // Buffered image filter for colorspaces conversion (e.g. RGB to CMYK)
    private static final class ColorspaceFilter extends BufferedImageFilter {

        @Override
        public BufferedImage filter(BufferedImage src, BufferedImage dest) {
            if (src == null || dest == null) return null;

            Graphics2D g2 = dest.createGraphics();

            g2.setRenderingHint(RenderingHints.KEY_COLORSPACE_FILTER, ColorspaceFilter.NO_FILTER));

            ((Graphics2D) g2).drawImage(src, 0, src.getHeight(), null);

            return dest;
        }
    };

    public static void main(String[] args) {
        System.setProperty("sun.java2d.cmm", "none"));
        System.setProperty("sun.java2d.datatype", "int"));
        System.setProperty("sun.java2d.bitmap.format", "ARGB");

        // Create a new frame buffer configuration object
        BufferStrategy bs = Frame.createBufferStrategy(3, 1);

        // Get the number of buffers in the strategy
        int numBuffers = bs.getNumBuffers();

        System.out.println("Number of Buffers: " + numBuffers);

        // Create a new image object with the buffer strategy's first buffer as its content
        BufferedImage img = new BufferedImage(bs.getBuffer(0)).getRGB(0, 0, -1, -1, java.awt.image.Filters.unassociated));

        System.out.println("Image width: " + img.getWidth()));
        System.out.println("Image height: " + img.getHeight()));

        // Save the image to a file with the format PNG
        javax.imageio.ImageIO.write(img, "png", null);
    }
}