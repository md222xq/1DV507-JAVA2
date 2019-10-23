/*
 * File: ArrayUtil.java
 * Author: Jonas Lundberg
 * Date: 2 mar 2014
 */
package generics;

/**
 * @author jlnmsi
 *
 */
public class ArrayUtil {

	public static <T> void print(T[] arr) {
		for (T t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();  // Line break
	}
	
	public static <E extends Comparable<E> >  E findMin(E[] arr) {
		E min = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i].compareTo(min) < 0)
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		String[] strings = new String[] {"Hej","Hola","Hello","Ciao"};
		ArrayUtil.print(strings);
		
		String min = ArrayUtil.findMin(strings);
		System.out.println("Min: "+min);
		
		
	}

}
