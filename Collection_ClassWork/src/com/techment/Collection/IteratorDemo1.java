package com.techment.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(15);
		o2.add(20);
		o2.add(35);
		o2.add(25);
		o2.add(27);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		Iterator<Integer> itr = o2.iterator();   // forward direction
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

