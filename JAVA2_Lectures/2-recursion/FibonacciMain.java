/**
 * FibonacciMain.java
 * Date: 19 feb 2008
 * Author: Jonas Lundberg
 */
package recursion;

/**
 * Computing the first 90 numbers
 * in the Fibonacci Series. The computaion
 * requires that we use long (rather than int)
 * since the growth in the series is exponential.
 * 
 * Computing first 100 numbers is not possible
 * using this simple approach.
 * 
 * @author jonasl
 *
 */
public class FibonacciMain {


	public static void main(String[] args) {
		int N = 90;
		long fm2 = 0, fm1 = 1, f;
		System.out.println(0+"\t"+fm1);
		System.out.println(1+"\t"+fm1);
		for (int i = 2;i<N;i++) {
			f = fm1 + fm2;
			System.out.println(i+"\t"+f);
			fm2 = fm1;
			fm1 = f;
		}
	}

}
