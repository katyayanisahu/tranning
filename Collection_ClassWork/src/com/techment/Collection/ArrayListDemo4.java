package com.techment.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(100);
		o2.add(200);
		o2.add(70);
		o2.add(90);
		o2.add(65);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		Collections.sort(o2);
		
		System.out.println("Element After sorting = "+o2);
		
	}

}

