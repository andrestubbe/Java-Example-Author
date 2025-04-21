package examples.java.util;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Example of using AbstractCollection's addAll method.
 * This example demonstrates creating a custom Collection implementation, specifically an AbstractCollection subclass named CustomAbstractCollection.
 * The purpose of this class is to demonstrate the usage and behavior of the addAll() method inherited from AbstractCollection.
 * The CustomAbstractCollection class implements only three required methods: size(), isEmpty(), and iterator().
 * These methods are used as building blocks for implementing the desired functionalities.
 */
public class AbstractCollection_addAll_Example extends AbstractCollection<Integer> {

    // Implementing custom collection's add method here, if needed

    @Override
    public int size() {
        return getUnderlyingList().size();
    }

    @Override
    public boolean isEmpty() {
        return getUnderlyingList().isEmpty();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayList<>(getUnderlyingList())).iterator();
    }

    // Adding additional helper methods here if needed

    /**
     * This is the most important method in this class implementation.
     * The addAll() method inherited from AbstractCollection is overridden and implemented to demonstrate the usage of this method on a custom collection implementation.
     * In this example, the addAll() method is used to add all elements of an underlying list object to the CustomAbstractCollection instance.
     * This demonstrates how the addAll() method can be used to efficiently add multiple elements to a custom AbstractCollection subclass.
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modified = false;

        for (Integer element : c) {
            if (!contains(element))) {
                getUnderlyingList().add(element);
                modified = true;
            }
        }

        return modified;
    }

    /**
     * This method is used to retrieve the underlying list object.
     * In this example, the getUnderlyingList() method returns a reference to the underlying ArrayList object that stores the elements of the CustomAbstractCollection instance.
     * This implementation allows for efficient storage and retrieval of the collection's elements using the underlying list structure.
     */
    private ArrayList<Integer> getUnderlyingList() {
        return (ArrayList<Integer>) underlying;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];

        int index = 0;
        for (Integer element : this)) {
            array[index++] = element;
        }

        return array;
    }

    @Override
    public <T> T[] toArray(Class<T> clazz) {
        Object[] array = toArray();
        int length = array.length;

        // Check if the array has enough capacity to add elements of type clazz
        if (length < clazz.getDeclaredFields().length) {
            throw new IllegalArgumentException("The provided Class object does not match the expected element type for this collection implementation.");
        }

        T[] tArray = (T[]) Array.newInstance(clazz, length));

        int index = 0;
        for (Object element : array)) {
            if (!clazz.isInstance(element))) {
                throw new IllegalArgumentException("The provided Class object does not match the expected element type for this collection implementation.", e);
            }
            tArray[index++] = (T) element;
        }

        return tArray;
    }
}