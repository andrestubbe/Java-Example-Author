package examples.javax.management;

import javax.management.MBeanException;
import javax.management.ReflectionException;
import java.lang.reflect.InvocationTargetException;

/**
 * This class demonstrates how to use the `StandardMBean` class within a single Java file.
 * 
 * The example code creates a simple MBean implementation named `SimpleMBean`. This implementation provides methods for getting and setting the value of a simple attribute called `simpleValue`.
 * 
 * Additionally, this implementation includes a method called `invokeCustomMethod()` that demonstrates how to use the `StandardMBean` class's `invoke` method. This method allows for dynamic invocation of MBean operations based on their names.
 */
public class StandardMBean_invoke_Example {

    /**
     * A simple attribute representing a value.
     */
    private int simpleValue;

    /**
     * Constructs an instance of the `StandardMBean_invoke_Example` class.
     */
    public StandardMBean_invoke_Example() {
        this.simpleValue = 0;
    }

    /**
     * Gets the value of the simple attribute called `simpleValue`.
     *
     * @return The current value of `simpleValue`.
     */
    public int getSimpleValue() {
        return this.simpleValue;
    }

    /**
     * Sets the value of the simple attribute called `simpleValue` to the specified value.
     *
     * @param value The new value for `simpleValue`.
     * @throws MBeanException          If an exception occurs while executing the operation.
     * @throws ReflectionException      If an exception occurs due to reflection problems.
     * @throws InvocationTargetException If an exception occurs during the invocation of a method or constructor.
     */
    public void setSimpleValue(int value) throws MBeanException, ReflectionException, InvocationTargetException {
        this.simpleValue = value;
    }

    /**
     * A custom method for demonstration purposes. This method simply prints out the current time and the simple value attribute.
     *
     * @throws MBeanException          If an exception occurs while executing the operation.
     * @throws ReflectionException      If an exception occurs due to reflection problems.
     * @throws InvocationTargetException If an exception occurs during the invocation of a method or constructor.
     */
    public void invokeCustomMethod() throws MBeanException, ReflectionException, InvocationTargetException {
        System.out.println("Current time: " + System.currentTimeMillis()));
        System.out.println("Simple value: " + getSimpleValue());
    }
}