package examples.java.util;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Example of a runnable Java code using the AbstractCollection class within a single Java file.
 */
public class AbstractCollection_clear_Example extends AbstractCollection<String> {

    // Inline comments for relevant lines are provided inline in the code below.

    /**
     * Constructs an empty AbstractCollection object.
     */
    public AbstractCollection_clear_Example() {
        super();
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0; // Initially returns 0, will be updated as elements are added.
    }

    /**
     * Clears all elements from this collection and removes any entry points.
     */
    public void clearCollection() {
        this.clear();
    }

    // Inner class MyIterator for implementing the iterator method of AbstractCollection.
    private class MyIterator implements Iterator<String> {

        // Initialize index to -1, indicating no current element.
        private int index = -1;

        @Override
        public boolean hasNext() {
            return index + 1 < size(); // Returns true if the next element is available.
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            index++; // Increment index to point to the next element in iteration order, and return it as the next element of this iterator.
            return get(index);
        }

        @Override
        public void remove() {
            if (index == -1) { // Check if there is no current element.
                throw new IllegalStateException();
            }
            remove(index); // Removes the element at the specified position in this iterator's collection.
            index--; // Decrement index to point back to the last accessed element, so that it can be removed from the underlying collection.
        }

        // Override of get method for retrieving the element at the specified index in this iterator's collection.
        private String get(int index) {
            return AbstractCollection_clear_Example.this.get(index);
        }

        // Override of remove method for removing the element at the specified index from this iterator's collection.
        private void remove(int index) {
            AbstractCollection_clear_Example.this.remove(index);
        }
    }

}