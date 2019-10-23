/*
 * File: GenValue.java
 * Author: Jonas Lundberg
 * Date: 2 mar 2014
 */
package generics;

/**
 * A first example using generics. This class also contains a main 
 * method demonstrating how to use the GenValue class.
 * 
 * @author jlnmsi
 *
 */
public class GenValue<T> {
	
	private T value;
	
	public GenValue(T val) { value = val; }
	
	public void setValue(T val) { value = val; }
	public T getValue() { return value; }
	
	@Override
	public String toString() {
		return "GV("+value.toString()+")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof GenValue) {  // Compare with raw version
			GenValue other = (GenValue) o;
			return other.value.equals(value);
		}
		return false;
	}

	public static void main(String[] args) {
		// Using integers
		GenValue<Integer> i1 = new GenValue<Integer>(7);
		i1.setValue(23);	
		System.out.println("Integers: "+i1.toString()+"\t"+i1.getValue());
		
		GenValue<Integer> i2 = new GenValue<Integer>(7);
		String msg = i1.equals(i2) ? "equal" : "not equal";
		System.out.println("They are "+msg);
		
		// Using strings
		GenValue<String> s1 = new GenValue<String>("Hello");
		GenValue<String> s2 = new GenValue<String>("World!");
		
		System.out.println("\nStrings: "+s1.toString()+"\t"+s2.toString());
		
		s2.setValue("Hello");
		msg = s1.equals(s2) ? "equal" : "not equal";
		System.out.println("They are "+msg);

	}

}
