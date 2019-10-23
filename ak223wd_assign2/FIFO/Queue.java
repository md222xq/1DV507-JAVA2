package ak223wd_assign2.FIFO;

import java.util.Iterator;

/**
 *
 * Queue is an interface to implement LinkedQueue using head-and-tail approach
 * @see java.util.Iterator
 * @author Ak223wd (Anas K.)
 * @since 16/02/2019
 */

public interface Queue {
    /**
     * Method to return the current queue size
     * @return size of the Queue
     */
    public int size();                     // current queue size

    /**
     *  Method to return true if queue is empty, false otherwise
     * @return true if queue is empty
     */
    public boolean isEmpty();              // true if queue is empty

    /**
     *This method adds an element in the queue
     * @param element Object
     */
    public void enqueue(Object element);   // add element at end of queue

    /**
     * This method returns and removes the first element
     * @return first element
     */
    public Object dequeue();               // return and remove first element.

    /**
     *This method returns the first element of the queue without removing it
     * @return first element of the queue
     */
    public Object first();                 // return (without removing) first element

    /**
     *This method returns the last element of the queue without removing it
     * @return last element of the queue
     */
    public Object last();                  // return (without removing) last element

    /**
     *This method returns a String representation of the queue content
     * @return String representation of the queue
     */
    public String toString();              // return a string representation of the queue content

    /**
     *This method iterates to all the element of the queue
     * @return all the element of the queue
     */
    public Iterator<Object> iterator();    // element iterator
}
