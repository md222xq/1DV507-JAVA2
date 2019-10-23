/**
 * DirectoryMain.java
 * Date: 19 feb 2008
 * Author: Jonas Lundberg
 */
package recursion;

import java.io.File;

/**
 * A program that prints all subdirectories of a given
 * directory. The print-out is an indented list where
 * the indentation corresponds to the depth in the directory 
 * structure.
 * 
 * @author jonasl
 *
 */
public class DirectoryMain {
	
	public static void main(String[] args) {	
		// File startDir = new File("C:\\software\\java_kurser\\da1021\\");   // My PC
		File startDir = new File("/Users/jlnmsi/Software/java_kurser/da1021/");   // My Mac
		if (startDir.exists())
			System.out.println("Start: "+startDir);
		else
			System.out.println("Can't find directory: "+startDir);
		visitSub(startDir);
	}

    private static int depth = 1;   
	private static void visitSub(File file) {
		if (file.isDirectory()) {
			printDir(file);
			depth++;
			File[] subs = file.listFiles();
			for (File f : subs)
				visitSub(f);
			depth--;
		}
	}
	
	private static int count = 0;
	private static void printDir(File file) {  // Indented printing
		StringBuffer buf = new StringBuffer();
		for (int i=0;i<depth;i++)
			buf.append("  ");
		System.out.println((++count)+buf.toString()+file.getName());
	}

}
