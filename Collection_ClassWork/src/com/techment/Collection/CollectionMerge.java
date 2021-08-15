package com.techment.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionMerge {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
	
		a1.add("sachin");
		a1.add("ravi");
		a1.add("kumar");
		a1.add("soumya");
		System.out.println("Batch1 members:"+a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("sourab");
		a2.add("manish");
		a2.add("sachin");
		a2.add("ankit");
		a2.add("kumar");
		System.out.println("Batch2 members:"+a2);
		
		a1.addAll(a2);
		System.out.println("Merged Arraylist: "+a1);
		a2.removeAll(a1);
		System.out.println("Remove Duplicate elements: "+a2);
		Collections.sort(a2);
		System.out.println("members of a2 after sorting "+a2);
		
		
	}		
}
