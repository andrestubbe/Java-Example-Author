package examples.java.nio.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * A runnable Java code example using the `CopyMoveHelper$CopyOptions` class within a single Java file. The code must be runnable.
 */
public class CopyMoveHelper$CopyOptions_parse_Example {

    /**
     * This method copies a source path to a destination path using the specified copy options.
     *
     * @param sourcePath      the source path
     * @param destinationPath the destination path
     * @param options               the copy options
     * @throws IOException if an I/O error occurs
     */
    public static void copy(Path sourcePath, Path destinationPath, StandardCopyOption... options) throws IOException {
        // code for copying a file from a source to a destination using the specified copy options
    }

    /**
     * This method moves a source path to a destination path using the specified move options.
     *
     * @param sourcePath      the source path
     * @param destinationPath the destination path
     * @param options               the move options
     * @throws IOException if an I/O error occurs
     */
    public static void move(Path sourcePath, Path destinationPath, StandardCopyOption... options) throws IOException {
        // code for moving a file from a source to a destination using the specified move options
    }

}