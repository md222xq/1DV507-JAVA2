/*
*   IntListImpl.java
*
*   Created 2005-nov-07, 13:19:01
*/
package generics;

import java.util.Iterator;


/*
 * A generic version of ArrayIntList.
 */

public class GenericArrayList<T> implements GenericList<T> {
	private int size = 0;
	private T[] values;
	
	public GenericArrayList() {values = (T[]) new Object[8];}
	
	public void add(T t) {
		values[size++] = t;
		if (size == values.length) { // increase size
			resize();
		}
	}
	
	
	public void addAll(Iterable<T>  col) {
		for (T t : col)
			add(t);
	}

	public boolean contains(T t) {
		for (int i=0;i<size;i++) {
			T v = values[i];
			if (v .equals(t))
				return true;
		}
		return false;
	}
	
	public T get(int index) throws IndexOutOfBoundsException {
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
	
	/* Implements Iterable<T> */
	public Iterator<T> iterator() {
		return new ListIterator<T>(values);
	}
	
	/* Private help members */
	
	private void  resize() {
		T[] tmp = (T[]) new Object[2*values.length];
		System.arraycopy(values,0,tmp,0,values.length); 
		values = tmp;
	}
	
	private void checkIndex(int index, int upper) throws IndexOutOfBoundsException {
		if (index < 0 || index >= upper) {
			String msg = "Index = "+index+", Upper boundary = "+upper;
			throw new IndexOutOfBoundsException(msg);
		}
	}
	
	private class ListIterator<X> implements Iterator<X> {
		private int count = 0;
		private X[] elements;
		
		public ListIterator(X[] xElements) {elements = xElements;}
		
		public X next() {return elements[count++];}
		public boolean hasNext() {return count<size;}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}