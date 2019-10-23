package ak223wd_assign2.FIFO;

public class QueueMain {
    public static void main(String[] args){

        LinkedQueue lQ = new LinkedQueue();

        lQ.enqueue(1);
        lQ.enqueue(2);
        lQ.enqueue(3);
        lQ.enqueue(4);
        lQ.enqueue(5);
        lQ.enqueue(6);

        System.out.println(lQ.toString());
        System.out.println("Empty : "+lQ.isEmpty());
        System.out.println("First element in the queue : "+lQ.first());
        System.out.println("Last element in the queue : "+lQ.last());
        System.out.println("Return and remove the first element in the queue : "+lQ.dequeue());
        System.out.println("Empty : "+lQ.isEmpty());
        System.out.println("First element in the queue : "+lQ.first());
    }
}
