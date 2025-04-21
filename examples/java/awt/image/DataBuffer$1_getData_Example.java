package examples.java.awt.image;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>This class is an example of how to create a Runnable Java code block.</p>
 * <p>The class `DataBuffer$1_getData_Example` implements the `Runnable` interface and its `run()` method is overridden to print a message.</p>
 * <p>When this class is used in a thread, its `run()` method will be called, printing the message "Running DataBuffer$1_getData_Example Runnable Java code block" to the console.</p>
 */
public class DataBuffer$1_getData_Example implements Runnable {

    private final AtomicInteger counter = new AtomicInteger(0));;

    /**
     * <p>This method is called when the `run()` method is invoked on an instance of this class.</p>
     * <p>This method simply prints a message to the console indicating that it has been invoked and what its purpose is.</p>
     */
    @Override
    public void run() {
        System.out.println("Running DataBuffer$1_getData_Example Runnable Java code block");
    }
}