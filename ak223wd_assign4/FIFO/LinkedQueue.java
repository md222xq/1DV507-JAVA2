package ak223wd_assign4.FIFO;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue <T> implements Queue<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(T element) {
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

    @Override
    public T dequeue() {
        if(head==null){
            throw new NoSuchElementException("The queue is empty. Sorry.");
        } else {
            T a = head.value; // head
            head = head.next;
            size--;
            return a;
        }
    }

    @Override
    public T first() {
        if(isEmpty()){
            throw new NoSuchElementException("The queue is empty. Sorry.");
        } else {
            return head.value;
        }
    }

    @Override
    public T last() {
        if(isEmpty()){
            throw new NoSuchElementException("The queue is empty. Sorry");
        } else {
            return tail.value;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>{

        private Node<T> current = head;

        @Override
        public boolean hasNext(){
            if(current!=null){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public T next(){
            T element = current.value;
            current = current.next;
            return element;
        }
    }

    @Override
    public String toString() {
        if(isEmpty()==true){
            return "Null";
        }
        String queueT = "";
        Iterator<T>  it = this.iterator();
        while (it.hasNext()){
            queueT+=it.next() + " ";
        }
        return "LinkedQueue{" +
                "size = " + size +
                ", head = " + head.value +
                ", tail = " + tail.value +
                ", Queue = " + queueT +
                "}";
    }

    private class Node<T>{
        T value;
        Node<T> next = null;
        Node<T> prev = null;
        Node(T v){
            value = v;
        }
    }
}

