/*
*   IntList.java
*
*   Created 2008-sep-29, 12:54:39
*/
package generics;


public interface IntList extends Iterable<Integer> {
	/** Add integer n to list. */
	public void add(int n);
	
	/** Returns true if n is in list, otherwise false. */
	public boolean contains(int n);
	
	/** Get integer at position index. */
	public int get(int index) throws IndexOutOfBoundsException;
	
	/** Number of integers currently stored. */
	public int size();
	
	/** String of type "[ 7 56 -45 68 ... ]" */
	public String toString();
}


