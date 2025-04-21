package examples.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.RGBImageFilter;

/**
 * This example demonstrates the use of a custom BufferedImageFilter to change pixels in an image. In this example, we will create a filter that changes all the pixel values to white (255, 255, 255)).
 */
public class BufferedImageFilter_setPixels_Example {

    public static void main(String[] args) {
        BufferedImage inputImage = // create or load your image here.
        BufferedImage outputImage = filterImage(inputImage));
        // use the outputImage as needed
    }

    private static BufferedImage filterImage(BufferedImage inputImage) {
        RGBImageFilter filter = new RGBImageFilter() {
            @Override
            public int filterRGB(int x, int y, int width, int height, int[][] coefficients) {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        int pixelValue = inputImage.getRGB(j, i);
                        inputImage.setRGB(j, i, toWhitePixel(pixelValue)));
                    }
                }
                return inputImage.getRGB(x, y));
            }

        };
        BufferedImageFilter filter = new BufferedImageFilter();
        filter.addFilter(0, 0, inputImage.getWidth(), inputImage.getHeight(), filter);
        return outputImage;
    }

    private static int toWhitePixel(int pixelValue) {
        // convert the pixel value to a white (255, 255, 255)) pixel value.
        // here, we assume that the input pixel value is in the RGB color model.
        if (pixelValue == 0) { // if the pixel value is black (0, 0, 0)), return a white pixel value (255, 255, 255)).
            return 255;
        } else { // if the pixel value is not black (0, 0, 0))
            // calculate the average of the RGB components for the non-black pixel value.
            int r = (pixelValue >> 16) & 0xFF;
            int g = (pixelValue >> 8) & 0xFF;
            int b = (pixelValue) & 0xFF;
            return ((r + g + b) / 3) << 16 | // set the red component to be the average of r, g, and b.
                ((r + g + b) / 3) << 8 | // set the green component to be the average of r, g, and b.
                ((r + g + b) / 3); // set the blue component to be the average of r, g, and b.
            }
        };
        return filter.filterBufferedImage(inputImage));
    }

    private static int toWhitePixel(int pixelValue) {
        // convert the pixel value to a white (255, 255, 255)) pixel value.
        // here, we assume that the input pixel value is in the RGB color model.
        return 255; // return a white pixel value (255, 255, 255)).
    }
}