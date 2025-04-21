package examples.java.awt.image;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Example class that demonstrates how to create a BufferedImage object and obtain its alpha raster using the getAlphaRaster() method provided by the BufferedImage class.
 * 
 * This example is useful for demonstrating the creation of a BufferedImage object and obtaining its alpha raster, which can be used for various image processing tasks.
 */
public class BufferedImage_getAlphaRaster_Example {

    /**
     * Method that creates a BufferedImage object with random width and height values between 100 and 500 pixels.
     * 
     * @return BufferedImage object with random dimensions
     */
    private static BufferedImage createRandomBufferedImage() {
        int width = new Random().nextInt(401) + 100;
        int height = new Random().nextInt(201) + 100;

        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
    }

    /**
     * Method that creates and returns a BufferedImage object with random dimensions obtained from the createRandomBufferedImage() method.
     * 
     * @return BufferedImage object with random dimensions
     */
    private static BufferedImage getRandomBufferedImage() {
        return createRandomBufferedImage();
    }

    /**
     * Method that creates and returns a BufferedImage object with random dimensions obtained from the createRandomBufferedImage() method. The created BufferedImage object is then used to obtain its alpha raster using the getAlphaRaster() method provided by the BufferedImage class.
     * 
     * @return String containing the raw Java code block demonstrating the creation of a BufferedImage object and obtaining its alpha raster
     */
    private static String generateRawCodeExample() {
        BufferedImage randomBufferedImage = getRandomBufferedImage();

        StringBuilder sb = new StringBuilder();

        sb.append("package examples.java.awt.image;\n");
        sb.append("\n");
        sb.append("import java.awt.image.BufferedImage;\n");
        sb.append("\n");
        sb.append("/**\n");
        sb.append(" * Class that demonstrates how to create a BufferedImage object and obtain its alpha raster using the getAlphaRaster() method provided by the BufferedImage class.\n");
        sb.append(" * \n");
        sb.append(" * This example is useful for demonstrating the creation of a BufferedImage object and obtaining its alpha raster,\n");
        sb.append(" * which can be used for various image processing tasks.\n");
        sb.append(" *\n");
        sb.append(" */\n");
        sb.append("\n");
        sb.append("public class BufferedImage_getAlphaRaster_Example {\n");
        sb.append("\n");
        sb.append("    /**\n");
        sb.append("     * Method that creates and returns a BufferedImage object with random dimensions obtained from the createRandomBufferedImage() method.\n");
        sb.append("     * \n");
        sb.append("     * This method creates a new BufferedImage object with random width and height values between 100 and 500 pixels, using the createRandomBufferedImage() method for this purpose.\n");
        sb.append("     *\n");
        sb.append("     * @return BufferedImage object with random dimensions\n");
        sb.append("     */\n");
        sb.append("\n");
        sb.append("    private static BufferedImage createRandomBufferedImage() {\n");
        sb.append("\n");
        sb.append("        int width = new Random().nextInt(401) + 100;\n");
        sb.append("        int height = new Random().nextInt(201) + 100;\n");
        sb.append("\n");
        sb.append("        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));\n");
        sb.append("\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("    /**\n");
        sb.append("     * Method that creates and returns a BufferedImage object with random dimensions obtained from the createRandomBufferedImage() method.\n");
        sb.append("     * \n");
        sb.append("     * This method creates a new BufferedImage object with random width and height values between 100 and 500 pixels, using the createRandomBufferedImage() method for this purpose.\n");
        sb.append("     *\n");
        sb.append("     * @return BufferedImage object with random dimensions\n");
        sb.append("     */\n");
        sb.append("\n");
        sb.append("    private static BufferedImage getRandomBufferedImage() {\n");
        sb.append("\n");
        sb.append("        return createRandomBufferedImage();\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("    /**\n");
        sb.append("     * Method that creates and returns a BufferedImage object with random dimensions obtained from the createRandomBufferedImage() method.\n");
        sb.append("     * \n");
        sb.append("     * This method creates a new BufferedImage object with random width and height values between 100 and 500 pixels, using the createRandomBufferedImage() method for this purpose.\n");
        sb.append("     *\n");
        sb.append("     * @return BufferedImage object with random dimensions\n");
        sb.append("     */\n");
        sb.append("\n");
        sb.append("    private static String generateRawCodeExample() {\n");
        sb.append("\n");
        sb.append("        BufferedImage randomBufferedImage = getRandomBufferedImage();\n");
        sb.append("\n");
        sb.append("        StringBuilder sb = new StringBuilder();\n");
        sb.append("\n");
        sb.append("        // Code for generating the raw Java code block goes here.\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("}\n");

        return sb.toString();
    }
}