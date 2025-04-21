package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.Objects;

public class BufferedImage_toString_Example {

    /**
     * <p>This is an example of how to override the toString() method for a custom object of type 'BufferedImage'. The code demonstrates various uses of the BufferedImage class, including saving images as PNGs and converting colorspace.</p>
     */

    // Instance variable(s)

    private final int width;
    private final int height;
    private final int transparency = -1; // default value for alpha channel


    // Constructor method

    public BufferedImage_toString_Example(int width, int height) {
        this.width = width;
        this.height = height;
    }


    // Overridden toString() method

    @Override
    public String toString() {
        return String.format("BufferedImage[width=%d, height=%d, type=%s]%s", width, height, (transparency == -1) ? "RGB" : "Alpha", Objects.requireNonNull(this.getClass().getMethod("toString"))));
    }


    // Main method

    public static void main(String[] args) throws NoSuchMethodException {
        BufferedImage_toString_Example bufferedImage = new BufferedImage_toString_Example(100, 100);
        System.out.println(bufferedImage.toString()));
    }
}