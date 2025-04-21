package examples.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.CropImageFilter;
import java.awt.Rectangle;

/**
 * Example class demonstrating the usage of CropImageFilter class.
 * This filter is used to crop an image and get a region of interest from the original image.
 */
public class CropImageFilter_setDimensions_Example {

    private static final int ORIGINAL_WIDTH = 200;
    private static final int ORIGINAL_HEIGHT = 300;
    private static final int CROPPED_WIDTH = 150;
    private static final int CROPPED_HEIGHT = 200;

    public static void main(String[] args) {

        Rectangle roi = new Rectangle();

        CropImageFilter filter = new CropImageFilter() {

            @Override
            public BufferedImage filter(BufferedImage src, int x, int y, int width, int height)) {
                roi.setBounds(x, y, width, height));
            }
        };

        filter.setDimensions(ORIGINAL_WIDTH, ORIGINAL_HEIGHT));

        BufferedImage originalImage = new BufferedImage(ORIGINAL_WIDTH, ORIGINAL_HEIGHT, BufferedImage.TYPE_INT_RGB));

        // Perform the crop operation using the filter
        BufferedImage croppedImage = (BufferedImage) filter.filter(originalImage, 0, 0, originalImage.getWidth(), originalImage.getHeight()));

        System.out.println("Original Image Width: " + originalImage.getWidth()));
        System.out.println("Original Image Height: " + originalImage.getHeight()));
        System.out.println("Crop Image Width: " + croppedImage.getWidth()));
        System.out.println("Crop Image Height: " + croppedImage.getHeight()));

        // Display the original and cropped images using a suitable library or framework such as JavaFX, Swing, etc.
    }
}