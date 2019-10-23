package ak223wd_assign4.binheap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryIntHeapTest {

    private BinaryIntHeap binaryHeap;

    @BeforeEach
    public void start(){
        binaryHeap = new BinaryIntHeap();
    }

    @Test
    public void pullHighestTest(){
        binaryHeap.insert(2);
        assertEquals(2, binaryHeap.pullHighest());

        binaryHeap.insert(20);
        assertEquals(20,binaryHeap.pullHighest());

        binaryHeap.insert(3);
        assertEquals(3,binaryHeap.pullHighest());
    }

    @Test
    public void insertTest(){
        binaryHeap.insert(2);
        assertEquals(2, binaryHeap.pullHighest());

        binaryHeap.insert(200);
        assertEquals(200,binaryHeap.pullHighest());

        binaryHeap.insert(20);
        assertEquals(20,binaryHeap.pullHighest());
    }

    @Test
    public void sizeTest(){
        assertEquals(0,binaryHeap.size());

        binaryHeap.insert(2);
        assertEquals(1,binaryHeap.size());

        binaryHeap.insert(3);
        assertEquals(2,binaryHeap.size());

    }

    @Test
    public void isEmptyTest(){

        assertTrue(binaryHeap.isEmpty());

        binaryHeap.insert(3);
        assertFalse(binaryHeap.isEmpty());

    }
}