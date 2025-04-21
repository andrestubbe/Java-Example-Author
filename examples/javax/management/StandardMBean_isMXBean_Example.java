package examples.javax.management;

import javax.management.*;

/**
 * This class demonstrates the usage of
 * StandardMBean class from javax.management package.
 * The aim is to create an MBean that implements IsMXBean interface.
 */
public class StandardMBean_isMXBean_Example {

    // Defining a dynamic mbean class
    private static final String DYNAMIC_BEAN_CLASS_NAME = "examples.javax.management.DynamicBean";

    static {
        try {
            Class<?> clazz = Class.forName(DYNAMIC_BEAN_CLASS_NAME);
            MBeanInfo mBeanInfo = new MBeanInfo(clazz, "DynamicBean", null));
            MBeanRegister.registerMBean(mBeanInfo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}