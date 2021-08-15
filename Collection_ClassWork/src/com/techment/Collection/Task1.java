package com.techment.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList<String> o1= new ArrayList<String>();
		o1.add("sachin");
		o1.add("ravi");
		o1.add("kumar");
		o1.add("sowmya");
		System.out.println("Element of obj o1 = "+o1);
		
		
		ArrayList<String> o2= new ArrayList<String>();
		o2.add("sourab");
		o2.add("manish");
		o2.add("sachin");
		o2.add("ankit");
		o2.add("kumar");
		System.out.println("Element of obj o2 = "+o2);
		
		o2.addAll(o1);
		System.out.println("After merge = "+o2);
		
		Set<String> set = new HashSet<>(o2);
		o2.clear();
		o2.addAll(set);
		System.out.println("remove duplicate = "+o2);
		
         Collections.sort(o2);
		System.out.println("Element After sorting = "+o2);
	}

}

