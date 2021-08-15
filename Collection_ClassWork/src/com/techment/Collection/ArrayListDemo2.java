package com.techment.Collection;

import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		System.out.println("size before adding element:"+obj.size());
		obj.add(1);
		obj.add("kajal");
		obj.add(25.20);
		
		System.out.println("size after adding element:"+obj.size());
		System.out.println("element in the list"+obj);
		
		obj.add(1,"hello");
		System.out.println("size after adding element:"+obj.size());
		
		obj.add("hello");
		System.out.println("element in the list after removing:"+obj);
	}	
		
}
