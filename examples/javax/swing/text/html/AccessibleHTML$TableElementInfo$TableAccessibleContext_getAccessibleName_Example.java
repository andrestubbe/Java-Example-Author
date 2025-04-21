package examples.javax.swing.text.html;

import java.awt.event.InvocationEvent;
import java.lang.reflect.Field;
import javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext;

public class AccessibleHTML$TableElementInfo$TableAccessibleContext_getAccessibleName_Example {

    /**
     * A method inside this class is used to retrieve the name of an HTML element in a Swing {@link javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext} object. This is done by setting the accessibility client property with the key "accessibleName" and the value being the desired accessible name for the HTML element.
     *
     * @param tableAccessibleContext an instance of {@link TableAccessibleContext}}
     * @return String The name of the HTML element.
     */
    public static String getAccessibleName(TableAccessibleContext tableAccessibleContext) {
        try {
            // Get the "accessibleName" property value from the accessibility client properties map.
            Field field = TableAccessibleContext.class.getDeclaredField("properties");
            field.setAccessible(true);
            InvocationEvent event = new InvocationEvent(null, null));
            Object propertiesMap = field.get(event));
            return (String) propertiesMap.get("accessibleName");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}