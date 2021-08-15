package com.techment.Collection;
import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(154454);
		o2.add(243);
		o2.add(3543);
		o2.add(3);
		o2.add(5);
		
		
		
		
		
		System.out.println("Element of obj o2 = "+o2+"\n");
		
		for(Integer o: o2)    //Arraylist type===Integer
			// for(int o:o2 can also use)
		{
			System.out.println(o);
		}

		
		// iterator and Enhanced for loop .. both are work same 
	}

}