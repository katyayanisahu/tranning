package com.techment.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(1);
	hs.add(6);
	hs.add(2);
	hs.add(7);
	hs.add(11);
	hs.add(26);
	System.out.println("hashSet:"+hs);
	
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(1);
	lhs.add(6);
	lhs.add(2);
	lhs.add(7);
	lhs.add(11);
	lhs.add(26);
	lhs.add("katya");
	System.out.println("LinkedHashSet:"+lhs);
	
	TreeSet ts=new TreeSet();
	ts.add(1);
	ts.add(6);
	ts.add(2);
	ts.add(7);
	ts.add(11);
	ts.add(26);
	ts.add("katya");
	System.out.println("TreeSet:"+ts);
}
}
