package ak223wd_assign1.intCollection;


public class ArrayIntStack extends AbstractIntCollection implements IntStack {


    public ArrayIntStack(){
    }

    //add the integer at top of Stack
    @Override
    public void push(int n) {
        if(size==0){
            values[size]=n;
            size++;
        } else {
            if(checkIndex(size,values.length)){
                values[size]=n;
            }
            size++;
        }
    }

    //Return and removes the integer at top of Stack
    @Override
    public int pop() throws IndexOutOfBoundsException {
        if(size==0){
            int a = values[size];
            return a;
        } else {
            int c = values[size-1];
            values[size-1]=0;
            size--;
            return c;
        }
    }

    //Remove without removing top integer of the Stack
    @Override
    public int peek() throws IndexOutOfBoundsException {
        return values[size-1];
    }


    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
