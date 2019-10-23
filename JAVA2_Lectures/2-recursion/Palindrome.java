/**
 * Palindrome.java
 * 21 jan. 2019
 * jlnmsi
 */
package recursion;

/**
 * @author jlnmsi
 *
 */
public class Palindrome {

	
	public static void main(String[] args) {
			// Straight on
		   String word = "madam";                     //
		   char[] chars = word.toCharArray();         
		   boolean b = isPalindrome(chars,0,chars.length-1);       
		   System.out.println(word + " is a palindrome: "+b);
		   
		   
		   // Using a helper method
		   b = isPalindrome(word);
		   System.out.println(word + " is a palindrome: "+b);

	}
	
	public static boolean isPalindrome(String word) {
		char[] chars = word.toCharArray();
		return isPalindrome(chars,0,chars.length-1);
	}
	
	public static boolean isPalindrome(char[] str, int p, int q) {
		   if (q <= p)              // Base case
		      return true;
		   else if (str[p] != str[q])
		      return false;
		   else
		      return isPalindrome(str,p+1,q-1);
	}


}
