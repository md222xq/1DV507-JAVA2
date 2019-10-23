/**
 * ListMain.java
 * Date: 27 feb 2008
 * Author: Jonas Lundberg
 */
package generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author jonasl
 *
 */
public class ListMain {


	public static void main(String[] args) {
		/* Test non-generic implementation */
		IntList ilist = new ArrayIntList();
		System.out.println("\nTesting "+ilist.getClass().getName());
		
		for (int i=0;i<10;i++)   // Test add, size, and get
			ilist.add(i*10);
		System.out.println(ilist);
		System.out.println("Size = "+ilist.size());
		System.out.println("At pos 5: = "+ilist.get(5));
		
		Iterator<Integer> it = ilist.iterator();
		while (it.hasNext())    // Test iterator
			System.out.print("  "+it.next());
		System.out.println("\n");		
		
		
		for (int j : ilist)         // Test extended for-statement 
			System.out.print("  "+j);
		
		/* Test generic implementation */
		GenericList<Integer> glist = new GenericArrayList<Integer>();
		System.out.println("\n\nTesting "+glist.getClass().getName());
		
		for (int i=0;i<10;i++)       // Test add, size, and get
			glist.add(i*100);
		System.out.println(glist);
		System.out.println("Size = "+glist.size());
		System.out.println("At pos 5: = "+glist.get(5));
		
		Iterator<Integer> git = glist.iterator();
		while (git.hasNext())         // Test iterator
			System.out.print("  "+git.next());
		System.out.println("\n");		
		
		for (int j : glist)           // Test extended for-statement 
			System.out.print("  "+j);
		System.out.println("\n");
		
		/* Test addAll */
		GenericList<String> strList = new GenericArrayList<String>();
		ArrayList<String> sL = new ArrayList<String>();
		sL.add("Hello"); sL.add("Hej"); sL.add("Hola");  sL.add("Ciao");
		
		strList.addAll(sL);
		System.out.println(strList);
		

	}

}
