package ak223wd_assign2.FIFO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {
    private LinkedQueue lq;
    @BeforeEach
    public void setLq(){
        lq = new LinkedQueue();
    }

    @Test
    public void sizeTest(){
        assertEquals(0,lq.size());
        lq.enqueue(1);
        assertEquals(1,lq.size());
    }

    @Test
    public void isEmptyTest(){
        assertEquals(true,lq.isEmpty());
        lq.enqueue(1);
        assertEquals(false,lq.isEmpty());
    }

    @Test
    public void enqueueTest(){
        lq.enqueue(1);
        assertEquals(1,lq.first());

        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        assertEquals(1,lq.first());
        assertEquals(4,lq.last());
    }

    @Test
    void dequeueTest(){
        try {
            lq.dequeue();
        } catch (NoSuchElementException e){
            assertTrue(true);
        }

        lq.enqueue(1);
        lq.enqueue(2);
        assertEquals(1,lq.dequeue());
        assertEquals(2,lq.first());

    }

    @Test
    void firstTest(){
        try {
            lq.first();
        } catch (NoSuchElementException e){
            assertTrue(true);
        }
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        assertEquals(1,lq.first());

    }

    @Test
    void lastTest(){
        try {
            lq.last();
        } catch (NoSuchElementException e){
            assertTrue(true);
        }
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        assertEquals(3,lq.last());
    }

    @Test
    void iteratorTest(){
        Iterator<Object> it = lq.iterator();
        lq.enqueue(1);
        it = lq.iterator();
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
        lq.enqueue(2);
        lq.enqueue(3);
        it = lq.iterator();
        it.next();
        assertEquals(2,it.next());
        assertEquals(3,it.next());

    }

}