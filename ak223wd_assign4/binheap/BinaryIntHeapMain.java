package ak223wd_assign4.binheap;

public class BinaryIntHeapMain {
    public static void main(String[] args){
        BinaryIntHeap binaryHeap = new BinaryIntHeap();

        System.out.println("isEmpty : "+binaryHeap.isEmpty());
        binaryHeap.insert(1);
        binaryHeap.insert(2);
        binaryHeap.insert(3);

        System.out.println(binaryHeap.toString());

        binaryHeap.insert(72);
        binaryHeap.insert(450);
        binaryHeap.insert(712);
        binaryHeap.insert(2000);
        binaryHeap.insert(-200);

        System.out.println(binaryHeap.toString());
        System.out.print("Highest : "+ binaryHeap.pullHighest());
    }
}
