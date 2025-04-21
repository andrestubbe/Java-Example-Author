package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BufferedImage_getSource_Example {

    /**
     * This example demonstrates how to create a BufferedImage object and get its source (file path).
     */

    // Create an instance of BufferedImage
    private BufferedImage createBufferedImage() {
        return new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB));
    }

    // Method to set the image source file path
    private void setImageSourceFile(String filePath) {
        System.out.println("Set image source: " + filePath);
    }

    public static void main(String[] args) throws Exception {
        BufferedImage bufferedImage = createBufferedImage();
        setImageSourceFile(new File("image.png")).getAbsolutePath());
        // Save the BufferedImage to a PNG file
        ImageIO.write(bufferedImage, "PNG", null);
    }

}