package ak223wd_assign4.FIFO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

    private LinkedQueue queueInt;
    private LinkedQueue queueString;

    @BeforeEach
    public void start(){
        queueInt = new LinkedQueue<Integer>();
        queueString = new LinkedQueue<String>();
    }

    @Test
    public void sizeTest(){
        queueInt.enqueue(1);
        assertEquals(1,queueInt.size());//Should return 1

        queueInt.enqueue(2);
        queueInt.enqueue(3);
        queueInt.enqueue(4);
        assertEquals(4,queueInt.size());
    }

    @Test
    public void isEmptyTest() {
        assertEquals(true,queueInt.isEmpty());

        queueInt.enqueue(new Object());
        assertEquals(false,queueInt.isEmpty());

        queueInt.dequeue();
        assertEquals(true,queueInt.isEmpty());
    }

    @Test
    public void enqueueTest() {
        queueString.enqueue("First Element");
        assertEquals("First Element",queueString.first());

        queueString.enqueue("Second Element");
        queueString.enqueue("Third Element");
        queueString.enqueue("Fourth Element");
        assertEquals("First Element",queueString.first());
        assertEquals("Fourth Element",queueString.last());

    }

    @Test
    public void dequeueTest() {
        try {
            queueString.dequeue();
        } catch(NoSuchElementException e){
            assertTrue(true);
        }

        queueString.enqueue("Hey");
        Object test = queueString.dequeue();
        assertEquals(test,"Hey");

        queueString.enqueue("A");
        queueString.enqueue("B");
        queueString.enqueue("C");
        Object test1 = queueString.dequeue();
        Object test2 = queueString.dequeue();
        assertEquals(test1,"A");
        assertEquals(test2,"B");

        queueString.dequeue();

        assertEquals(true,queueString.isEmpty());
    }

    @Test
    public void firstTest() {

        try {
            queueInt.first();
        } catch (NoSuchElementException e){
            assertTrue(true);
        }

        queueInt.enqueue(1);
        queueInt.enqueue(2);
        queueInt.enqueue(3);
        queueInt.enqueue(4);

        assertEquals(1,queueInt.first());

        queueInt.dequeue();
        queueInt.dequeue();

        assertEquals(3,queueInt.first());
    }

    @Test
    public void lastTest() {
        try {
            queueInt.last();
        } catch(NoSuchElementException e){
            assertTrue(true);
        }
        queueInt.enqueue(1);
        queueInt.enqueue(2);
        assertEquals(2,queueInt.last());

        queueInt.enqueue(3);
        queueInt.enqueue(4);
        queueInt.enqueue(5);
        assertEquals(5,queueInt.last());

        queueInt.dequeue();
        assertEquals(5,queueInt.last());
    }

    @Test
    public void iteratorTest() {
        Iterator<Object> it = queueString.iterator();

        assertEquals(false, it.hasNext());

        boolean check = false;

        try {
            it.next();
        } catch (NullPointerException e){

            assertTrue(true);
        }

        queueString.enqueue("First Element");
        it = queueString.iterator();
        assertTrue(it.hasNext());
        assertEquals("First Element",it.next());

        queueString.enqueue("Second Element");
        queueString.enqueue("Third Element");
        queueString.enqueue("Fourth Element");
        it = queueString.iterator();
        it.next();
        assertEquals("Second Element",it.next());
        assertEquals("Third Element",it.next());
        assertEquals("Fourth Element",it.next());
    }

    @Test
    public void toStringTest(){
        queueString.enqueue("element 1");
        queueString.enqueue("element 2");
        queueString.enqueue("element 3");
        String str = "LinkedQueue{" +
                "size = 3"+
                ", head = element 1" +
                ", tail = element 3" +
                ", Queue = element 1 element 2 element 3" +
                " }";
        assertEquals(str,queueString.toString());
    }
}