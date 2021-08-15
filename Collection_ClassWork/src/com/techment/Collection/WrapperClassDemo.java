package com.techment.Collection;
public class WrapperClassDemo {

	public static void main(String[] args) {

		
		int a=100;
		
		Integer b=a;  // b is object here 
		//autoboxing:automatically convert Integer class into primitive int type
		
		int c=b.intValue(); //object b is converted to primitive type variable c
		// Unboxing: automatically convert for object to primitive
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}

