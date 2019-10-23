package ak223wd_assign2.FIFO;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This is a linked implementation of the interface Queue.
 * This linked implementation is called LinkedQueue.
 * In this implementation, we are using the head-and-tail approach.
 *
 * @see LinkedQueue
 * @author Ak223wd (Anas K.)
 * @since 16/02/2019
 */

public class LinkedQueue implements Queue {
    private int size; //Current size
    private Node head = null; //First node/Element
    private Node tail = null;

    public LinkedQueue(){
        size = 0;
    }

    /**
     * This method gives the size of the Queue
     *
     * @return the current size of the Queue
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * This method checks the emptiness of the Queue.
     *
     * @return true if it is empty otherwise it returns false
     */

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * This method adds an element in the Queue,
     * if there is nothing in the Queue it creates a new node.
     *
     * @param element and put it at the end of the Queue
     */

    //Add an element at the end of the queue
    @Override
    public void enqueue(Object element) {
        if(head ==null){
            head = new Node(element);
            tail = head;
            size++;
        } else{
            tail.next=new Node(element);
            tail = tail.next;
            size++;
        }
    }

    /**
     * This method, returns the first element of the Queue and removes it from the Queue.
     * @throws NoSuchElementException if the Queue is empty
     * @return the first element of the Queue a
     */

    //Return and remove first element
    @Override
    public Object dequeue() {
        if(head==null){
            throw new NoSuchElementException("The queue is empty. Sorry.");
        } else {
            Object a = head.value; // head
            head = head.next;
            size--;
            return a;
        }
    }

    /**
     * This method returns the first element of the queue without removing it
     * @throws NoSuchElementException if the Queue is empty
     * @return head.value, the first element of the Queue
     *
     */

    //Return without removing the first element
    @Override
    public Object first() {
        if(isEmpty()){
            throw new NoSuchElementException("The queue is empty. Sorry.");
        } else {
            return head.value;
        }
    }

    /**
     * This method returns the last element of the queue without removing it
     * @throws NoSuchElementException if the Queue is empty
     * @return tail.value, the last element of the Queue
     */

    //Return without removing the last element
    @Override
    public Object last() {
        //Node node = tail;
        if(isEmpty()){
            throw new NoSuchElementException("The queue is empty. Sorry");
        } else {
            return tail.value;
        }

    }

    /**
     *This method, iterates to all elements in the queue and returns the elements.
     *
     * @return element iterator of the queue
     */

    //Element iterator
    @Override
    public Iterator<Object> iterator() {
        return new LinkedListIterator();
    }

    /**
     *
     */

    private class LinkedListIterator implements Iterator<Object>{

        private Node current = head;

        @Override
        public boolean hasNext(){
            if(current!=null){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next(){
            Object element = current.value;
            current = current.next;
            return element;
        }
    }

    /**
     * This method returns a string of the Queue.
     *
     * It returns a String representation of the queue content
     *
     * @return Size, head, tail, and elements of the Queue
     */

    @Override
    public String toString() {
        if(isEmpty()==true){
            return "Null";
        }
        String queueT = "";
        Iterator<Object>  it = this.iterator();
        while (it.hasNext()){
            queueT+=it.next() + " ";
        }
        return "LinkedQueue{" +
                "size= " + size +
                ", head = " + head.value +
                ", tail = " + tail.value +
                ", Queue = " + queueT +
                '}';
    }

    /**
     * This is a private class called Node.
     *
     */
    private class Node{ //Private inner Node
        Object value;
        Node next = null;
        Node prev = null;
        Node(Object e){
            value = e;
        }
    }
}