package examples.java.awt;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SequencedEvent_lambda$dispatch$0_Example {

    /**
     * A simple example that demonstrates the usage of the `SequencedEvent` class within a single Java file. This code is written to be runnable and produces a desired result that can be explained in detail within this Java doc comment.
     */

    // Define an interface for the event listener
    interface EventListener {
        void onEvent(String message);
    }

    // Define the SequencedEvent class
    public static class SequencedEvent<T> {
        private final BlockingQueue<T> queue = new LinkedBlockingQueue<>();
        private volatile boolean running = true;

        public void addListener(EventListener listener) {
            queue.add(listener);
        }

        public void removeListener(EventListener listener) {
            queue.remove(listener);
        }

        public void dispatchEvent(T eventData) {
            while (running && queue.size() > 0) {
                try {
                    EventListener listener = queue.take();
                    if (running) {
                        listener.onEvent("Received event data: " + eventData);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        public void stop() {
            running = false;
        }
    }
}