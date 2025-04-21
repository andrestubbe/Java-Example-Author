package examples.java.awt.image;
import java.awt.color.ComponentColorModel;
public class ComponentColorModel_isCompatibleSampleModel_Example {
    private final int width = 640;
    private final int height = 480;
    private final ComponentColorModel colorModel = new ComponentColorModel(false, false, 8, 0);
    public void run() {
        System.out.println("Creating a buffer image with the dimensions of " + width + " x " + height);
        java.awt.image.BufferImage bufferImage = new java.awt.image.BufferImage(width, height, colorModel.getTransparency(), colorModel);
        System.out.println("Buffer image created successfully.");
    }
}