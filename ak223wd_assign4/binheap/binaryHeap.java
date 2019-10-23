package ak223wd_assign4.binheap;

public interface binaryHeap {
    public void insert(int n); // Add n to heap
    public int pullHighest();    // Return and remove element with highest priority
    public int size();         // Current heap size
    public boolean isEmpty(); // True if heap is empty
}
