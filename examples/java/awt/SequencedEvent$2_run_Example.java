package examples.java.awt;

import java.util.concurrent.Executors;

/**
 * <p>The purpose of this example is to demonstrate how a Runnable can be executed using the ExecutorService provided by the Java Concurrency API.</p>
 *
 * <p>In this specific example, we will create an anonymous class that implements the Runnable interface. This Runnable will simply print "Hello, World!" to the console.</p>
 *
 * <p>After defining our Runnable implementation, we then create an instance of the ExecutorService class provided by the Java Concurrency API. We pass in a new ThreadPoolExecutor as a parameter to the ExecutorService constructor.</p>
 *
 * <p>Finally, we submit our Runnable instance to the ExecutorService for execution. Once executed, the Runnable's `run()` method will be called, resulting in "Hello, World!" being printed to the console.</p>
 */
public class SequencedEvent$2_run_Example implements Runnable {

    @Override
    public void run() {
        // Print a simple message to demonstrate that our code is functioning as expected.
        System.out.println("Hello, World!");
    }

}