package ak223wd_assign1.intCollection;

import java.util.Iterator;

public class ArrayIntList extends AbstractIntCollection implements IntList {



    public ArrayIntList(){

    }

    @Override
    public void add(int n) {
        if(size==0){
            values[0]=n;
            size++;
        } else {
            if(checkIndex(size,values.length)){
                resize();//if size == values.length we resize
            }
            values[size]=n;//size pos = n
            size++;//increment size
        }

    }

    //Insert integer n at index pos
    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        if(index>size-1){
            throw new IndexOutOfBoundsException();
        } else{
            for(int i=size;i>index-1;i--){
                if(checkIndex(index,values.length)==false){
                    resize();
                }
                values[i+1]=values[i];
                }
                values[index]=n;

            }
            size++;
        }


    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if(index>size-1){
            throw new IndexOutOfBoundsException();
        } else {
            for(int i = 1;i<values.length;i++){
                values[i-1]=values[i];
            }
        }
        size--;

    }

    //get integer at pos index
    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        return values[index];
    }

    @Override
    public int indexOf(int n) {
        for(int i =0; i<values.length;i++){
            if(values[i]==n){
                return i;
            }
        }
        return -1;
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
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}