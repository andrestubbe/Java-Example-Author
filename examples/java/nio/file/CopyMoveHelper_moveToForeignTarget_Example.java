package examples.java.nio.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyMoveHelper_moveToForeignTarget_Example {

    /**
     * Example of moving a file to a foreign target directory. This example uses the `StandardCopyOption` to copy and override the existing file if it exists already in the foreign target directory.
     */

    public static void main(String[] args) throws IOException {
        // Path to source file
        Path sourceFile = Paths.get("path_to_source_file");

        // Path to foreign target directory
        Path foreignTargetDir = Paths.get("path_to_foreign_target_directory");

        // Copy the source file to the foreign target directory
        Files.copy(sourceFile, foreignTargetDir.resolve(sourceFile.getFileName())), StandardCopyOption.REPLACE_EXISTING);

        System.out.println("The file has been successfully moved to the foreign target directory.");
    }
}