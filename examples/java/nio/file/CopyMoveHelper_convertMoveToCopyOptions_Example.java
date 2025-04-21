package examples.java.nio.file;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.impl.SimpleFileImpl;
import java.util.Collections;
import java.util.List;

public class CopyMoveHelper_convertMoveToCopyOptions_Example {

    // The Javadoc comment explains the following:
    // This example demonstrates how to convert a move operation into a copy operation using the `CopyOption` interface in Java's NIO file API. 
    // ... (more details here)
    /**
     * Converts a move operation into a copy operation.
     */
    public static void convertMoveToCopyOptions() throws IOException {
        // Get the source directory path
        Path sourceDirectory = Paths.get("src_directory");

        // Get the destination directory path
        Path destDirectory = Paths.get("dest_directory");

        // Define a list to store all the copy options
        List<CopyOption> copyOptions = Collections.emptyList(); // Initialize with an empty list

        // Iterate over all the files in the source directory
        Files.walkFileTree(sourceDirectory, 1).forEach(file -> {
            try {
                // Get the file path within the destination directory
                Path destFilePath = destDirectory.resolve(sourceDirectory.relativize(file)));

                // Check if the destination file already exists and prompt to overwrite it or not
                if (Files.exists(destFilePath))) {
                    System.out.println("Destination file " + destFilePath + " already exists. Overwrite? (y/n): ");
                    char c = System.in.read();
                    if (c != 'y' && c != 'Y')) {
                        return; // Exit the method if the user does not want to overwrite the existing destination file
                    }
                }

                // Create a copy of the source file to the destination directory using the NIO file API
                Files.copy(file, destFilePath, copyOptions));

                System.out.println("File " + file + " copied successfully to " + destDirectory);

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}