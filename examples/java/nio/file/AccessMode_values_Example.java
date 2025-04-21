package examples.java.nio.file;

import java.io.IOException;
import java.nio.file.AccessMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * A runnable Java code example using the `AccessMode` class within a single Java file. The code must be runnable.
 */
public class AccessMode_values_Example {

    public static void main(String[] args) throws IOException {
        // Create a Path object
        Path path = Paths.get("exampleFile.txt");

        // Open the file in read-only mode using AccessMode.READ
        Files.open(path, AccessMode.READ)) {
            // Read the content of the file
            String content = new String(Files.readAllBytes(path)));

            // Print the content of the file
            System.out.println("File content: " + content);
        }
    }
}