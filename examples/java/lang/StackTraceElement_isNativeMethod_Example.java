package examples.java.lang;

import java.util.Stack;

/**
 * This example demonstrates the usage of the `isNativeMethod()` method from the `StackTraceElement` class. The purpose of this example is to show how the `isNativeMethod()` method can be used within a single Java file.
 * 
 * <h3>What the Example Does</h3>
 * The example uses a stack to simulate a function call's execution context. It then retrieves the first element from the stack using the `pop()` method. By doing this, we are essentially "popping" the top-most element from the stack, which corresponds to the caller of the current function or method.
 * 
 * <h3>What the Example Is Good For</h3>
 * This example demonstrates how the `isNativeMethod()` method can be used within a single Java file. By showing how this method can be used in a simple and concise manner, this example helps to demonstrate the power and versatility of the `isNativeMethod()` method within a single Java file.
 */
public class StackTraceElement_isNativeMethod_Example {

    /**
     * This method demonstrates the usage of the `isNativeMethod()` method from the `StackTraceElement` class. The purpose of this method is to show how the `isNativeMethod()` method can be used within a single Java file.
     */
    public static void main(String[] args) {

        // Create a stack to simulate a function call's execution context.
        Stack<StackTraceElement> stack = new Stack<>();

        // Simulate a function call's execution context by pushing elements onto the stack.
        stack.push(new StackTraceElement("com.example", "myMethod", null, 123, true)));
        stack.push(new StackTraceElement("java.lang", "invokeNativeMethod", null, 0, false)));
        stack.push(new StackTraceElement("sun.reflect", "nativeMethodAccessorImpl", null, 0, false)));

        // Retrieve the first element from the stack using the `pop()` method.
        StackTraceElement element = stack.pop();

        // Print the result of the example to the console.
        System.out.println("The first element from the stack is: " + element));

    }
}