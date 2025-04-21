package examples.java.awt.image;

import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.util.Random;

public class ComponentSampleModel_getSamples_Example {

    // Inline comment for the relevant lines
    /**
     * This example demonstrates the usage of the ComponentSampleModel class in Java's AWT and Image libraries. The purpose of this code is to demonstrate a simple image processing task: generating an image with random pixels values and saving it as a PNG file using the ImageIO library. This example is meant to serve as a basic template for further experimentation and learning within the context of working with the ComponentSampleModel class.
     */

    // The smallest version possible of the given Java code block

    public static void main(String[] args) throws Exception {

        int width = 800;
        int height = 600;

        ComponentSampleModel sampleModel = new ComponentSampleModel(width, height, 1, null));

        DataBuffer<Integer> dataBuffer = new DataBuffer<>(new int[width * height]), width * height);

        sampleModel.setDataElements(0, 0, width, height, dataBuffer));

        Random random = new Random();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                dataBuffer.setElem(x + y * width, random.nextInt()));
            }
        }

        // Save the image as a PNG file using the ImageIO library
        javax.imageio.ImageIO.write(sampleModel, "png"), "png");

    }

}