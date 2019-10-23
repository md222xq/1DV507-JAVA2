package ak223wd_assign1.intCollection;

public class CollectionMain {

    public static void main(String[] args){

        System.out.println("|--------------------ArrayIntList------------------------|");
        ArrayIntList arr = new ArrayIntList();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(arr.toString());//print
        arr.addAt(9,0);//add n at pos ind
        System.out.println(arr.toString());
        System.out.println("Size : "+arr.size());//check the size
        arr.remove(0);//remove at pos 0
        System.out.println(arr.toString());
        System.out.println("Size : "+arr.size());
        System.out.println(arr.get(0));
        arr.indexOf(3);
        System.out.println("Position of integer n : " +arr.indexOf(1));
        System.out.println(arr.isEmpty());

        System.out.println("|-------------------ArrayIntStack------------------------|");
        ArrayIntStack arrS = new ArrayIntStack();
        arrS.push(1);//we put n at the top of Stack
        arrS.push(2);
        System.out.println(arrS.toString());
        System.out.println("Size : "+arrS.size());
        System.out.println("Return the number at the top of the Integer and Removes it : "+arrS.pop());
        System.out.println("The element at the top of the Stack : "+arrS.peek());
        System.out.println(arrS.toString());
        arrS.push(4);
        System.out.println(arrS.toString());
        System.out.println("The element at the top of the Stack : "+arrS.peek());
        System.out.println("Return the number at the top of the Integer and Removes it : "+arrS.pop());
        System.out.println("Empty : "+arrS.isEmpty());



    }
}