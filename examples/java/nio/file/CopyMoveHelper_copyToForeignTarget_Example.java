package examples.java.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of using the CopyMoveHelper class to copy a file from one location to another foreign target location. This example demonstrates how to use the CopyMoveHelper class in a single Java file, demonstrating that it can be used effectively in an entire project.
 */
public class CopyMoveHelper_copyToForeignTarget_Example {

    // Define paths for source and target locations
    private static final Path SOURCE = Paths.get("source_file.txt"));
    private static final Path TARGET_FOREIGN = Paths.get("foreign_target_directory", "copied_file.txt"));

    public static void main(String[] args) throws IOException {
        // Create an instance of the CopyMoveHelper class with the SOURCE and TARGET_FOREIGN paths
        CopyMoveHelper copyMoveHelper = new CopyMoveHelper(SOURCE, TARGET_FOREIGN));

        // Use the copy() method of the CopyMoveHelper class to perform the file copy operation
        copyMoveHelper.copy();
    }

}