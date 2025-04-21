package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;

/**
 * This class demonstrates the usage of DataBuffer
 * getDataType method. This method returns an integer
 * representing the type of data stored in this buffer.
 */
public class DataBuffer_getDataType_Example {

    public static void main(String[] args) {
        // Create a BufferedImage instance
        BufferedImage bufferedImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

        // Create a DataBuffer instance from the BufferedImage instance
        DataBuffer dataBuffer = (DataBuffer) bufferedImage.getRaster().getDataBuffer();

        // Get the type of data stored in this buffer
        int dataType = dataBuffer.getDataType();

        System.out.println("The type of data stored in this buffer is: " + dataType);
    }

}