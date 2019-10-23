/*
*   GenericList.java
*
*   Created 2008-sep-29, 12:54:39
*/
package generics;

import java.util.Collection;

  /*
   * A generic version of IntList.
   */

public interface GenericList<T> extends Iterable<T> {
	/** Append element t to list. */
	public void add(T t);
	
	/** Append a iterable collection of elements to the list. */
	public void addAll(Iterable<T>  col);
	
	/** Returns true if element t is in list, otherwise false. */
	public boolean contains(T t);
	
	/** Get element at position index. */
	public T get(int index) throws IndexOutOfBoundsException;
	
	/** Number of elements currently stored. */
	public int size();
	
	/** String displaying  list content on one line  */
	public String toString();
}


