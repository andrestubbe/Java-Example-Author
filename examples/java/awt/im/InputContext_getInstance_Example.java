package examples.java.awt.im;

import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * This class creates an InputContext instance and stores
 * the instances of various classes like KeyEvent, MouseEvent etc in a map. This allows for easy retrieval of any stored instance. 
 */
public final class InputContext_getInstance_Example {

    // Define a private static map to store created instances
    private static Map<Class<?>, Object> instancesMap = new HashMap<>();

    /**
     * Creates and returns an instance of the given class, if not already created. If already 
     * created, it will return the already created instance instead of creating a new one.
     * @param clazz The class for which an instance is to be returned. Cannot be null.
     * @return An instance of the given class, if not already created. Otherwise, returns the already created instance instead of creating a new one.
     */
    public static <T> T getInstance(Class<T> clazz) {

        // Check if the instance is already in the map
        if (instancesMap.containsKey(clazz))) {

            // If yes, return the already created instance
            return (T) instancesMap.get(clazz);

        } else {

            // If no, create a new instance of the given class
            try {

                Object instance = clazz.getDeclaredConstructor().newInstance();

                // Add the newly created instance to the map using its actual runtime type
                instancesMap.put((Class<?>) (instance instanceof Object ? ((Object) instance).getClass() : instance.getClass())), instance);

                // Return the newly created instance
                return (T) instance;

            } catch (Exception e) {

                e.printStackTrace();

                return null;

            }

        }

    }

}