package ak223wd_assign4.binheap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryIntHeap implements binaryHeap {


    private static final int DEFAULT_CAPACITY = 50;
    private int [] bheap;
    private int size;

    public BinaryIntHeap()  {
        size = 0;
        bheap = new int[DEFAULT_CAPACITY];
    }

    public void insert(int n) {

        if(size == bheap.length/2) {
            expand();
        }


        bheap[size++] = n;

        int childPos = size-1;
        int parentPos = (childPos-1)/2;

        while(bheap[parentPos] < bheap[childPos]) {
            swap(parentPos,childPos);

            childPos = parentPos;
            parentPos = (childPos-1)/2;
        }

    }

    public int pullHighest() {

        int highest = bheap[0];

        swap(0,size-1);

        bheap[size-1] = 0;

        int parentPos = 0;
        int leftChild = 1;
        int rightChild = 2;

        while(bheap[leftChild] > bheap[parentPos] || bheap[rightChild] > bheap[parentPos]) {

            if(bheap[leftChild] > bheap[rightChild]) {
                swap(parentPos,leftChild);
                parentPos = leftChild;

            }else {
                swap(parentPos, rightChild);
                parentPos = rightChild;
            }

            leftChild = 2 * parentPos+1;
            rightChild = 2 * parentPos+2;

            if(leftChild > bheap.length || rightChild > bheap.length)
                break;
        }

        size--;
        return highest;
    }

    public int size() {
        return size;

    }
    public boolean isEmpty() {
        if(size ==0){
            return true;
        }
        return false;
    }



    private void swap(int i, int j) {

        int temp = bheap[i];
        bheap[i] = bheap[j];
        bheap[j] = temp;
    }

    private void expand() {
        int [] temp = new int[2*size];
        System.arraycopy(bheap, 0, temp, 0, bheap.length);
        bheap = temp;
    }

    @Override
    public String   toString() {
        return "BinaryIntHeap{" +
                "size=" + size +
                ", isEmpty = "+ isEmpty()+
                ", bheap=" + Arrays.toString(bheap) +
                '}';
    }
}
