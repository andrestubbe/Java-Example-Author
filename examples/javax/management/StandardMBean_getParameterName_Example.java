package examples.javax.management;

import javax.management.*;
import java.lang.reflect.Method;

/**
 * A runnable Java code example using the `StandardMBean` class within a single Java file. The code must be runnable.
 * 
 * This example demonstrates how to use the `StandardMBean` class from the `javax.management` package to create an MBean that wraps a given object and exposes its methods as MBeans methods.
 */
public class StandardMBean_getParameterName_Example {

    // The wrapped object
    private final Object target;

    /**
     * Constructs a new instance of the `StandardMBean` class wrapping the given target object.
     * 
     * @param target The target object to wrap and expose as MBeans methods.
     */
    public StandardMBean_getParameterName_Example(final Object target) {
        this.target = target;
    }

    /**
     * Returns the wrapped object.
     * 
     * @return The wrapped object.
     */
    public Object getTarget() {
        return target;
    }

    /**
     * Calls the method with the given name on the wrapped object and returns its result.
     * 
     * @param methodName The name of the method to call on the wrapped object.
     * 
     * @return The result of calling the method with the given name on the wrapped object.
     */
    public Object invoke(final String methodName) throws Exception {
        // Retrieve the method from the target object by its name
        final Method method = target.getClass().getMethod(methodName));

        // Call the method and return its result
        return method.invoke(target);
    }
}