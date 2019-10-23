/*
*   IntListImpl.java
*
*   Created 2005-nov-07, 13:19:01
*/
package generics;

import java.util.Iterator;


public class ArrayIntList implements IntList {
	private int size = 0;
	private int[] values;
	
	public ArrayIntList() {values = new int[8];}
	
	public void add(int n) {
		values[size++] = n;
		if (size == values.length) { // increase size
			resize();
		}
	}

	public boolean contains(int n) {
		for (int i=0;i<size;i++) {
			int v = values[i];
			if (v == n)
				return true;
		}
		return false;
	}
	
	public int get(int index) throws IndexOutOfBoundsException {
		checkIndex(index, size);
		return values[index];
	}
	
	public int size() {return size;}
	
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		for (int i=0;i<size;i++) {
			buf.append(" "+values[i]);
		}

		buf.append(" ]");
		return buf.toString();
	}
	
	public Iterator<Integer> iterator() {
		return new ListIterator();
	}
	
	/* Private help members */
	
	private void  resize() {
		int[] tmp = new int[2*values.length];
		System.arraycopy(values,0,tmp,0,values.length); 
		values = tmp;
	}
	
	private void checkIndex(int index, int upper) throws IndexOutOfBoundsException {
		if (index < 0 || index >= upper) {
			String msg = "Index = "+index+", Upper boundary = "+upper;
			throw new IndexOutOfBoundsException(msg);
		}
	}
	
	private class ListIterator implements Iterator<Integer> {
		private int count = 0;
		public Integer next() {return values[count++];}
		
		public boolean hasNext() {return count<size;}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}