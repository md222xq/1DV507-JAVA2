/**
 * 
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple program to demonstrate the difference between 
 * generic and raw lists.
 * 
 * @author jonasl
 *
 */
public class GenericMain {

	public static void main(String[] args) {
		  List<Integer> list = new ArrayList<Integer>();   // A generic integer list
		   for (int i=1; i<=5; i++) 
		      list.add(i);                    // Append 1,2,3,4,5. Gets converted to Integer.	
				
		   for (int i=0; i<list.size(); i++) {
		      int n = list.get(i);          // Integer --> int
		      System.out.print(" "+n);
		   }
		   System.out.println("\n");        // line break
		   
		   List raw = new ArrayList();        // A "raw" integer list
		   for (int i=1; i<=5; i++) 
		      raw.add(i);                    // Append 1,2,3,4,5. Gets converted to Integer.	
				
		   for (int i=0; i<raw.size(); i++) {
		      int n = (Integer) raw.get(i);          // Object --> Integer --> int
		      System.out.print(" "+n);
		   }		

	}

}
